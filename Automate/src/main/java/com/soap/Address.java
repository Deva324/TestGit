package com.soap;

public class Address {

	private int id;

	private String houseNumber;

	private String street;
	private String landMark;

	private String city;

	private String country;

	private long pincode;

	public Address() {
	}

	public Address(String houseNumber, String street, String landMark, String city, String country, long pincode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.landMark = landMark;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber + ", street=" + street + ", landMark=" + landMark
				+ ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}

}
