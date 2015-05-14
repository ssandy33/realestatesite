package com.gs.tools;

import java.io.FileReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.gs.database.CvsMlsListingsDAO;
import com.gs.database.CvsMlsListingsSummaryDAO;
import com.gs.database.ListingsDAO;
import com.gs.models.Listing;
import com.gs.utils.GenUtils;

import au.com.bytecode.opencsv.CSVReader;

public class ImportListingsFromCSV {
	
	private static java.sql.Date parseDate(String s) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
		DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
		java.util.Date date = null;
		if (s.equals(""))
			s = "1-1-1971";
		
		try {
			date = format.parse(s);
		} catch (ParseException e) {
			System.out.println("Parsing " + s + " failed for format dd/MM/yyyy.  Attempting yyyy-MM-dd");
			try {
				date = format2.parse(s);
			} catch (ParseException e2) {
				System.out.println("Parsing " + s + " failed for format yyyy-MM-dd.");
			}
		}
		
		return new java.sql.Date(date.getTime());
	}
	
	private static String formatDate(String s) {
		return s;
	}
	
	private static String parseInt(String s) {
		if (s.equals(""))
			return "-99";
		else if (s.contains("."))
			return s.substring(0, s.indexOf("."));
		else
			return s;
	}
	
	public static void save(Listing listing) {
		ListingsDAO dao = new ListingsDAO();
		
		dao.add(listing);
	}
	
	public static void main(String[] args) {

		Listing listing = null;
//C:/Users/shawn.sandy/Downloads/textexport.csv
		try {
			String strFile = args[0];
			String mainImage = args[1];
			
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = 0;
			while ((nextLine = reader.readNext()) != null) {
				if (lineNumber > 0) {
					try {
						listing = new Listing(nextLine[1], nextLine[2], nextLine[3], nextLine[4], parseDate(nextLine[13]),
								nextLine[23], nextLine[24], Float.parseFloat(nextLine[26]), nextLine[33], nextLine[35],
								nextLine[36], nextLine[39], nextLine[41], nextLine[42], nextLine[43], nextLine[44], nextLine[45],
								nextLine[50], Integer.parseInt(parseInt(nextLine[65])),Float.valueOf(nextLine[66]), 
								nextLine[76], nextLine[85], nextLine[102],
								nextLine[122],Integer.parseInt(parseInt(nextLine[0])), formatDate(nextLine[55]), nextLine[77], nextLine[112], 
								Float.parseFloat(nextLine[74]), nextLine[146], null, null, nextLine[72], nextLine[7], nextLine[84], 
								nextLine[98], nextLine[99], nextLine[100], nextLine[81], 
								GenUtils.parseDateYear(nextLine[75]), 
								Float.valueOf(nextLine[74]), 
								Integer.parseInt(parseInt(nextLine[114])), 
								Integer.parseInt(parseInt(nextLine[115])), 
								Integer.parseInt(parseInt(nextLine[116])), 
								nextLine[95], mainImage);
					} catch (Exception e) {
						System.out.println("Line Number Error : " + lineNumber);
						System.out.println(e.toString());
						System.out.println("----------------");
					}
					save(listing);
				}

				lineNumber++;

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}