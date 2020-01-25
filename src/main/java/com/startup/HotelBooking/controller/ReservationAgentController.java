package com.startup.HotelBooking.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.bean.ReservationsAgents;
import com.startup.HotelBooking.service.IHotelBookingReservationAgentService;

@RestController
public class ReservationAgentController {

	@Autowired
	IHotelBookingReservationAgentService iHotelBookingReservationAgentService;
	
	
	public boolean insertHotelDetail(Hotels hotels) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.insertHotelDetail(hotels);
	}

	
	public boolean updatehotelDetailByReservationAgent() {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.updatehotelDetailByReservationAgent();
	}

	
	public boolean notifyReservationAgentRequestAcknowledgement() {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.notifyReservationAgentRequestAcknowledgement();
	}

	
	public ReservationsAgents getOwnProfileDetail(String reservationAgentID) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.getOwnProfileDetail(reservationAgentID);
	}

	
	public boolean updateOwnProfileDetail(ReservationsAgents reservationAgents) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.updateOwnProfileDetail(reservationAgents);
	}

	
	public boolean HotelBookedByReservationAgentForOtherCustomer() {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.HotelBookedByReservationAgentForOtherCustomer();
	}

	
	public List<Bookings> getOwnSalesDetailsDateWise(String reservationAgentId, Date from, Date to) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.getOwnSalesDetailsDateWise(reservationAgentId, from, to);
	}

	
	public List<Bookings> getOwnSalesDetailStateWise(String reservationAgentId, String state) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.getOwnSalesDetailStateWise(reservationAgentId, state);
	}

	
	public List<Bookings> getOwnSalesDetailCityWise(String reservationAgentId, String city) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.getOwnSalesDetailCityWise(reservationAgentId, city);
	}

	
	public List<Bookings> getOwnSalesDetailHotelWise(String reservationAgentId, String hotelID) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.getOwnSalesDetailHotelWise(reservationAgentId, hotelID);
	}

	
	public List<Bookings> getOwnSalesDetailCityLocalityWise(String reservationAgentId, String[] locality) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentService.getOwnSalesDetailCityLocalityWise(reservationAgentId, locality);
	}

	
	
}
