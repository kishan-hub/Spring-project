package com.kishan.PandCnamespace;

public class Address {
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private int zip;
	
	private String country;

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}

	public Address(String addressLine1, String addressLine2, String city, String state, int zip, String country) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}


}
