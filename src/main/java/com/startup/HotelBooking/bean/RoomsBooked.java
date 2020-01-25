package com.startup.HotelBooking.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="RoomsBooked")
public class RoomsBooked {
	@Id
	@Column(name="roomBooked_ID")
	private String rbRoomBookedID;
	
	@ManyToOne
	@JoinColumn(name="booking_ID")
	private Bookings rbBookingID;
	
	@ManyToOne
	@JoinColumn(name="Room_ID")
	private Rooms rbRoomID;
	
	@Column(name="roomBooked_Rate")
	private double rbRoomRate;

	public RoomsBooked() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomsBooked(String rbRoomBookedID, Bookings rbBookingID, Rooms rbRoomID, double rbRoomRate) {
		super();
		this.rbRoomBookedID = rbRoomBookedID;
		this.rbBookingID = rbBookingID;
		this.rbRoomID = rbRoomID;
		this.rbRoomRate = rbRoomRate;
	}

	public String getRbRoomBookedID() {
		return rbRoomBookedID;
	}

	public void setRbRoomBookedID(String rbRoomBookedID) {
		this.rbRoomBookedID = rbRoomBookedID;
	}

	public Bookings getRbBookingID() {
		return rbBookingID;
	}

	public void setRbBookingID(Bookings rbBookingID) {
		this.rbBookingID = rbBookingID;
	}

	public Rooms getRbRoomID() {
		return rbRoomID;
	}

	public void setRbRoomID(Rooms rbRoomID) {
		this.rbRoomID = rbRoomID;
	}

	public double getRbRoomRate() {
		return rbRoomRate;
	}

	public void setRbRoomRate(double rbRoomRate) {
		this.rbRoomRate = rbRoomRate;
	}

	@Override
	public String toString() {
		return "RoomsBooked [rbRoomBookedID=" + rbRoomBookedID + ", rbBookingID=" + rbBookingID + ", rbRoomID="
				+ rbRoomID + ", rbRoomRate=" + rbRoomRate + "]";
	}
	
	

}
