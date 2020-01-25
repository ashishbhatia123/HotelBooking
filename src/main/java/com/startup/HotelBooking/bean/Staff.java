package com.startup.HotelBooking.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Staff")
public class Staff {
	@Id
	@Column(name="staff_ID")
	private String StaffID;
	@Column(name="s_FirstName")
	private String sFirstName;
	@Column(name="s_LastName")
	private String sLastName;
	@Column(name="s_Address")
	private String sAddress;
	@Column(name="s_Address2")
	private String sAddress2;
	@Column(name="s_City")
	private String sCity;
	@Column(name="s_State")
	private String sState;
	@Column(name="s_ZipCode")
	private String sZipCode;
	@Column(name="s_Country")
	private String sCountry;
	@Column(name="s_HomephoneNumber")
	private String sHomephoneNumber;
	@Column(name="s_CellularNumber")
	private String sCellularNumber;
	@Column(name="s_MailAddress")
	private String sMailAddress;
	@Column(name="s_Gender")
	private String sGender;
	
	@ManyToOne
	@JoinColumn(name="s_position_ID")
	private Positions sPosition;
	
	@ManyToMany(mappedBy="staffId",cascade=CascadeType.ALL)
	private List<Rooms> RoomID  = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="sHotelID")
	private Hotels hotelID;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String staffID, String sFirstName, String sLastName, String sAddress, String sAddress2, String sCity,
			String sState, String sZipCode, String sCountry, String sHomephoneNumber, String sCellularNumber,
			String sMailAddress, String sGender, Positions sPosition, List<Rooms> roomID, Hotels hotelID) {
		super();
		StaffID = staffID;
		this.sFirstName = sFirstName;
		this.sLastName = sLastName;
		this.sAddress = sAddress;
		this.sAddress2 = sAddress2;
		this.sCity = sCity;
		this.sState = sState;
		this.sZipCode = sZipCode;
		this.sCountry = sCountry;
		this.sHomephoneNumber = sHomephoneNumber;
		this.sCellularNumber = sCellularNumber;
		this.sMailAddress = sMailAddress;
		this.sGender = sGender;
		this.sPosition = sPosition;
		RoomID = roomID;
		this.hotelID = hotelID;
	}

	public String getStaffID() {
		return StaffID;
	}

	public void setStaffID(String staffID) {
		StaffID = staffID;
	}

	public String getsFirstName() {
		return sFirstName;
	}

	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsAddress2() {
		return sAddress2;
	}

	public void setsAddress2(String sAddress2) {
		this.sAddress2 = sAddress2;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	public String getsState() {
		return sState;
	}

	public void setsState(String sState) {
		this.sState = sState;
	}

	public String getsZipCode() {
		return sZipCode;
	}

	public void setsZipCode(String sZipCode) {
		this.sZipCode = sZipCode;
	}

	public String getsCountry() {
		return sCountry;
	}

	public void setsCountry(String sCountry) {
		this.sCountry = sCountry;
	}

	public String getsHomephoneNumber() {
		return sHomephoneNumber;
	}

	public void setsHomephoneNumber(String sHomephoneNumber) {
		this.sHomephoneNumber = sHomephoneNumber;
	}

	public String getsCellularNumber() {
		return sCellularNumber;
	}

	public void setsCellularNumber(String sCellularNumber) {
		this.sCellularNumber = sCellularNumber;
	}

	public String getsMailAddress() {
		return sMailAddress;
	}

	public void setsMailAddress(String sMailAddress) {
		this.sMailAddress = sMailAddress;
	}

	public String getsGender() {
		return sGender;
	}

	public void setsGender(String sGender) {
		this.sGender = sGender;
	}

	public Positions getsPosition() {
		return sPosition;
	}

	public void setsPosition(Positions sPosition) {
		this.sPosition = sPosition;
	}

	public List<Rooms> getRoomID() {
		return RoomID;
	}

	public void setRoomID(List<Rooms> roomID) {
		RoomID = roomID;
	}

	public Hotels getHotelID() {
		return hotelID;
	}

	public void setHotelID(Hotels hotelID) {
		this.hotelID = hotelID;
	}

	@Override
	public String toString() {
		return "Staff [StaffID=" + StaffID + ", sFirstName=" + sFirstName + ", sLastName=" + sLastName + ", sAddress="
				+ sAddress + ", sAddress2=" + sAddress2 + ", sCity=" + sCity + ", sState=" + sState + ", sZipCode="
				+ sZipCode + ", sCountry=" + sCountry + ", sHomephoneNumber=" + sHomephoneNumber + ", sCellularNumber="
				+ sCellularNumber + ", sMailAddress=" + sMailAddress + ", sGender=" + sGender + ", sPosition="
				+ sPosition + ", RoomID=" + RoomID + ", hotelID=" + hotelID + "]";
	}

	
	

}
