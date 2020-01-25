package com.startup.HotelBooking.dao;

import java.util.List;

import com.startup.HotelBooking.bean.Bookings;
import com.startup.HotelBooking.bean.Guests;
import com.startup.HotelBooking.bean.Hotels;

public interface IHotelBookingCustomerDao {

	public List<Hotels> getDefaultHotel();    
	public List<Hotels> search();            
	public Guests getCustomerprofile(String guestId);      
	public Boolean updateCustomerProfile(Guests object);              
	public List<Bookings> checkPreviousBooking(String guestId);  
	public List<Bookings> checkUpcomingBooking(String guestId);  
	public List<Bookings> cancelUpcomingBooking(String guestId);  
	public List<Bookings> updateUpcomingBooking(String guestId);  
	public List<Bookings> HotelBookedByCustomer();
	public List<Hotels> sortHotelByPrice();                                         
	public List<Hotels> sortHotelByPoPularity();    
	public List<Hotels> sortHotelByfacility();    
	public List<Hotels> sortHotelByNearestDistance();
	public List<Hotels> sortHotelByPlaces(); 
	
}
