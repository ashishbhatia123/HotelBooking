package com.startup.HotelBooking.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Guests;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.bean.ReservationsAgents;

@Repository
@Transactional
public class HotelBookingAdminDao implements IHotelBookingAdminDao{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<ReservationsAgents> getReservationAgentDetailStateWise(String state) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT ra from ReservationsAgents AS ra where ra.raState=:state");
		query.setParameter("state", state);
		 ((EntityTransaction) entityManager).begin();
		//int noOfRows=query.executeUpdate();
		ArrayList<ReservationsAgents> list =(ArrayList<ReservationsAgents>) query.getResultList();
		((EntityTransaction) entityManager).commit();
		//System.out.println("no of rows are :"+ noOfRows);
		return list;
	}

	@Override
	public List<ReservationsAgents> getReservationAgentHotelsCityWise(String city) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT ra from ReservationsAgents AS ra where ra.raCity=:city");
		query.setParameter("city", city);
		 ((EntityTransaction) entityManager).begin();
		//int noOfRows=query.executeUpdate();
		ArrayList<ReservationsAgents> list =(ArrayList<ReservationsAgents>) query.getResultList();
		((EntityTransaction) entityManager).commit();
		//System.out.println("no of rows are :"+ noOfRows);
		return list;
	}

	@Override
	public List<ReservationsAgents> getParticularReservationAgentDetail(String reservationAgentID) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT ra from ReservationsAgents AS ra where ra.raReservationAgentID=:reservationAgentID");
		query.setParameter("reservationAgentID", reservationAgentID);
		 ((EntityTransaction) entityManager).begin();
		//int noOfRows=query.executeUpdate();
		ArrayList<ReservationsAgents> list =(ArrayList<ReservationsAgents>) query.getResultList();
		((EntityTransaction) entityManager).commit();
		//System.out.println("no of rows are :"+ noOfRows);
		return list;
	}

	@Override
	public List<ReservationsAgents> getReservationAgents_HotelDetails(String reservationAgentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReservationsAgents blockTheReservationAgent() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT ra from ReservationsAgents AS ra where ra.raReservationAgentID=:reservationAgentID");
//		query.setParameter("reservationAgentID", reservationAgentID);
		 ((EntityTransaction) entityManager).begin();
		//int noOfRows=query.executeUpdate();
		ArrayList<ReservationsAgents> list =(ArrayList<ReservationsAgents>) query.getResultList();
		((EntityTransaction) entityManager).commit();
		//System.out.println("no of rows are :"+ noOfRows);
		return null;
	}

	@Override
	public Boolean insertTheReservationAgentDetail(ReservationsAgents objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateByAdminReservationAgentProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean requestedUPdateReservationAgentProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotels> getHotelDetailStateWise(String state) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT ha from Hotels AS ha where ha.hState=:state");
		query.setParameter("state", state);
		 ((EntityTransaction) entityManager).begin();
		//int noOfRows=query.executeUpdate();
		List<Hotels> list =(List<Hotels>) query.getResultList();
		((EntityTransaction) entityManager).commit();
		//System.out.println("no of rows are :"+ noOfRows);
		return list;
	}

	@Override
	public List<Hotels> getHotelDetailCityWise(String City) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT ha from Hotels AS ha where ha.hCity=:City");
		query.setParameter("City", City);
		 ((EntityTransaction) entityManager).begin();
		//int noOfRows=query.executeUpdate();
		List<Hotels> list =(List<Hotels>) query.getResultList();
		((EntityTransaction) entityManager).commit();
		//System.out.println("no of rows are :"+ noOfRows);
		return list;
	}

	@Override
	public List<Hotels> getHotelDetailcitylocalityWise(String[] locality) { // need to update table according to locality
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT ha from Hotels AS ha where ha.hCity=:locality");
		query.setParameter("locality", locality);
		 ((EntityTransaction) entityManager).begin();
		//int noOfRows=query.executeUpdate();
		List<Hotels> list =(List<Hotels>) query.getResultList();
		((EntityTransaction) entityManager).commit();
		//System.out.println("no of rows are :"+ noOfRows);
		return list;
	}

	@Override
	public List<Hotels> getParticularHotelDetail(String HotelId) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT ha from Hotels AS ha where ha.hHotelID=:HotelId");
		query.setParameter("HotelId", HotelId);
		 ((EntityTransaction) entityManager).begin();
		//int noOfRows=query.executeUpdate();
		List<Hotels> list =(List<Hotels>) query.getResultList();
		((EntityTransaction) entityManager).commit();
		//System.out.println("no of rows are :"+ noOfRows);
		return list;
	}

	@Override
	public List<ReservationsAgents> getReservationAgentHotelWise(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateRequestedHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateByAdminHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotels> getBlockHotelDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean blockTheHotel(String HotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertByAdminHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean RequestedInsertHotelDetail(Hotels object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean FixingPercentageOfProfitOnHotelRatesByAdmin() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Guests> getCustomerDetailsDateWise(Date from, Date to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guests> getCustomerDetailStateWise(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guests> getCustomerDetailCityWise(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guests> getCustomerDetailHotelWise(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guests> getCustomerDetailCity_localityWise(String[] localty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guests> getCustomerDetailsReservationAgentWise(String ReservationAgentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean blockTheCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guests> getBlockCustomerDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationsAgents> getBlockReservationAgent(String reservationAgentID) {
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
