package com.startup.HotelBooking.service;

import org.springframework.stereotype.Service;

import com.startup.HotelBooking.bean.AwsTestBean;

@Service
public interface IAwsTestServiceImpl {

	public boolean AddAwsTest(AwsTestBean awsTestbean);
	public AwsTestBean showAwsTest();
}
