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
@Table(name="Guests")
public class Guests {
	@Id
	@Column(name="guest_Id")
private String gGuestID;
@Column(name="g_FirstName")
private String gFirstName;
@Column(name="g_LastName")
private String gLastName;
@Column(name="g_Address")
private String gAddress;
@Column(name="g_Address2")
private String gAddress2;
@Column(name="g_City")
private String gCity;
@Column(name="g_State")
private String gState;
@Column(name="g_ZipCode")
private String gZipCode;
@Column(name="g_Country")
private String gCountry;
@Column(name="g_HomephoneNumber")
private String gHomephoneNumber;
@Column(name="g_CellularNumber")
private String gCellularNumber;
@Column(name="g_MailAddress")
private String gMailAddress;
@Column(name="g_Gender")
private String gGender;

@OneToMany(mappedBy="feedback_guestID",cascade=CascadeType.ALL)
private List<Feedback> gFeedbackId = new ArrayList<>();

@OneToMany(mappedBy="bGuestID",cascade=CascadeType.ALL)
private List<Bookings> BookingID = new ArrayList<>();

public Guests() {
	super();
	// TODO Auto-generated constructor stub
}

public Guests(String gGuestID, String gFirstName, String gLastName, String gAddress, String gAddress2, String gCity,
		String gState, String gZipCode, String gCountry, String gHomephoneNumber, String gCellularNumber,
		String gMailAddress, String gGender, List<Feedback> gFeedbackId, List<Bookings> bookingID) {
	super();
	this.gGuestID = gGuestID;
	this.gFirstName = gFirstName;
	this.gLastName = gLastName;
	this.gAddress = gAddress;
	this.gAddress2 = gAddress2;
	this.gCity = gCity;
	this.gState = gState;
	this.gZipCode = gZipCode;
	this.gCountry = gCountry;
	this.gHomephoneNumber = gHomephoneNumber;
	this.gCellularNumber = gCellularNumber;
	this.gMailAddress = gMailAddress;
	this.gGender = gGender;
	this.gFeedbackId = gFeedbackId;
	BookingID = bookingID;
}

public String getgGuestID() {
	return gGuestID;
}

public void setgGuestID(String gGuestID) {
	this.gGuestID = gGuestID;
}

public String getgFirstName() {
	return gFirstName;
}

public void setgFirstName(String gFirstName) {
	this.gFirstName = gFirstName;
}

public String getgLastName() {
	return gLastName;
}

public void setgLastName(String gLastName) {
	this.gLastName = gLastName;
}

public String getgAddress() {
	return gAddress;
}

public void setgAddress(String gAddress) {
	this.gAddress = gAddress;
}

public String getgAddress2() {
	return gAddress2;
}

public void setgAddress2(String gAddress2) {
	this.gAddress2 = gAddress2;
}

public String getgCity() {
	return gCity;
}

public void setgCity(String gCity) {
	this.gCity = gCity;
}

public String getgState() {
	return gState;
}

public void setgState(String gState) {
	this.gState = gState;
}

public String getgZipCode() {
	return gZipCode;
}

public void setgZipCode(String gZipCode) {
	this.gZipCode = gZipCode;
}

public String getgCountry() {
	return gCountry;
}

public void setgCountry(String gCountry) {
	this.gCountry = gCountry;
}

public String getgHomephoneNumber() {
	return gHomephoneNumber;
}

public void setgHomephoneNumber(String gHomephoneNumber) {
	this.gHomephoneNumber = gHomephoneNumber;
}

public String getgCellularNumber() {
	return gCellularNumber;
}

public void setgCellularNumber(String gCellularNumber) {
	this.gCellularNumber = gCellularNumber;
}

public String getgMailAddress() {
	return gMailAddress;
}

public void setgMailAddress(String gMailAddress) {
	this.gMailAddress = gMailAddress;
}

public String getgGender() {
	return gGender;
}

public void setgGender(String gGender) {
	this.gGender = gGender;
}

public List<Feedback> getgFeedbackId() {
	return gFeedbackId;
}

public void setgFeedbackId(List<Feedback> gFeedbackId) {
	this.gFeedbackId = gFeedbackId;
}

public List<Bookings> getBookingID() {
	return BookingID;
}

public void setBookingID(List<Bookings> bookingID) {
	BookingID = bookingID;
}

@Override
public String toString() {
	return "Guests [gGuestID=" + gGuestID + ", gFirstName=" + gFirstName + ", gLastName=" + gLastName + ", gAddress="
			+ gAddress + ", gAddress2=" + gAddress2 + ", gCity=" + gCity + ", gState=" + gState + ", gZipCode="
			+ gZipCode + ", gCountry=" + gCountry + ", gHomephoneNumber=" + gHomephoneNumber + ", gCellularNumber="
			+ gCellularNumber + ", gMailAddress=" + gMailAddress + ", gGender=" + gGender + ", gFeedbackId="
			+ gFeedbackId + ", BookingID=" + BookingID + "]";
}



}
