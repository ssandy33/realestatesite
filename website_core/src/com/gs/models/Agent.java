package com.gs.models;

public class Agent {

	private boolean changed = false;
	private int id;
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
	
	
	public Agent(){}
	
	public Agent(int id, String first_name) {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		if (firstName != null)
			return firstName;
		else
			return "";
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		if (lastName != null)
			return lastName;
		else
			return "";
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		if (email != null)
			return email;
		else
			return "";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCell1() {
		if (cell1 != null)
			return cell1;
		else
			return "";
	}
	public void setCell1(String cell1) {
		this.cell1 = cell1;
	}
	public String getCell2() {
		if (cell2 != null)
			return cell2;
		else
			return "";
	}
	public void setCell2(String cell2) {
		this.cell2 = cell2;
	}
	public String getCell3() {
		if (cell3 != null)
			return cell3;
		else
			return "";
	}
	public void setCell3(String cell3) {
		this.cell3 = cell3;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public boolean isChanged() {
		return changed;
	}
	public void setChanged(boolean changed) {
		this.changed = changed;
	}
	public boolean isNoMail() {
		return noMail;
	}
	public void setNoMail(boolean noMail) {
		this.noMail = noMail;
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
	
}
