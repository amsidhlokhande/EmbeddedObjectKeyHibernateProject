/**
 * 
 */
package com.amsidh.mvc.dtos;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VIRU
 * 
 */
@Entity(name = "UserDetails")
@Table(name = "USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Integer userId;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "EMAIL_ID")
	private String emailId;

	/*
	 * Here ValueObject Address is added to UserDetails.ValueObject does not
	 * have value it own.So it has meaning when it include with some other other
	 * object.We mark this as @Embedded or @Embeddable over it's class.at any
	 * one place or both the place is acceptable i.e. .Its optional if it used
	 * as marking @Embeddable in its class declaration
	 */
	
	private Address permenentAddress;
	
	@Embedded
	@AttributeOverrides(value={
			@AttributeOverride( name="street", column=@Column(name="OFFICE_STREET")),
			@AttributeOverride( name="city", column=@Column(name="OFFICE_CITY")),
			@AttributeOverride( name="state", column=@Column(name="OFFICE_STATE")),
			@AttributeOverride( name="pincode", column=@Column(name="OFFICE_PINCODE"))
			})
	private Address officeAddress;

	@Embedded
	@AttributeOverrides(value={
			@AttributeOverride( name="street", column=@Column(name="HOME_STREET")),
			@AttributeOverride( name="city", column=@Column(name="HOME_CITY")),
			@AttributeOverride( name="state", column=@Column(name="HOME_STATE")),
			@AttributeOverride( name="pincode", column=@Column(name="HOME_PINCODE"))
			})
	private Address homeAddress;
	/**
	 * 
	 */
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param userName
	 * @param emailId
	 * @param address
	 */
	public UserDetails(Integer userId, String userName, String emailId,
			Address officeAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.officeAddress = officeAddress;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	
	/**
	 * @return the officeAddress
	 */
	public Address getOfficeAddress() {
		return officeAddress;
	}

	/**
	 * @param officeAddress the officeAddress to set
	 */
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	/**
	 * @return the homeAddress
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}

	/**
	 * @param homeAddress the homeAddress to set
	 */
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	/**
	 * @return the permenentAddress
	 */
	public Address getPermenentAddress() {
		return permenentAddress;
	}

	/**
	 * @param permenentAddress the permenentAddress to set
	 */
	public void setPermenentAddress(Address permenentAddress) {
		this.permenentAddress = permenentAddress;
	}
	

	
}
