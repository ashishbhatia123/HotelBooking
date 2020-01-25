package com.startup.HotelBooking.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Guests;
import com.startup.HotelBooking.bean.Hotels;

@Repository
public class HotelBookingCustomerDaoImpl implements  IHotelBookingCustomerDao  {

	
	@Override
	public List<Hotels> getDefaultHotel() {
		// TODO Auto-generated method stub
		System.out.println("Pull Request check");
		return null;
	}

	@Override
	public List<Hotels> search() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guests getCustomerprofile(String guestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateCustomerProfile(Guests object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> checkPreviousBooking(String guestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> checkUpcomingBooking(String guestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> cancelUpcomingBooking(String guestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> updateUpcomingBooking(String guestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> HotelBookedByCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotels> sortHotelByPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotels> sortHotelByPoPularity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotels> sortHotelByfacility() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotels> sortHotelByNearestDistance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotels> sortHotelByPlaces() {
		// TODO Auto-generated method stub
		return null;
	}

}
