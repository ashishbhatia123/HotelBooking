package com.startup.HotelBooking.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Guests;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.bean.ReservationsAgents;
import com.startup.HotelBooking.service.IHotelBookingAdminService;


@RestController
public class AdminController {
	
	@Autowired
	IHotelBookingAdminService iHotelBookingAdminService;
	
	
	public List<ReservationsAgents> getReservationAgentDetailStateWise() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<ReservationsAgents> getReservationAgentHotelsCityWise() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<ReservationsAgents> getParticularReservationAgentDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<ReservationsAgents> getReservationAgents_HotelDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<ReservationsAgents> getBlockReservationAgent() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ReservationsAgents blockTheReservationAgent() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/insertReservationAgentDetail")
	public Boolean insertTheReservationAgentDetail(ReservationsAgents objects) {
		// TODO Auto-generated method stub
		
		return iHotelBookingAdminService.insertTheReservationAgentDetail(objects);
	}

	
	public Boolean updateByAdminReservationAgentProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean requestedUPdateReservationAgentProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Hotels> getHotelDetailStateWise(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Hotels> getHotelDetailCityWise(String City) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Hotels> getHotelDetailcitylocalityWise(String[] locality) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Hotels> getParticularHotelDetail(String HotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<ReservationsAgents> getReservationAgentHotelWise(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean updateRequestedHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean updateByAdminHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Hotels> getBlockHotelDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean blockTheHotel(String HotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean insertByAdminHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean RequestedInsertHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean FixingPercentageOfProfitOnHotelRatesByAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Bookings> getSalesDetailsDateWise() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Bookings> getSalesDetailStateWise() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Bookings> getSalesDetailCityWise() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Bookings> getSalesDetailHotelWise() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Bookings> getSalesDetailCity_localityWise() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Bookings> getSalesDetailsReservationAgentWise() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Guests> getCustomerDetailsDateWise(Date from, Date to) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Guests> getCustomerDetailStateWise(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Guests> getCustomerDetailCityWise(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Guests> getCustomerDetailHotelWise(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Guests> getCustomerDetailCity_localityWise(String[] localty) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Guests> getCustomerDetailsReservationAgentWise(String ReservationAgentId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean blockTheCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Guests> getBlockCustomerDetail() {
		// TODO Auto-generated method stub
		return null;
	

}
}