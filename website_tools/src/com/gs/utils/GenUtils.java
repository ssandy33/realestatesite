package com.gs.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GenUtils {
	
	public static String formatAsInt(String s) {
		if (s.contains("."))
			return s.substring(0, s.indexOf("."));
		else
			return s;
	}
	
	public static java.sql.Date parseDateYear(String s) {
		DateFormat format = new SimpleDateFormat("yyyy", Locale.US);
		java.util.Date date = null;
		if (s.equals(""))
			s = "1-1-1971";
		
		try {
			date = format.parse(s);
		} catch (ParseException e) {}
		
		return new java.sql.Date(date.getTime());
	}
	
	public static int parseInt(String sIn) {
		try {
			int nOutput = java.lang.Integer.parseInt(sIn);
			return nOutput;
		} catch (Exception e) {
			return 0;
		}
	}	

    public static boolean parseBoolean(String sValue) {
		if (sValue == null 
        || sValue.equalsIgnoreCase("false") 
        || sValue.equalsIgnoreCase("f") 
        || sValue.equalsIgnoreCase("n")
        || sValue.equalsIgnoreCase("no"))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static String parseString(String sIn)
	{
		String sOut = "";
		
        if (sIn == null)
        {
            sIn = "";
        }
        
		try
		{
			sOut = sIn + "";
		}
		catch (Exception e)
		{
			sOut = "";
		}
		
		return sOut.trim();
	}
	
	public static java.sql.Timestamp parseSqlTimestamp(String sIn)
	{
		Timestamp ts = null;
		SimpleDateFormat df;
		String[] dt;
		
		if (sIn.length() > 0)
		{
			dt = sIn.split("T");
			df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			
			try {
				ts = new Timestamp(df.parse(dt[0] + " " + dt[1]).getTime());
			} catch (ParseException e) {
				return null;
			}
		}
		
		return ts;
	}
	
	public static String formatNumber(String pattern, double value) {
		DecimalFormat formatter = new DecimalFormat(pattern);
		return formatter.format(value);
	}
	
	public static String formatDate(String pattern, Date d) {
		 SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(pattern);
	     return DATE_FORMAT.format(d); 
	}
	
	public static String formatDate(String pattern, Timestamp ts) {
		return new SimpleDateFormat(pattern).format(ts);
	}
	
}
