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
@Table(name="PaymentTypes")
public class PaymentTypes {
	@Id
	@Column(name="paymentTypes_ID")
	private String ptPaymentTypeID;
	
	@OneToMany(mappedBy="pPaymentTypeID",cascade=CascadeType.ALL)
	private List<Payments> paymentID = new ArrayList<>();
	
	@Column(name="paymentTypes")
	private String ptPaymentType;

	public PaymentTypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentTypes(String ptPaymentTypeID, List<Payments> paymentID, String ptPaymentType) {
		super();
		this.ptPaymentTypeID = ptPaymentTypeID;
		this.paymentID = paymentID;
		this.ptPaymentType = ptPaymentType;
	}

	public String getPtPaymentTypeID() {
		return ptPaymentTypeID;
	}

	public void setPtPaymentTypeID(String ptPaymentTypeID) {
		this.ptPaymentTypeID = ptPaymentTypeID;
	}

	public List<Payments> getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(List<Payments> paymentID) {
		this.paymentID = paymentID;
	}

	public String getPtPaymentType() {
		return ptPaymentType;
	}

	public void setPtPaymentType(String ptPaymentType) {
		this.ptPaymentType = ptPaymentType;
	}

	@Override
	public String toString() {
		return "PaymentTypes [ptPaymentTypeID=" + ptPaymentTypeID + ", paymentID=" + paymentID + ", ptPaymentType="
				+ ptPaymentType + "]";
	}
	
	

}
