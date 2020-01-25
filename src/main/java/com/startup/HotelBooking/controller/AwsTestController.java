package com.startup.HotelBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.startup.HotelBooking.bean.AwsTestBean;
import com.startup.HotelBooking.service.IAwsTestServiceImpl;

@RestController
public class AwsTestController {

	@Autowired
	IAwsTestServiceImpl iAwsTestServiceImpl;
	
	@RequestMapping(method = RequestMethod.GET, value = "/add")
	public boolean AddAwsTest(@RequestBody AwsTestBean awsTestbean) {
		return iAwsTestServiceImpl.AddAwsTest(awsTestbean);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/show")
	public AwsTestBean show(@RequestBody AwsTestBean awsTestbean) {
		return iAwsTestServiceImpl.showAwsTest();	
		
	}
	
}
