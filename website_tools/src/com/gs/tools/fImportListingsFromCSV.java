package com.gs.tools;

import java.io.FileReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.gs.database.CvsMlsListingsDAO;
import com.gs.database.CvsMlsListingsSummaryDAO;
import com.gs.models.CsvMlsListing;
import com.gs.models.CsvMlsListingsSummary;

import au.com.bytecode.opencsv.CSVReader;

public class fImportListingsFromCSV {
	
	private static String parseDate(String s) {
		if (s.equals(""))
			return "1-1-1971";
		else
			return s;
	}
	
	private static String formatDate(String s) {
		return s;
	}
	
	private static String parseInt(String s) {
		if (s.equals(""))
			return "-99";
		else
			return s;
	}
	
	public static void save(CsvMlsListing cvsMlsListing) {
		CvsMlsListingsDAO dao = new CvsMlsListingsDAO();
		
		dao.addOpenHouse(cvsMlsListing);
	}
	
	public static void voidAllOpenHouses() {
		CvsMlsListingsDAO dao = new CvsMlsListingsDAO();
		
		dao.setOffStatusAllOpenHouses();
	}
	
	public static void main(String[] args) {

		CsvMlsListing cvsMlListing = null;
		CsvMlsListingsSummary cvsMlsListingSummary = null;
		int searchArea;
//C:/Users/shawn.sandy/Downloads/textexport.csv
		try {
			String strFile = args[0];
			String mlsUrl = args[1];
			String openDates = args[2];
			
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = 0;
			while ((nextLine = reader.readNext()) != null) {
				if (lineNumber > 0) {
					try {
						cvsMlListing = new CsvMlsListing(nextLine[1],
														  nextLine[2], 
														  nextLine[3], 
														  nextLine[4], 
														 Date.valueOf(parseDate(nextLine[13])),
								nextLine[23], nextLine[24], Float.parseFloat(nextLine[26]), nextLine[33], nextLine[35],
								nextLine[36], nextLine[39], nextLine[41], nextLine[42], nextLine[43], nextLine[44], nextLine[45],
								nextLine[50], Integer.parseInt(parseInt(nextLine[65])),Float.valueOf(nextLine[66]), 
								nextLine[76], nextLine[85], nextLine[102],
								nextLine[143],Integer.parseInt(parseInt(nextLine[0])), formatDate(nextLine[55]), nextLine[77], nextLine[112], 
								Float.parseFloat(nextLine[74]), nextLine[125], mlsUrl, openDates);
					} catch (Exception e) {
						System.out.println("Line Number Error : " + lineNumber);
						System.out.println(e.toString());
						System.out.println("----------------");
					}
					voidAllOpenHouses();
					save(cvsMlListing);
				}

				lineNumber++;

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}