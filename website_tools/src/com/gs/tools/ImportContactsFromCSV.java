package com.gs.tools;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

import com.gs.database.ContactDAO;
import com.gs.database.StateDAO;
import com.gs.models.Contact;
import com.gs.models.State;

public class ImportContactsFromCSV {
	static List<State> states = null;
	static StateDAO stateDAO = new StateDAO();

	public static void main(String[] args) {
		Contact contact = null;
//		String strFile = "C:/CLRC_Updated_Member_List_May_2013.csv";
		String strFile = "C:/TRSCGlist4ssNOT OPT OUT.csv";
		
		try {
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			
			while ((nextLine = reader.readNext()) != null) {
					try {
						contact = gabby(nextLine);
					} catch (Exception e) {
						e.printStackTrace();
					}
					save(contact);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Contact gabby(String[] nextLine) {
		Contact contact = null;
		
		contact = new Contact(nextLine[0], nextLine[1], nextLine[4], nextLine[5], nextLine[8]);
		
		return contact;
	}
	
	private Contact CLPDF(String[] nextLine) {
		int stateId;
		int countryId;
		Contact contact = null;
		
		stateId = getStateId(nextLine[4]);
		countryId = getCountryId(stateId);
		contact = new Contact(nextLine[1], formatFirstName(nextLine[2]), nextLine[3], getCity(nextLine[4]),stateId,countryId,getPostalCode(nextLine[4]),
				getPhone1(nextLine[5]), getPhone2(nextLine[5]), getPhone3(nextLine[5]),nextLine[9],0);
		
		return contact;
	}
	
	private static String getPostalCode(String addy) {
		String[] splits;
		
		splits = addy.split("\\.");
		
		return splits[1].trim();
		
	}
	
	private static int getStateId(String addy) {
		State state = null;
		String[] splits;
		
		splits = addy.split(",");
		splits = splits[1].trim().split("\\.");
		
		if (states == null)
			states = stateDAO.getStates();
		
		state = findState(splits[0],states);
		
		return state.getId();
	}
	
	private static int getCountryId(int stateId) {
		if (stateId > 1 && stateId < 61)
			return 1;
		return 7;
	}
	
	private static String getCity(String s) {
		String[] splits;
		if (s.contains(",")) {
			splits = s.split(",");
			return splits[0];
		}
		return s;
	}
	
	private static String formatFirstName(String firstName) {
		String[] splits;
		if (firstName.contains("/")) {
			splits = firstName.split("/");
			return splits[0] + " & " + splits[1];
		}
		return firstName;
	}
	
	private static void save(Contact contact) {
		ContactDAO dao = new ContactDAO();
		
		dao.add(contact);
	}
	
	private static State findState(String name, List<State> states) {
		for (State state : states) {
			if (state.getAbbreviation().equalsIgnoreCase(name)) {
				return state;
			}
		}
		return null;
	}
	
	private static String getPhone1(String phone) {
		String[] splits;
		if (phone != null) {
			 splits = phone.split("-");
			 return splits[0];
		}
		
		return phone;
	}
	
	private static String getPhone2(String phone) {
		String[] splits;
		if (phone != null) {
			 splits = phone.split("-");
			 return splits[1];
		}
		
		return phone;
	}

	
	private static String getPhone3(String phone) {
		String[] splits;
		if (phone != null) {
			 splits = phone.split("-");
			 return splits[2];
		}
		
		return phone;
	}
	
}
