package com.startup.HotelBooking.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="HotelImages")
public class HotelImages {
	@Id
	@Column(name="h_image_ID")
	private String imageID;
	@Column(name="imageURL")
	private String imageURL;
	
	@ManyToMany
	@JoinTable(name="image_Hotel",
			joinColumns=@JoinColumn(name="h_image_ID"),
			inverseJoinColumns=@JoinColumn(name="hotel_ID")
			)
	private List<Hotels> hotelID = new ArrayList<>();

	public HotelImages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelImages(String imageID, String imageURL, List<Hotels> hotelID) {
		super();
		this.imageID = imageID;
		this.imageURL = imageURL;
		this.hotelID = hotelID;
	}

	public String getImageID() {
		return imageID;
	}

	public void setImageID(String imageID) {
		this.imageID = imageID;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public List<Hotels> getHotelID() {
		return hotelID;
	}

	public void setHotelID(List<Hotels> hotelID) {
		this.hotelID = hotelID;
	}

	@Override
	public String toString() {
		return "HotelImages [imageID=" + imageID + ", imageURL=" + imageURL + ", hotelID=" + hotelID + "]";
	}
	
	

}
