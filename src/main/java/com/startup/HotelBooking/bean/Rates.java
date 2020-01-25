package com.startup.HotelBooking.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Rates")
public class Rates {
	@Id
	@Column(name="rate_ID")
	private String rRateID;
	
	@ManyToOne
	@JoinColumn(name="rRoom_ID")
	private Rooms rRoomID;
	
	@Column(name="rRate")
	private String rRate;
	@Column(name="r_bookingfrom")
	private String rFromDate;
	@Column(name="r_bookingTo")
	private String rToDate;
	
	@ManyToOne
	@JoinColumn(name="rRateType_ID")
	private RateTypes rRateTypeID;

	public Rates() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rates(String rRateID, Rooms rRoomID, String rRate, String rFromDate, String rToDate, RateTypes rRateTypeID) {
		super();
		this.rRateID = rRateID;
		this.rRoomID = rRoomID;
		this.rRate = rRate;
		this.rFromDate = rFromDate;
		this.rToDate = rToDate;
		this.rRateTypeID = rRateTypeID;
	}

	public String getrRateID() {
		return rRateID;
	}

	public void setrRateID(String rRateID) {
		this.rRateID = rRateID;
	}

	public Rooms getrRoomID() {
		return rRoomID;
	}

	public void setrRoomID(Rooms rRoomID) {
		this.rRoomID = rRoomID;
	}

	public String getrRate() {
		return rRate;
	}

	public void setrRate(String rRate) {
		this.rRate = rRate;
	}

	public String getrFromDate() {
		return rFromDate;
	}

	public void setrFromDate(String rFromDate) {
		this.rFromDate = rFromDate;
	}

	public String getrToDate() {
		return rToDate;
	}

	public void setrToDate(String rToDate) {
		this.rToDate = rToDate;
	}

	public RateTypes getrRateTypeID() {
		return rRateTypeID;
	}

	public void setrRateTypeID(RateTypes rRateTypeID) {
		this.rRateTypeID = rRateTypeID;
	}

	@Override
	public String toString() {
		return "Rates [rRateID=" + rRateID + ", rRoomID=" + rRoomID + ", rRate=" + rRate + ", rFromDate=" + rFromDate
				+ ", rToDate=" + rToDate + ", rRateTypeID=" + rRateTypeID + "]";
	}
	
	

}
