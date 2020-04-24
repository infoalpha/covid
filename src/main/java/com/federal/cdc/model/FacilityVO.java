package com.federal.cdc.model;

import java.io.Serializable;

public class FacilityVO implements Serializable 
{
	
	private Integer id;
	private String name;
	private String companyName;
	private String address;
	private Integer bedCapacity;
	private String inspectionDate;
	private String status;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getBedCapacity() {
		return bedCapacity;
	}
	public void setBedCapacity(Integer bedCapacity) {
		this.bedCapacity = bedCapacity;
	}
	public String getInspectionDate() {
		return inspectionDate;
	}
	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

	
}