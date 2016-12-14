package com.lalit.serialization;

import java.io.Serializable;

public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4725423769723875183L;
	private String street = "";
	private String city = "";
	private String state = "";
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	
	public String toString(){
		return this.getStreet()+"\t"+this.getCity()+"\t"+this.getState();
	}
}
