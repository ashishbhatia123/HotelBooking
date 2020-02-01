package com.startup.HotelBooking.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Guests;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.bean.ReservationsAgents;
import com.startup.HotelBooking.dao.IHotelBookingAdminDao;

@Service
public class HotelBookingAdminServiceImpl implements IHotelBookingAdminService {
	
	
	@Autowired
	IHotelBookingAdminDao iHotelBookingAdminDao;
	@Override
	public ReservationsAgents blockTheReservationAgent() {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.blockTheReservationAgent();
	}

	@Override
	public Boolean insertTheReservationAgentDetail(ReservationsAgents objects) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.insertTheReservationAgentDetail(objects);
	}

	@Override
	public Boolean updateByAdminReservationAgentProfile() {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.updateByAdminReservationAgentProfile();
	}

	@Override
	public Boolean requestedUPdateReservationAgentProfile() {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.requestedUPdateReservationAgentProfile();
	}

	@Override
	public List<Hotels> getHotelDetailStateWise(String state) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getHotelDetailStateWise( state);
	}

	@Override
	public List<Hotels> getHotelDetailCityWise(String City) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getHotelDetailCityWise( City);
	}

	@Override
	public List<Hotels> getHotelDetailcitylocalityWise(String[] locality) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getHotelDetailcitylocalityWise( locality);
	}

	@Override
	public List<Hotels> getParticularHotelDetail(String HotelId) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getParticularHotelDetail( HotelId);
	}

	@Override
	public List<ReservationsAgents> getReservationAgentHotelWise(String hotelId) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getReservationAgentHotelWise( hotelId);
	}

	@Override
	public Boolean updateRequestedHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.updateRequestedHotelDetail( object);
	}

	@Override
	public Boolean updateByAdminHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.updateByAdminHotelDetail( object);
	}

	@Override
	public List<Hotels> getBlockHotelDetails() {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getBlockHotelDetails();
	}

	@Override
	public Boolean blockTheHotel(String HotelId) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.blockTheHotel( HotelId);
	}

	@Override
	public Boolean insertByAdminHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.insertByAdminHotelDetail(object);
	}

	@Override
	public Boolean RequestedInsertHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.RequestedInsertHotelDetail( object);
	}

	@Override
	public Boolean FixingPercentageOfProfitOnHotelRatesByAdmin() {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.FixingPercentageOfProfitOnHotelRatesByAdmin();
	}



	@Override
	public List<Guests> getCustomerDetailsDateWise(Date from, Date to) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getCustomerDetailsDateWise( from,  to);
	}

	@Override
	public List<Guests> getCustomerDetailStateWise(String state) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getCustomerDetailStateWise( state);
	}

	@Override
	public List<Guests> getCustomerDetailCityWise(String city) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getCustomerDetailCityWise( city);
	}

	@Override
	public List<Guests> getCustomerDetailHotelWise(String hotelId) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getCustomerDetailHotelWise( hotelId);
	}

	@Override
	public List<Guests> getCustomerDetailCity_localityWise(String[] localty) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getCustomerDetailCity_localityWise( localty);
	}

	@Override
	public List<Guests> getCustomerDetailsReservationAgentWise(String ReservationAgentId) {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getCustomerDetailsReservationAgentWise( ReservationAgentId);
	}

	@Override
	public Boolean blockTheCustomer() {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.blockTheCustomer();
	}

	@Override
	public List<Guests> getBlockCustomerDetail() {
		// TODO Auto-generated method stub
		return iHotelBookingAdminDao.getBlockCustomerDetail();
	}

	@Override
	public List<ReservationsAgents> getReservationAgentDetailStateWise(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationsAgents> getReservationAgentHotelsCityWise(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationsAgents> getParticularReservationAgentDetail(String reservationAgent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationsAgents> getReservationAgents_HotelDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationsAgents> getBlockReservationAgent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getSalesDetailsDateWise(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getSalesDetailStateWise(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getSalesDetailCityWise(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getSalesDetailHotelWise(String hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getSalesDetailCity_localityWise(String locality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookings> getSalesDetailsReservationAgentWise(String reservationAgent) {
		// TODO Auto-generated method stub
		return null;
	}

}
