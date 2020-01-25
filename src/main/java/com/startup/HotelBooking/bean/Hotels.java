package com.startup.HotelBooking.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Hotels")
public class Hotels {
	@Id
	@Column(name="hotel_ID")
	private String hHotelID;
	@Column(name="h_hotelcode")
	private String hhotelcode;
	@Column(name="h_Name")
	private String hName;
	@Column(name="h_Motto")
	private String hMotto;
	@Column(name="h_Address")
	private String hAddress;
	@Column(name="h_Address2")
	private String hAddress2;
	@Column(name="h_City")
	private String hCity;
	@Column(name="h_State")
	private String hState;
	@Column(name="h_ZipCode")
	private String hZipCode;
	@Column(name="h_Country")
	private String hCountry;
	@Column(name="h_MainPhoneNumber")
	private String hMainPhoneNumber;
	@Column(name="h_FaxNumber")
	private String hFaxNumber;
	@Column(name="h_TollFreeNumber")
	private String hTollFreeNumber;
	@Column(name="h_CompanyMailAddress")
	private String hCompanyMailAddress;
	@Column(name="h_WebsiteAddress")
	private String hWebsiteAddress;
	@Column(name="h_MainImage")
	private String hMainImage;
	
	@ManyToMany(mappedBy="hotelID",cascade=CascadeType.ALL)
	private List<HotelImages> hImagePath = new ArrayList<>();
	
	@OneToMany(mappedBy="feedbackHotelID",cascade=CascadeType.ALL)
	private List<Feedback> hHotelFeedbackID = new ArrayList<>();
	
	@OneToMany(mappedBy="rHotelID",cascade=CascadeType.ALL)
	private List<Rooms> hRoomID = new ArrayList<>();
	
	@OneToMany(mappedBy="bHotelID",cascade=CascadeType.ALL)
	private List<Bookings> BookingID = new ArrayList<>();
	
	@OneToMany(mappedBy="hotelID",cascade=CascadeType.ALL)
	private List<Staff> staffID = new ArrayList<>();

	public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotels(String hHotelID, String hhotelcode, String hName, String hMotto, String hAddress, String hAddress2,
			String hCity, String hState, String hZipCode, String hCountry, String hMainPhoneNumber, String hFaxNumber,
			String hTollFreeNumber, String hCompanyMailAddress, String hWebsiteAddress, String hMainImage,
			List<HotelImages> hImagePath, List<Feedback> hHotelFeedbackID, List<Rooms> hRoomID,
			List<Bookings> bookingID, List<Staff> staffID) {
		super();
		this.hHotelID = hHotelID;
		this.hhotelcode = hhotelcode;
		this.hName = hName;
		this.hMotto = hMotto;
		this.hAddress = hAddress;
		this.hAddress2 = hAddress2;
		this.hCity = hCity;
		this.hState = hState;
		this.hZipCode = hZipCode;
		this.hCountry = hCountry;
		this.hMainPhoneNumber = hMainPhoneNumber;
		this.hFaxNumber = hFaxNumber;
		this.hTollFreeNumber = hTollFreeNumber;
		this.hCompanyMailAddress = hCompanyMailAddress;
		this.hWebsiteAddress = hWebsiteAddress;
		this.hMainImage = hMainImage;
		this.hImagePath = hImagePath;
		this.hHotelFeedbackID = hHotelFeedbackID;
		this.hRoomID = hRoomID;
		BookingID = bookingID;
		this.staffID = staffID;
	}

	public String gethHotelID() {
		return hHotelID;
	}

	public void sethHotelID(String hHotelID) {
		this.hHotelID = hHotelID;
	}

	public String getHhotelcode() {
		return hhotelcode;
	}

	public void setHhotelcode(String hhotelcode) {
		this.hhotelcode = hhotelcode;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String gethMotto() {
		return hMotto;
	}

	public void sethMotto(String hMotto) {
		this.hMotto = hMotto;
	}

	public String gethAddress() {
		return hAddress;
	}

	public void sethAddress(String hAddress) {
		this.hAddress = hAddress;
	}

	public String gethAddress2() {
		return hAddress2;
	}

	public void sethAddress2(String hAddress2) {
		this.hAddress2 = hAddress2;
	}

	public String gethCity() {
		return hCity;
	}

	public void sethCity(String hCity) {
		this.hCity = hCity;
	}

	public String gethState() {
		return hState;
	}

	public void sethState(String hState) {
		this.hState = hState;
	}

	public String gethZipCode() {
		return hZipCode;
	}

	public void sethZipCode(String hZipCode) {
		this.hZipCode = hZipCode;
	}

	public String gethCountry() {
		return hCountry;
	}

	public void sethCountry(String hCountry) {
		this.hCountry = hCountry;
	}

	public String gethMainPhoneNumber() {
		return hMainPhoneNumber;
	}

	public void sethMainPhoneNumber(String hMainPhoneNumber) {
		this.hMainPhoneNumber = hMainPhoneNumber;
	}

	public String gethFaxNumber() {
		return hFaxNumber;
	}

	public void sethFaxNumber(String hFaxNumber) {
		this.hFaxNumber = hFaxNumber;
	}

	public String gethTollFreeNumber() {
		return hTollFreeNumber;
	}

	public void sethTollFreeNumber(String hTollFreeNumber) {
		this.hTollFreeNumber = hTollFreeNumber;
	}

	public String gethCompanyMailAddress() {
		return hCompanyMailAddress;
	}

	public void sethCompanyMailAddress(String hCompanyMailAddress) {
		this.hCompanyMailAddress = hCompanyMailAddress;
	}

	public String gethWebsiteAddress() {
		return hWebsiteAddress;
	}

	public void sethWebsiteAddress(String hWebsiteAddress) {
		this.hWebsiteAddress = hWebsiteAddress;
	}

	public String gethMainImage() {
		return hMainImage;
	}

	public void sethMainImage(String hMainImage) {
		this.hMainImage = hMainImage;
	}

	public List<HotelImages> gethImagePath() {
		return hImagePath;
	}

	public void sethImagePath(List<HotelImages> hImagePath) {
		this.hImagePath = hImagePath;
	}

	public List<Feedback> gethHotelFeedbackID() {
		return hHotelFeedbackID;
	}

	public void sethHotelFeedbackID(List<Feedback> hHotelFeedbackID) {
		this.hHotelFeedbackID = hHotelFeedbackID;
	}

	public List<Rooms> gethRoomID() {
		return hRoomID;
	}

	public void sethRoomID(List<Rooms> hRoomID) {
		this.hRoomID = hRoomID;
	}

	public List<Bookings> getBookingID() {
		return BookingID;
	}

	public void setBookingID(List<Bookings> bookingID) {
		BookingID = bookingID;
	}

	public List<Staff> getStaffID() {
		return staffID;
	}

	public void setStaffID(List<Staff> staffID) {
		this.staffID = staffID;
	}

	@Override
	public String toString() {
		return "Hotels [hHotelID=" + hHotelID + ", hhotelcode=" + hhotelcode + ", hName=" + hName + ", hMotto=" + hMotto
				+ ", hAddress=" + hAddress + ", hAddress2=" + hAddress2 + ", hCity=" + hCity + ", hState=" + hState
				+ ", hZipCode=" + hZipCode + ", hCountry=" + hCountry + ", hMainPhoneNumber=" + hMainPhoneNumber
				+ ", hFaxNumber=" + hFaxNumber + ", hTollFreeNumber=" + hTollFreeNumber + ", hCompanyMailAddress="
				+ hCompanyMailAddress + ", hWebsiteAddress=" + hWebsiteAddress + ", hMainImage=" + hMainImage
				+ ", hImagePath=" + hImagePath + ", hHotelFeedbackID=" + hHotelFeedbackID + ", hRoomID=" + hRoomID
				+ ", BookingID=" + BookingID + ", staffID=" + staffID + "]";
	}

	
	
	
	
}
