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
@Table(name="PaymentStatus")
public class PaymentStatus {
	@Id
	@Column(name="paymentstatus_ID")
	private String psPaymentStatusID;
	
	@OneToMany(mappedBy="pPaymentStatusID",cascade=CascadeType.ALL)
	private List<Payments> paymentID = new ArrayList<>();
	
	@Column(name="paymentStatus")
	private String psStatus;
	@Column(name="paymentDescription")
	private String psDescription;
	public PaymentStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentStatus(String psPaymentStatusID, List<Payments> paymentID, String psStatus, String psDescription) {
		super();
		this.psPaymentStatusID = psPaymentStatusID;
		this.paymentID = paymentID;
		this.psStatus = psStatus;
		this.psDescription = psDescription;
	}
	public String getPsPaymentStatusID() {
		return psPaymentStatusID;
	}
	public void setPsPaymentStatusID(String psPaymentStatusID) {
		this.psPaymentStatusID = psPaymentStatusID;
	}
	public List<Payments> getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(List<Payments> paymentID) {
		this.paymentID = paymentID;
	}
	public String getPsStatus() {
		return psStatus;
	}
	public void setPsStatus(String psStatus) {
		this.psStatus = psStatus;
	}
	public String getPsDescription() {
		return psDescription;
	}
	public void setPsDescription(String psDescription) {
		this.psDescription = psDescription;
	}
	
	
	@Override
	public String toString() {
		return "PaymentStatus [psPaymentStatusID=" + psPaymentStatusID + ", paymentID=" + paymentID + ", psStatus="
				+ psStatus + ", psDescription=" + psDescription + "]";
	}
	
	

}
