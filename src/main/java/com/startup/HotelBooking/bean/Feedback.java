package com.startup.HotelBooking.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Feedback")
public class Feedback {
	@Id
	@Column(name="feedback_ID")
	private String feedbackID;
	@Column(name="feedbackSubject")
	private String feedbackSubject;
	@Column(name="feedbackDiscrition")
	private String feedbackDiscrition;
	@Column(name="rating")
	private double rating;
	
	@ManyToOne
	@JoinColumn(name="feedbackHotel_ID")
	private Hotels feedbackHotelID;
	
	@ManyToOne
	@JoinColumn(name="Guest_ID")
	private Guests feedback_guestID;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(String feedbackID, String feedbackSubject, String feedbackDiscrition, double rating,
			Hotels feedbackHotelID, Guests feedback_guestID) {
		super();
		this.feedbackID = feedbackID;
		this.feedbackSubject = feedbackSubject;
		this.feedbackDiscrition = feedbackDiscrition;
		this.rating = rating;
		this.feedbackHotelID = feedbackHotelID;
		this.feedback_guestID = feedback_guestID;
	}

	public String getFeedbackID() {
		return feedbackID;
	}

	public void setFeedbackID(String feedbackID) {
		this.feedbackID = feedbackID;
	}

	public String getFeedbackSubject() {
		return feedbackSubject;
	}

	public void setFeedbackSubject(String feedbackSubject) {
		this.feedbackSubject = feedbackSubject;
	}

	public String getFeedbackDiscrition() {
		return feedbackDiscrition;
	}

	public void setFeedbackDiscrition(String feedbackDiscrition) {
		this.feedbackDiscrition = feedbackDiscrition;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Hotels getFeedbackHotelID() {
		return feedbackHotelID;
	}

	public void setFeedbackHotelID(Hotels feedbackHotelID) {
		this.feedbackHotelID = feedbackHotelID;
	}

	public Guests getFeedback_guestID() {
		return feedback_guestID;
	}

	public void setFeedback_guestID(Guests feedback_guestID) {
		this.feedback_guestID = feedback_guestID;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackID=" + feedbackID + ", feedbackSubject=" + feedbackSubject + ", feedbackDiscrition="
				+ feedbackDiscrition + ", rating=" + rating + ", feedbackHotelID=" + feedbackHotelID
				+ ", feedback_guestID=" + feedback_guestID + "]";
	}
	
	

}
