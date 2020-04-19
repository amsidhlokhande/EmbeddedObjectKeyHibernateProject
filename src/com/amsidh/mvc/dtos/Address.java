/**
 * 
 */
package com.amsidh.mvc.dtos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author VIRU
 * 
 */
/*
 * In order to mark this class as valueobject we need to add Embeddable
 * annotation.Its optional if it used as marking @Embedded in its usable class
 */
@Embeddable
public class Address {
	
	@Column(name="STREET")
	private String street;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="PINCODE")
	private Long pincode;

	/**
 * 
 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param pincode
	 */
	public Address(String street, String city, String state, Long pincode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pincode
	 */
	public Long getPincode() {
		return pincode;
	}

	/**
	 * @param pincode
	 *            the pincode to set
	 */
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

}
