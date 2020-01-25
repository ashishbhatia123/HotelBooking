package com.startup.HotelBooking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Guests;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.service.IHotelBookingCustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	IHotelBookingCustomerService iHotelBookingCustomerService;
	
	
	public List<Hotels> getDefaultHotel() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.getDefaultHotel();
	}

	
	public List<Hotels> search() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.search();
	}

	
	public Guests getCustomerprofile(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.getCustomerprofile(guestId);
	}

	
	public Boolean updateCustomerProfile(Guests object) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.updateCustomerProfile(object);
	}

	
	public List<Bookings> checkPreviousBooking(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.checkPreviousBooking(guestId);
	}

	
	public List<Bookings> checkUpcomingBooking(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.checkUpcomingBooking(guestId);
	}

	
	public List<Bookings> cancelUpcomingBooking(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.cancelUpcomingBooking(guestId);
	}

	
	public List<Bookings> updateUpcomingBooking(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.updateUpcomingBooking(guestId);
	}

	
	public List<Bookings> HotelBookedByCustomer() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.HotelBookedByCustomer();
	}

	
	public List<Hotels> sortHotelByPrice() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.sortHotelByPlaces();
	}

	
	public List<Hotels> sortHotelByPoPularity() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.sortHotelByPoPularity();
	}

	
	public List<Hotels> sortHotelByfacility() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.sortHotelByfacility();
	}

	
	public List<Hotels> sortHotelByNearestDistance() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.sortHotelByNearestDistance();
	}

	
	public List<Hotels> sortHotelByPlaces() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerService.sortHotelByPlaces();
	}


}
