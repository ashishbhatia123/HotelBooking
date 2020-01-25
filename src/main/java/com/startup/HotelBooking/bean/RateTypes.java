package com.startup.HotelBooking.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="RateTypes")
public class RateTypes {
	@Id
	@Column(name="rateTypes_ID")
	private String rtRateTypesID;
	
	@OneToMany(mappedBy="rRateTypeID",cascade=CascadeType.ALL)
	private List<Rates> rtRateID = new ArrayList<>();
	
	@Column(name="rateType")
	private String rtRateTypes;
	@Column(name="RateType_Desc")
	private String rtDescrition;
	public RateTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RateTypes(String rtRateTypesID, List<Rates> rtRateID, String rtRateTypes, String rtDescrition) {
		super();
		this.rtRateTypesID = rtRateTypesID;
		this.rtRateID = rtRateID;
		this.rtRateTypes = rtRateTypes;
		this.rtDescrition = rtDescrition;
	}
	public String getRtRateTypesID() {
		return rtRateTypesID;
	}
	public void setRtRateTypesID(String rtRateTypesID) {
		this.rtRateTypesID = rtRateTypesID;
	}
	public List<Rates> getRtRateID() {
		return rtRateID;
	}
	public void setRtRateID(List<Rates> rtRateID) {
		this.rtRateID = rtRateID;
	}
	public String getRtRateTypes() {
		return rtRateTypes;
	}
	public void setRtRateTypes(String rtRateTypes) {
		this.rtRateTypes = rtRateTypes;
	}
	public String getRtDescrition() {
		return rtDescrition;
	}
	public void setRtDescrition(String rtDescrition) {
		this.rtDescrition = rtDescrition;
	}
	@Override
	public String toString() {
		return "RateTypes [rtRateTypesID=" + rtRateTypesID + ", rtRateID=" + rtRateID + ", rtRateTypes=" + rtRateTypes
				+ ", rtDescrition=" + rtDescrition + "]";
	}

	
	
}
