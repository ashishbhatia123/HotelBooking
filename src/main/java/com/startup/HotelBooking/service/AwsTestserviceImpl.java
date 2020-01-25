package com.startup.HotelBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.startup.HotelBooking.bean.AwsTestBean;
import com.startup.HotelBooking.dao.AwsTestDaoImpl;

@Service
@Transactional
public class AwsTestserviceImpl implements IAwsTestServiceImpl{

	@Autowired
	AwsTestDaoImpl awsTestDaoImpl;
	
	public boolean AddAwsTest(AwsTestBean awsTestbean) {
		return awsTestDaoImpl.AddAwsTest(awsTestbean);
	}

	@Override
	public AwsTestBean showAwsTest() {
		// TODO Auto-generated method stub
		return awsTestDaoImpl.showAwsTest();
	}
	
}
