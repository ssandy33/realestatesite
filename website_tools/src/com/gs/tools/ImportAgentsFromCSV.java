package com.gs.tools;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import com.gs.database.AgentDAO;
import com.gs.database.CvsMlsListingsDAO;
import com.gs.models.Agent;
import com.gs.models.CsvMlsListing;

import au.com.bytecode.opencsv.CSVReader;

public class ImportAgentsFromCSV {
	
	public static void main(String[] args) {
		Agent agent = null;
		String strFile = "C:/trupro_agent_IA_Scott_2013828182939.csv";
		
		try {
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = 0;
			
			while ((nextLine = reader.readNext()) != null) {
				if (lineNumber > 0) {
					try {
						agent = new Agent(nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[5], nextLine[6], nextLine[7], nextLine[8], 
								nextLine[9], nextLine[10], getPhone1(nextLine[12]), getPhone2(nextLine[12]), getPhone2(nextLine[12]),
								getPhone1(nextLine[13]), getPhone2(nextLine[13]), getPhone3(nextLine[13]), getPhone1(nextLine[14]), 
								getPhone2(nextLine[14]), getPhone3(nextLine[14]), nextLine[15], getAgentType(nextLine[17]));
					} catch (Exception e) {
						e.printStackTrace();
					}
					save(agent);
				}
				lineNumber++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void save(Agent agent) {
		AgentDAO dao = new AgentDAO();
		
		dao.save(agent);
	}
	
	private static int getAgentType(String agent) {
		if ("Broker".equalsIgnoreCase(agent))
			return 1;
		
		if ("Salesperson".equalsIgnoreCase(agent))
			return 2;
		
		return 3;
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
