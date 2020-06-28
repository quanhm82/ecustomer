package com.ecom.customer.model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author quanhoang
 * Customer Entity as a resource
 */
@Entity
@Table
public class Customer {

	@Id
	@Column(name = "CUST_ID")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@ColumnDefault("random_uuid()")
	@Type(type = "uuid-char")
	private UUID customerId;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "FULL_NAME")
	private String fullName;
	
	@Column(name = "DOB")
	private Date dateOfBirth;
	
	@Column(name = "SEX")
	private String sex;
	
	@ManyToOne(targetEntity = CustomerRank.class)
	@JoinColumn(name = "rankId")
	private CustomerRank rank;

	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "PHONE")
	private String phone;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public CustomerRank getRank() {
		return rank;
	}

	public void setRank(CustomerRank rank) {
		this.rank = rank;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public UUID getCustomerId() {
		return customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
