package com.startup.HotelBooking.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AwsTestBean")
public class AwsTestBean {
	
	@Id
	@Column(name="awsId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int awsId;
	
	@Column(name="awsName")
	public String awsName;
	
}
