package com.startup.HotelBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Guests;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.dao.IHotelBookingCustomerDao;

@Service
public class HotelBookingCustomerServiceImpl implements  IHotelBookingCustomerService  {

	@Autowired
	IHotelBookingCustomerDao iHotelBookingCustomerDao;
	@Override
	public List<Hotels> getDefaultHotel() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.getDefaultHotel();
	}

	@Override
	public List<Hotels> search() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.search();
	}

	@Override
	public Guests getCustomerprofile(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.getCustomerprofile(guestId);
	}

	@Override
	public Boolean updateCustomerProfile(Guests object) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.updateCustomerProfile(object);
	}

	@Override
	public List<Bookings> checkPreviousBooking(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.checkPreviousBooking(guestId);
	}

	@Override
	public List<Bookings> checkUpcomingBooking(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.checkUpcomingBooking(guestId);
	}

	@Override
	public List<Bookings> cancelUpcomingBooking(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.cancelUpcomingBooking(guestId);
	}

	@Override
	public List<Bookings> updateUpcomingBooking(String guestId) {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.updateUpcomingBooking(guestId);
	}

	@Override
	public List<Bookings> HotelBookedByCustomer() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.HotelBookedByCustomer();
	}

	@Override
	public List<Hotels> sortHotelByPrice() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.sortHotelByPrice();
	}

	@Override
	public List<Hotels> sortHotelByPoPularity() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.sortHotelByPoPularity();
	}

	@Override
	public List<Hotels> sortHotelByfacility() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.sortHotelByfacility();
	}

	@Override
	public List<Hotels> sortHotelByNearestDistance() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.sortHotelByNearestDistance();
	}

	@Override
	public List<Hotels> sortHotelByPlaces() {
		// TODO Auto-generated method stub
		return iHotelBookingCustomerDao.sortHotelByPlaces();
	}
}
