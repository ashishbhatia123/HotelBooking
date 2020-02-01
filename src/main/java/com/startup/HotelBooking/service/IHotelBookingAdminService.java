package com.startup.HotelBooking.service;

import java.util.Date;
import java.util.List;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Guests;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.bean.ReservationsAgents;

public interface IHotelBookingAdminService {
	
	
	
	public List<ReservationsAgents> getReservationAgentDetailStateWise(String state);           
	public List<ReservationsAgents> getReservationAgentHotelsCityWise(String city);
	public List<ReservationsAgents> getParticularReservationAgentDetail(String reservationAgent);   
	public List<ReservationsAgents> getReservationAgents_HotelDetails();   
	public List<ReservationsAgents> getBlockReservationAgent();    
	public ReservationsAgents blockTheReservationAgent() ;   
	public Boolean insertTheReservationAgentDetail(ReservationsAgents objects);
	public Boolean updateByAdminReservationAgentProfile();
	public Boolean requestedUPdateReservationAgentProfile();      



	public List<Hotels> getHotelDetailStateWise(String state);                                    
	public List<Hotels> getHotelDetailCityWise(String City);
	public List<Hotels> getHotelDetailcitylocalityWise(String locality[]);            
	public List<Hotels> getParticularHotelDetail(String HotelId);
	public List<ReservationsAgents> getReservationAgentHotelWise(String hotelId);  
	
	//public getAllReservationAgents_PriceHotelWise(String hotelId);
	//public sortTheReservationAgents_Price();
	
	public Boolean updateRequestedHotelDetail(Hotels object);
	public Boolean updateByAdminHotelDetail(Hotels object);
	public List<Hotels> getBlockHotelDetails();
	public Boolean blockTheHotel(String HotelId);    
	public Boolean insertByAdminHotelDetail(Hotels object);   
	public Boolean RequestedInsertHotelDetail(Hotels object);   
	public Boolean FixingPercentageOfProfitOnHotelRatesByAdmin();
			
			
	public List<Bookings>getSalesDetailsDateWise(String date);
	public List<Bookings> getSalesDetailStateWise(String state);
	public List<Bookings> getSalesDetailCityWise(String city);
	public List<Bookings> getSalesDetailHotelWise(String hotel);
	public List<Bookings> getSalesDetailCity_localityWise(String locality);            
	public List<Bookings> getSalesDetailsReservationAgentWise(String reservationAgent);








	public List<Guests> getCustomerDetailsDateWise( Date from , Date to); 
	public List<Guests> getCustomerDetailStateWise(String state);
	public List<Guests> getCustomerDetailCityWise(String city);
	public List<Guests> getCustomerDetailHotelWise(String hotelId);   
	public List<Guests> getCustomerDetailCity_localityWise(String localty[]);   
	public List<Guests> getCustomerDetailsReservationAgentWise(String ReservationAgentId); 
	public Boolean blockTheCustomer();    
	public List<Guests> getBlockCustomerDetail();     



	//public sortTheReservationAgent();         
	//public blockAutoDelete();
	//public sellingHotelRecommendationOnTheBasisOfProfitPriority();
	//public AdminMakeOtherAdmin();
	//public AdminMakeManager();

}
