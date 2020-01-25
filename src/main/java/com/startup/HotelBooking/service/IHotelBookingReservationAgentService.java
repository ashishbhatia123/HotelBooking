package com.startup.HotelBooking.service;

import java.util.Date;
import java.util.List;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.bean.ReservationsAgents;

public interface IHotelBookingReservationAgentService {
	
	
	
public boolean insertHotelDetail(Hotels hotels);
public boolean updatehotelDetailByReservationAgent();       
public boolean notifyReservationAgentRequestAcknowledgement();    
public ReservationsAgents getOwnProfileDetail(String reservationAgentID);    
public boolean updateOwnProfileDetail(ReservationsAgents reservationAgents);    
public boolean HotelBookedByReservationAgentForOtherCustomer();    


public List<Bookings> getOwnSalesDetailsDateWise(String reservationAgentId, Date from , Date to); 
public List<Bookings> getOwnSalesDetailStateWise(String reservationAgentId , String state);
public List<Bookings> getOwnSalesDetailCityWise(String reservationAgentId , String city);
public List<Bookings> getOwnSalesDetailHotelWise(String reservationAgentId , String hotelID);
public List<Bookings> getOwnSalesDetailCityLocalityWise(String reservationAgentId, String locality[]);

}
