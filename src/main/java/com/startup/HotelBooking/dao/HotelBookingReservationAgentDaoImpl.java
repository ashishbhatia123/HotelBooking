package com.startup.HotelBooking.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.bean.ReservationsAgents;

@Repository
public class HotelBookingReservationAgentDaoImpl implements IHotelBookingReservationAgentDao {

	
	@Override
	public boolean insertHotelDetail(Hotels hotels) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatehotelDetailByReservationAgent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notifyReservationAgentRequestAcknowledgement() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReservationsAgents getOwnProfileDetail(String reservationAgentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOwnProfileDetail(ReservationsAgents reservationAgents) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean HotelBookedByReservationAgentForOtherCustomer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Bookings> getOwnSalesDetailsDateWise(String reservationAgentId, Date from, Date to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getOwnSalesDetailStateWise(String reservationAgentId, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getOwnSalesDetailCityWise(String reservationAgentId, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getOwnSalesDetailHotelWise(String reservationAgentId, String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getOwnSalesDetailCityLocalityWise(String reservationAgentId, String[] locality) {
		// TODO Auto-generated method stub
		return null;
	}

}
