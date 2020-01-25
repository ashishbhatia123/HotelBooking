package com.startup.HotelBooking.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.bean.ReservationsAgents;
import com.startup.HotelBooking.dao.IHotelBookingReservationAgentDao;

@Service
public class HotelBookingReservationAgentServiceImpl implements IHotelBookingReservationAgentService {

	@Autowired
	IHotelBookingReservationAgentDao  iHotelBookingReservationAgentDao;
	
	@Override
	public boolean insertHotelDetail(Hotels hotels) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.insertHotelDetail(hotels);
	}

	@Override
	public boolean updatehotelDetailByReservationAgent() {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.updatehotelDetailByReservationAgent();
	}

	@Override
	public boolean notifyReservationAgentRequestAcknowledgement() {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.notifyReservationAgentRequestAcknowledgement();
	}

	@Override
	public ReservationsAgents getOwnProfileDetail(String reservationAgentID) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.getOwnProfileDetail(reservationAgentID);
	}

	@Override
	public boolean updateOwnProfileDetail(ReservationsAgents reservationAgents) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.updateOwnProfileDetail(reservationAgents);
	}

	@Override
	public boolean HotelBookedByReservationAgentForOtherCustomer() {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.HotelBookedByReservationAgentForOtherCustomer();
	}

	@Override
	public List<Bookings> getOwnSalesDetailsDateWise(String reservationAgentId, Date from, Date to) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.getOwnSalesDetailsDateWise(reservationAgentId, from, to);
	}

	@Override
	public List<Bookings> getOwnSalesDetailStateWise(String reservationAgentId, String state) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.getOwnSalesDetailStateWise(reservationAgentId, state);
	}

	@Override
	public List<Bookings> getOwnSalesDetailCityWise(String reservationAgentId, String city) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.getOwnSalesDetailCityWise(reservationAgentId, city);
	}

	@Override
	public List<Bookings> getOwnSalesDetailHotelWise(String reservationAgentId, String hotelID) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.getOwnSalesDetailHotelWise(reservationAgentId, hotelID);
	}

	@Override
	public List<Bookings> getOwnSalesDetailCityLocalityWise(String reservationAgentId, String[] locality) {
		// TODO Auto-generated method stub
		return iHotelBookingReservationAgentDao.getOwnSalesDetailCityLocalityWise(reservationAgentId, locality);
	}

}
