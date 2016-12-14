package com.lalit.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 3680593028470198824L;
	private int id;
	private String name = "";
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
