package com.startup.HotelBooking.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Rooms")
public class Rooms {
	@Id
	@Column(name="room_ID")
	private String rRoomsID;
	
	@ManyToOne
	@JoinColumn(name="rHotel_ID")
	private Hotels rHotelID;
	
	@Column(name="r_Floor")
	private String rFloor;
	@Column(name="r_RoomNumber")
	private String rRoomNumber;
	@Column(name="r_Descrition")
	private String rDescrition;
	
	
	@ManyToOne
	@JoinColumn(name="rRoomTypes_ID")
	private RoomTypes rRoomTypeID;
	
	
	@ManyToOne
	@JoinColumn(name="rRoomStatus_ID")
	private RoomStatus rRoomStatusID;
	
	@OneToMany(mappedBy="rRoomID",cascade=CascadeType.ALL)
	private List<Rates> rRateID = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="Room_Staff"
					,joinColumns=@JoinColumn(name="roomID")
					,inverseJoinColumns= {@JoinColumn(name="staffID")}
			  )
	private List<Staff> staffId = new ArrayList<>();
	
	@OneToMany(mappedBy="rbRoomID",cascade=CascadeType.ALL)
	private List<RoomsBooked> roomBookedID = new ArrayList<>();
	
	@OneToMany(mappedBy="pRoomID",cascade=CascadeType.ALL)
	private List<Payments> paymentID = new ArrayList<>();

	public Rooms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rooms(String rRoomsID, Hotels rHotelID, String rFloor, String rRoomNumber, String rDescrition,
			RoomTypes rRoomTypeID, RoomStatus rRoomStatusID, List<Rates> rRateID, List<Staff> staffId,
			List<RoomsBooked> roomBookedID, List<Payments> paymentID) {
		super();
		this.rRoomsID = rRoomsID;
		this.rHotelID = rHotelID;
		this.rFloor = rFloor;
		this.rRoomNumber = rRoomNumber;
		this.rDescrition = rDescrition;
		this.rRoomTypeID = rRoomTypeID;
		this.rRoomStatusID = rRoomStatusID;
		this.rRateID = rRateID;
		this.staffId = staffId;
		this.roomBookedID = roomBookedID;
		this.paymentID = paymentID;
	}

	public String getrRoomsID() {
		return rRoomsID;
	}

	public void setrRoomsID(String rRoomsID) {
		this.rRoomsID = rRoomsID;
	}

	public Hotels getrHotelID() {
		return rHotelID;
	}

	public void setrHotelID(Hotels rHotelID) {
		this.rHotelID = rHotelID;
	}

	public String getrFloor() {
		return rFloor;
	}

	public void setrFloor(String rFloor) {
		this.rFloor = rFloor;
	}

	public String getrRoomNumber() {
		return rRoomNumber;
	}

	public void setrRoomNumber(String rRoomNumber) {
		this.rRoomNumber = rRoomNumber;
	}

	public String getrDescrition() {
		return rDescrition;
	}

	public void setrDescrition(String rDescrition) {
		this.rDescrition = rDescrition;
	}

	public RoomTypes getrRoomTypeID() {
		return rRoomTypeID;
	}

	public void setrRoomTypeID(RoomTypes rRoomTypeID) {
		this.rRoomTypeID = rRoomTypeID;
	}

	public RoomStatus getrRoomStatusID() {
		return rRoomStatusID;
	}

	public void setrRoomStatusID(RoomStatus rRoomStatusID) {
		this.rRoomStatusID = rRoomStatusID;
	}

	public List<Rates> getrRateID() {
		return rRateID;
	}

	public void setrRateID(List<Rates> rRateID) {
		this.rRateID = rRateID;
	}

	public List<Staff> getStaffId() {
		return staffId;
	}

	public void setStaffId(List<Staff> staffId) {
		this.staffId = staffId;
	}

	public List<RoomsBooked> getRoomBookedID() {
		return roomBookedID;
	}

	public void setRoomBookedID(List<RoomsBooked> roomBookedID) {
		this.roomBookedID = roomBookedID;
	}

	public List<Payments> getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(List<Payments> paymentID) {
		this.paymentID = paymentID;
	}

	@Override
	public String toString() {
		return "Rooms [rRoomsID=" + rRoomsID + ", rHotelID=" + rHotelID + ", rFloor=" + rFloor + ", rRoomNumber="
				+ rRoomNumber + ", rDescrition=" + rDescrition + ", rRoomTypeID=" + rRoomTypeID + ", rRoomStatusID="
				+ rRoomStatusID + ", rRateID=" + rRateID + ", staffId=" + staffId + ", roomBookedID=" + roomBookedID
				+ ", paymentID=" + paymentID + "]";
	}
	
	
	
}
