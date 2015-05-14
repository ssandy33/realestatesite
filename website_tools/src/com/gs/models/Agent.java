package com.gs.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Agent {

	private int id;
	private int agentType;
	private String firstName;
	private String lastName;
	private String middleName;
	private String fullName;
	private String email;
	private String address;
	private String address2;
	private String suite;
	private String city;
	private String state;
	private String zipCode;
	private String phone1;
	private String phone2;
	private String phone3;
	private String cell1;
	private String cell2;
	private String cell3;
	private String fax1;
	private String fax2;
	private String fax3;
	private boolean noMail;
	private String guid;
	private boolean testAccount;
	private String officeName;

	
	public Agent(ResultSet rs) {
		
		try {
			this.setId(rs.getInt("id"));
			this.setFirstName(rs.getString("first_name"));
			this.setLastName(rs.getString("last_name"));
			this.setEmail(rs.getString("email"));
			this.setNoMail(rs.getBoolean("no_mail"));
		} catch (SQLException e) {}
	}
	
	public Agent(String fullName, String firstName, String middleName, String lastName, String officeName, String address, String address2, String city,
			String state, String zipCode, String phone1, String phone2, String phone3, String fax1, String fax2, String fax3, String cell1, String cell2, 
			String cell3, String email, int agentType) {
		this.fullName = fullName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.officeName = officeName;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.fax1 = fax1;
		this.fax2 = fax2;
		this.fax3 = fax3;
		this.cell1 = cell1;
		this.cell2 = cell2;
		this.cell3 = cell3;
		this.email = email;
		this.noMail = false;
		this.testAccount = false;
		this.agentType = agentType;
	}
	
	public Agent() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public String getCell1() {
		return cell1;
	}
	public void setCell1(String cell1) {
		this.cell1 = cell1;
	}
	public String getCell2() {
		return cell2;
	}
	public void setCell2(String cell2) {
		this.cell2 = cell2;
	}
	public String getCell3() {
		return cell3;
	}
	public void setCell3(String cell3) {
		this.cell3 = cell3;
	}
	public boolean isNoMail() {
		return noMail;
	}
	public void setNoMail(boolean noMail) {
		this.noMail = noMail;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getFax1() {
		return fax1;
	}
	public void setFax1(String fax1) {
		this.fax1 = fax1;
	}
	public String getFax2() {
		return fax2;
	}
	public void setFax2(String fax2) {
		this.fax2 = fax2;
	}
	public String getFax3() {
		return fax3;
	}
	public void setFax3(String fax3) {
		this.fax3 = fax3;
	}
	public boolean isTestAccount() {
		return testAccount;
	}
	public void setTestAccount(boolean testAccount) {
		this.testAccount = testAccount;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public int getAgentType() {
		return agentType;
	}
	public void setAgentType(int agentType) {
		this.agentType = agentType;
	}
	
}
