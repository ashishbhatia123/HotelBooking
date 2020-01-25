package com.startup.HotelBooking.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Positions")
public class Positions {
	@Id
	@Column(name="position_ID")
	private String positionID;
	
	@OneToMany(mappedBy="sPosition",cascade=CascadeType.ALL)
	private List<Staff> staffID = new ArrayList<>();
	
	@Column(name="staff_position")
	private String postion;

	public Positions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Positions(String positionID, List<Staff> staffID, String postion) {
		super();
		this.positionID = positionID;
		this.staffID = staffID;
		this.postion = postion;
	}

	public String getPositionID() {
		return positionID;
	}

	public void setPositionID(String positionID) {
		this.positionID = positionID;
	}

	public List<Staff> getStaffID() {
		return staffID;
	}

	public void setStaffID(List<Staff> staffID) {
		this.staffID = staffID;
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	@Override
	public String toString() {
		return "Positions [positionID=" + positionID + ", staffID=" + staffID + ", postion=" + postion + "]";
	}
	
	
}
