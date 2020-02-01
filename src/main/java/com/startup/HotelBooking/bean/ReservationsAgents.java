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
@Table(name="ReservationsAgents")
public class ReservationsAgents {
	@Id
	@Column(name="reservationAgent_ID")
	private String raReservationAgentID;
	@Column(name="ra_FirstName")
	private String raFirstName;
	@Column(name="ra_LastName")
	private String ra_LastName;
	@Column(name="ra_Address")
	private String raAddress;
	@Column(name="ra_Address2")
	private String raAddress2;
	@Column(name="ra_City")
	private String raCity;
	@Column(name="ra_State")
	private String raState;
	@Column(name="ra_ZipCode")
	private String raZipCode;
	@Column(name="ra_Country")
	private String raCountry;
	@Column(name="ra_HomephoneNumber")
	private String raHomephoneNumber;
	@Column(name="ra_CellularNumber")
	private String raCellularNumber;
	@Column(name="ra_MailAddress")
	private String raMailAddress;
	@Column(name="ra_Gender")
	private String raGender;
	@Column(name="ra_IsActive")
	private Boolean isActive;
	
	@OneToMany(mappedBy="bReservationAgentID",cascade=CascadeType.ALL)
	private List<Bookings> bookingID = new ArrayList<>();

	public ReservationsAgents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservationsAgents(String raReservationAgentID, String raFirstName, String ra_LastName, String raAddress,
			String raAddress2, String raCity, String raState, String raZipCode, String raCountry,
			String raHomephoneNumber, String raCellularNumber, String raMailAddress, String raGender, Boolean isActive,
			List<Bookings> bookingID) {
		super();
		this.raReservationAgentID = raReservationAgentID;
		this.raFirstName = raFirstName;
		this.ra_LastName = ra_LastName;
		this.raAddress = raAddress;
		this.raAddress2 = raAddress2;
		this.raCity = raCity;
		this.raState = raState;
		this.raZipCode = raZipCode;
		this.raCountry = raCountry;
		this.raHomephoneNumber = raHomephoneNumber;
		this.raCellularNumber = raCellularNumber;
		this.raMailAddress = raMailAddress;
		this.raGender = raGender;
		this.isActive = isActive;
		this.bookingID = bookingID;
	}

	public String getRaReservationAgentID() {
		return raReservationAgentID;
	}

	public void setRaReservationAgentID(String raReservationAgentID) {
		this.raReservationAgentID = raReservationAgentID;
	}

	public String getRaFirstName() {
		return raFirstName;
	}

	public void setRaFirstName(String raFirstName) {
		this.raFirstName = raFirstName;
	}

	public String getRa_LastName() {
		return ra_LastName;
	}

	public void setRa_LastName(String ra_LastName) {
		this.ra_LastName = ra_LastName;
	}

	public String getRaAddress() {
		return raAddress;
	}

	public void setRaAddress(String raAddress) {
		this.raAddress = raAddress;
	}

	public String getRaAddress2() {
		return raAddress2;
	}

	public void setRaAddress2(String raAddress2) {
		this.raAddress2 = raAddress2;
	}

	public String getRaCity() {
		return raCity;
	}

	public void setRaCity(String raCity) {
		this.raCity = raCity;
	}

	public String getRaState() {
		return raState;
	}

	public void setRaState(String raState) {
		this.raState = raState;
	}

	public String getRaZipCode() {
		return raZipCode;
	}

	public void setRaZipCode(String raZipCode) {
		this.raZipCode = raZipCode;
	}

	public String getRaCountry() {
		return raCountry;
	}

	public void setRaCountry(String raCountry) {
		this.raCountry = raCountry;
	}

	public String getRaHomephoneNumber() {
		return raHomephoneNumber;
	}

	public void setRaHomephoneNumber(String raHomephoneNumber) {
		this.raHomephoneNumber = raHomephoneNumber;
	}

	public String getRaCellularNumber() {
		return raCellularNumber;
	}

	public void setRaCellularNumber(String raCellularNumber) {
		this.raCellularNumber = raCellularNumber;
	}

	public String getRaMailAddress() {
		return raMailAddress;
	}

	public void setRaMailAddress(String raMailAddress) {
		this.raMailAddress = raMailAddress;
	}

	public String getRaGender() {
		return raGender;
	}

	public void setRaGender(String raGender) {
		this.raGender = raGender;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public List<Bookings> getBookingID() {
		return bookingID;
	}

	public void setBookingID(List<Bookings> bookingID) {
		this.bookingID = bookingID;
	}

	@Override
	public String toString() {
		return "ReservationsAgents [raReservationAgentID=" + raReservationAgentID + ", raFirstName=" + raFirstName
				+ ", ra_LastName=" + ra_LastName + ", raAddress=" + raAddress + ", raAddress2=" + raAddress2
				+ ", raCity=" + raCity + ", raState=" + raState + ", raZipCode=" + raZipCode + ", raCountry="
				+ raCountry + ", raHomephoneNumber=" + raHomephoneNumber + ", raCellularNumber=" + raCellularNumber
				+ ", raMailAddress=" + raMailAddress + ", raGender=" + raGender + ", isActive=" + isActive
				+ ", bookingID=" + bookingID + "]";
	}

	


	
	

}
