package com.soap;

public class Customer {

	private int id;

	private String customerName;

	private String customerLastName;

	private Address address;

	public Customer() {
	}

	public Customer(String customerName, String customerLastName) {
		super();
		this.customerName = customerName;
		this.customerLastName = customerLastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", customerLastName=" + customerLastName
				+ ", address=" + address + "]";
	}

}
