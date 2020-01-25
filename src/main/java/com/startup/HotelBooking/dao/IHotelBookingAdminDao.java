package com.startup.HotelBooking.dao;

import java.util.Date;
import java.util.List;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Guests;
import com.startup.HotelBooking.bean.Hotels;
import com.startup.HotelBooking.bean.ReservationsAgents;

public interface IHotelBookingAdminDao {
	
	
	
	public List<ReservationsAgents> getReservationAgentDetailStateWise();           
	public List<ReservationsAgents> getReservationAgentHotelsCityWise();
	public List<ReservationsAgents> getParticularReservationAgentDetail();   
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
			
			
	public List<Bookings>getSalesDetailsDateWise();
	public List<Bookings> getSalesDetailStateWise();
	public List<Bookings> getSalesDetailCityWise();
	public List<Bookings> getSalesDetailHotelWise();
	public List<Bookings> getSalesDetailCity_localityWise();            
	public List<Bookings> getSalesDetailsReservationAgentWise();








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
