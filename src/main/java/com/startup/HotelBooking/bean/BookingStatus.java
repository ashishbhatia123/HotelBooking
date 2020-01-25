package com.startup.HotelBooking.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="BookingStatus")
public class BookingStatus {
	@Id
	@Column(name="bookingStatus_ID")
	private String bsBookingStatusID;
	
	@OneToMany(mappedBy="bBookingStatusID",cascade=CascadeType.ALL)
	private List<Bookings> bookingID = new ArrayList<>();
	
	@Column(name="booking_Status")
	private String bsStatus;
	@Column(name="booking_Description")
	private String bsDescrition;
	@Column(name="booking_CreatedDate")
	private Date bsCreatedDate;
	@Column(name="booking_StatusUdatedDate")
	private Date bsStatusUdatedDate;
	public BookingStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingStatus(String bsBookingStatusID, List<Bookings> bookingID, String bsStatus, String bsDescrition,
			Date bsCreatedDate, Date bsStatusUdatedDate) {
		super();
		this.bsBookingStatusID = bsBookingStatusID;
		this.bookingID = bookingID;
		this.bsStatus = bsStatus;
		this.bsDescrition = bsDescrition;
		this.bsCreatedDate = bsCreatedDate;
		this.bsStatusUdatedDate = bsStatusUdatedDate;
	}
	public String getBsBookingStatusID() {
		return bsBookingStatusID;
	}
	public void setBsBookingStatusID(String bsBookingStatusID) {
		this.bsBookingStatusID = bsBookingStatusID;
	}
	public List<Bookings> getBookingID() {
		return bookingID;
	}
	public void setBookingID(List<Bookings> bookingID) {
		this.bookingID = bookingID;
	}
	public String getBsStatus() {
		return bsStatus;
	}
	public void setBsStatus(String bsStatus) {
		this.bsStatus = bsStatus;
	}
	public String getBsDescrition() {
		return bsDescrition;
	}
	public void setBsDescrition(String bsDescrition) {
		this.bsDescrition = bsDescrition;
	}
	public Date getBsCreatedDate() {
		return bsCreatedDate;
	}
	public void setBsCreatedDate(Date bsCreatedDate) {
		this.bsCreatedDate = bsCreatedDate;
	}
	public Date getBsStatusUdatedDate() {
		return bsStatusUdatedDate;
	}
	public void setBsStatusUdatedDate(Date bsStatusUdatedDate) {
		this.bsStatusUdatedDate = bsStatusUdatedDate;
	}
	
	@Override
	public String toString() {
		return "BookingStatus [bsBookingStatusID=" + bsBookingStatusID + ", bookingID=" + bookingID + ", bsStatus="
				+ bsStatus + ", bsDescrition=" + bsDescrition + ", bsCreatedDate=" + bsCreatedDate
				+ ", bsStatusUdatedDate=" + bsStatusUdatedDate + "]";
	} 


	
}
