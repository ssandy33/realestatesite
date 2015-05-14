package com.gs.models;

public class Contact {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
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
	private int bedroom;
	private int bath;
	private String minPrice;
	private String maxPrice;
	private int noMail;
	private String guid;
	private int acquisitionMethodId;
	
	public Contact(){}
	
	public Contact(String firstName, String lastName, String email,
			String address, String suite, String city, String state,
			String zipCode, String phone1, String phone2, String phone3,
			String cell1, String cell2, String cell3, int bedroom, int bath,
			String minPrice, String maxPrice, int noMail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.suite = suite;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.cell1 = cell1;
		this.cell2 = cell2;
		this.cell3 = cell3;
		this.bedroom = bedroom;
		this.bath = bath;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.noMail = noMail;
	}
	
	public Contact(String firstName, String lastName, String email,
			String phone1, String phone2, String phone3, int acquisitionMethodId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.acquisitionMethodId = acquisitionMethodId;
	}
	
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
	public int getBedroom() {
		return bedroom;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	public int getBath() {
		return bath;
	}
	public void setBath(int bath) {
		this.bath = bath;
	}
	public String getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}
	public String getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}
	public int getNoMail() {
		return noMail;
	}
	public void setNoMail(int noMail) {
		this.noMail = noMail;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public int getAcquisitionMethodId() {
		return acquisitionMethodId;
	}

	public void setAcquisitionMethodId(int acquisitionMethodId) {
		this.acquisitionMethodId = acquisitionMethodId;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public String getPhone() {
		return this.phone1 + " " + this.phone2 + " " + this.phone3;
	}
}
