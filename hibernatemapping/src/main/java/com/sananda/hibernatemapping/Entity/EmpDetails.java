package com.sananda.hibernatemapping.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Employee")
public class EmpDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String empName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date joiningDate;
	@OneToMany
	private Collection<EmpAddress> empAddress = new ArrayList<EmpAddress>();
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Collection<EmpAddress> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Collection<EmpAddress> empAddress) {
		this.empAddress = empAddress;
	}
	

}
