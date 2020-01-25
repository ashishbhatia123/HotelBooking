package com.startup.HotelBooking.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Bookings")
public class Bookings {
	@Id
	@Column(name="booking_ID")
	private String bBookingID;
	@Column(name="bookingfrom")
	@Temporal(TemporalType.DATE)
	private Date bDateFrom;
	@Column(name="bookingTo")
	@Temporal(TemporalType.DATE)
	private Date bDateTo;
	@Column(name="roomCount")
	private String bRoomCount;
	@Column(name="adultCount")
	private int noOFAdults;
	@Column(name="childrenCount")
	private int noOfChildrens;
	
	@ManyToOne
	@JoinColumn(name="bookingStatus_ID")
	private BookingStatus bBookingStatusID;
	
	@OneToMany(mappedBy="rbBookingID",cascade=CascadeType.ALL)
	private List<RoomsBooked> RoomBookedID = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="hotel_ID")
	private Hotels bHotelID;
	
	@ManyToOne
	@JoinColumn(name="Guest_ID")
	private Guests bGuestID;
	
	@ManyToOne
	@JoinColumn(name="reservationAgent_ID")
	private ReservationsAgents bReservationAgentID;
	
	public Bookings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bookings(String bBookingID, Date bDateFrom, Date bDateTo, String bRoomCount, int noOFAdults,
			int noOfChildrens, BookingStatus bBookingStatusID, List<RoomsBooked> roomBookedID, Hotels bHotelID,
			Guests bGuestID, ReservationsAgents bReservationAgentID) {
		super();
		this.bBookingID = bBookingID;
		this.bDateFrom = bDateFrom;
		this.bDateTo = bDateTo;
		this.bRoomCount = bRoomCount;
		this.noOFAdults = noOFAdults;
		this.noOfChildrens = noOfChildrens;
		this.bBookingStatusID = bBookingStatusID;
		RoomBookedID = roomBookedID;
		this.bHotelID = bHotelID;
		this.bGuestID = bGuestID;
		this.bReservationAgentID = bReservationAgentID;
	}

	public String getbBookingID() {
		return bBookingID;
	}

	public void setbBookingID(String bBookingID) {
		this.bBookingID = bBookingID;
	}

	public Date getbDateFrom() {
		return bDateFrom;
	}

	public void setbDateFrom(Date bDateFrom) {
		this.bDateFrom = bDateFrom;
	}

	public Date getbDateTo() {
		return bDateTo;
	}

	public void setbDateTo(Date bDateTo) {
		this.bDateTo = bDateTo;
	}

	public String getbRoomCount() {
		return bRoomCount;
	}

	public void setbRoomCount(String bRoomCount) {
		this.bRoomCount = bRoomCount;
	}

	public int getNoOFAdults() {
		return noOFAdults;
	}

	public void setNoOFAdults(int noOFAdults) {
		this.noOFAdults = noOFAdults;
	}

	public int getNoOfChildrens() {
		return noOfChildrens;
	}

	public void setNoOfChildrens(int noOfChildrens) {
		this.noOfChildrens = noOfChildrens;
	}

	public BookingStatus getbBookingStatusID() {
		return bBookingStatusID;
	}

	public void setbBookingStatusID(BookingStatus bBookingStatusID) {
		this.bBookingStatusID = bBookingStatusID;
	}

	public List<RoomsBooked> getRoomBookedID() {
		return RoomBookedID;
	}

	public void setRoomBookedID(List<RoomsBooked> roomBookedID) {
		RoomBookedID = roomBookedID;
	}

	public Hotels getbHotelID() {
		return bHotelID;
	}

	public void setbHotelID(Hotels bHotelID) {
		this.bHotelID = bHotelID;
	}

	public Guests getbGuestID() {
		return bGuestID;
	}

	public void setbGuestID(Guests bGuestID) {
		this.bGuestID = bGuestID;
	}

	public ReservationsAgents getbReservationAgentID() {
		return bReservationAgentID;
	}

	public void setbReservationAgentID(ReservationsAgents bReservationAgentID) {
		this.bReservationAgentID = bReservationAgentID;
	}

	@Override
	public String toString() {
		return "Bookings [bBookingID=" + bBookingID + ", bDateFrom=" + bDateFrom + ", bDateTo=" + bDateTo
				+ ", bRoomCount=" + bRoomCount + ", noOFAdults=" + noOFAdults + ", noOfChildrens=" + noOfChildrens
				+ ", bBookingStatusID=" + bBookingStatusID + ", RoomBookedID=" + RoomBookedID + ", bHotelID=" + bHotelID
				+ ", bGuestID=" + bGuestID + ", bReservationAgentID=" + bReservationAgentID + "]";
	}
	
	
}
