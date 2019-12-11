package com.sananda.hibernatemapping.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmpAddress")
public class EmpAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	
	private String street;
	
	private String city;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private EmpDetails emp;
	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

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

	public EmpDetails getEmp() {
		return emp;
	}

	public void setEmp(EmpDetails emp) {
		this.emp = emp;
	}
	
	
	
	
}
