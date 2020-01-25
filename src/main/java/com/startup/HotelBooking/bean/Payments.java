package com.startup.HotelBooking.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Payments")
public class Payments {
	@Id
	@Column(name="payment_ID")
	private String pPaymentID;
	
	@ManyToOne
	@JoinColumn(name="room_ID")
	private Rooms pRoomID;
	
	@Column(name="p_Date")
	private String pDate;
	@Column(name="payment_Amount")
	private String pPayment;
	
	@ManyToOne
	@JoinColumn(name="paymentType_ID")
	private PaymentTypes pPaymentTypeID;
	
	@ManyToOne
	@JoinColumn(name="paymentStatus_ID")
	private PaymentStatus pPaymentStatusID;
	
	

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Payments(String pPaymentID, Rooms pRoomID, String pDate, String pPayment, PaymentTypes pPaymentTypeID,
			PaymentStatus pPaymentStatusID) {
		super();
		this.pPaymentID = pPaymentID;
		this.pRoomID = pRoomID;
		this.pDate = pDate;
		this.pPayment = pPayment;
		this.pPaymentTypeID = pPaymentTypeID;
		this.pPaymentStatusID = pPaymentStatusID;
	}



	public String getpPaymentID() {
		return pPaymentID;
	}



	public void setpPaymentID(String pPaymentID) {
		this.pPaymentID = pPaymentID;
	}



	public Rooms getpRoomID() {
		return pRoomID;
	}



	public void setpRoomID(Rooms pRoomID) {
		this.pRoomID = pRoomID;
	}



	public String getpDate() {
		return pDate;
	}



	public void setpDate(String pDate) {
		this.pDate = pDate;
	}



	public String getpPayment() {
		return pPayment;
	}



	public void setpPayment(String pPayment) {
		this.pPayment = pPayment;
	}



	public PaymentTypes getpPaymentTypeID() {
		return pPaymentTypeID;
	}



	public void setpPaymentTypeID(PaymentTypes pPaymentTypeID) {
		this.pPaymentTypeID = pPaymentTypeID;
	}



	public PaymentStatus getpPaymentStatusID() {
		return pPaymentStatusID;
	}



	public void setpPaymentStatusID(PaymentStatus pPaymentStatusID) {
		this.pPaymentStatusID = pPaymentStatusID;
	}



	@Override
	public String toString() {
		return "Payments [pPaymentID=" + pPaymentID + ", pRoomID=" + pRoomID + ", pDate=" + pDate + ", pPayment="
				+ pPayment + ", pPaymentTypeID=" + pPaymentTypeID + ", pPaymentStatusID=" + pPaymentStatusID + "]";
	}
	
	
	

}
