package com.gs.models;

import java.sql.Date;

public class CsvMlsListingsSummary {
	Date dateUpdated;
	String tableToUse;
	
	public Date getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	public String getTableToUse() {
		return tableToUse;
	}
	public void setTableToUse(String tableToUse) {
		this.tableToUse = tableToUse;
	}
}
