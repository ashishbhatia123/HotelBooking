package com.startup.HotelBooking.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="RoomStatus")
public class RoomStatus {
	@Id
	@Column(name="roomStatus_ID")
	private String rsRoomStatusID;
	
	@Column(name="roomStatus")
	private String rsRoomStatus;
	@Column(name="roomStatus_Desc")
	private String rsDescription;
	
	@OneToMany(mappedBy="rRoomStatusID",cascade=CascadeType.ALL)
	private List<Rooms> rsRoomID = new ArrayList<>();

	public RoomStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomStatus(String rsRoomStatusID, String rsRoomStatus, String rsDescription, List<Rooms> rsRoomID) {
		super();
		this.rsRoomStatusID = rsRoomStatusID;
		this.rsRoomStatus = rsRoomStatus;
		this.rsDescription = rsDescription;
		this.rsRoomID = rsRoomID;
	}

	public String getRsRoomStatusID() {
		return rsRoomStatusID;
	}

	public void setRsRoomStatusID(String rsRoomStatusID) {
		this.rsRoomStatusID = rsRoomStatusID;
	}

	public String getRsRoomStatus() {
		return rsRoomStatus;
	}

	public void setRsRoomStatus(String rsRoomStatus) {
		this.rsRoomStatus = rsRoomStatus;
	}

	public String getRsDescription() {
		return rsDescription;
	}

	public void setRsDescription(String rsDescription) {
		this.rsDescription = rsDescription;
	}

	public List<Rooms> getRsRoomID() {
		return rsRoomID;
	}

	public void setRsRoomID(List<Rooms> rsRoomID) {
		this.rsRoomID = rsRoomID;
	}

	@Override
	public String toString() {
		return "RoomStatus [rsRoomStatusID=" + rsRoomStatusID + ", rsRoomStatus=" + rsRoomStatus + ", rsDescription="
				+ rsDescription + ", rsRoomID=" + rsRoomID + "]";
	}
	
	

}
