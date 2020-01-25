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
@Table(name="RoomTypes")
public class RoomTypes {
	@Id
	@Column(name="roomTypes_ID")
	private String rtRoomTypeID;
	
	@Column(name="r_RoomNumber")
	private String rtRoomType;
	@Column(name="r_Descrition")
	private String rtDescription;
	
	@OneToMany(mappedBy="rRoomTypeID",cascade=CascadeType.ALL)
	private List<Rooms> rtRoomID = new ArrayList<>();

	public RoomTypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomTypes(String rtRoomTypeID, String rtRoomType, String rtDescription, List<Rooms> rtRoomID) {
		super();
		this.rtRoomTypeID = rtRoomTypeID;
		this.rtRoomType = rtRoomType;
		this.rtDescription = rtDescription;
		this.rtRoomID = rtRoomID;
	}

	public String getRtRoomTypeID() {
		return rtRoomTypeID;
	}

	public void setRtRoomTypeID(String rtRoomTypeID) {
		this.rtRoomTypeID = rtRoomTypeID;
	}

	public String getRtRoomType() {
		return rtRoomType;
	}

	public void setRtRoomType(String rtRoomType) {
		this.rtRoomType = rtRoomType;
	}

	public String getRtDescription() {
		return rtDescription;
	}

	public void setRtDescription(String rtDescription) {
		this.rtDescription = rtDescription;
	}

	public List<Rooms> getRtRoomID() {
		return rtRoomID;
	}

	public void setRtRoomID(List<Rooms> rtRoomID) {
		this.rtRoomID = rtRoomID;
	}

	@Override
	public String toString() {
		return "RoomTypes [rtRoomTypeID=" + rtRoomTypeID + ", rtRoomType=" + rtRoomType + ", rtDescription="
				+ rtDescription + ", rtRoomID=" + rtRoomID + "]";
	}
	
	

}
