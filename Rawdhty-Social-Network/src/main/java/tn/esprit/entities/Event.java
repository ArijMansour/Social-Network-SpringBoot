package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="T_Events")
public class Event implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Event_ID")
	private long Event_Id ;
	private Date Event_Date_Begin ; 
	private Date Event_Date_Finish ; 
	private String Event_Description ;
	
	@Enumerated(EnumType.STRING ) 
	private Event_Place event_place ;
	
	@Enumerated(EnumType.STRING ) 
	private Event_Type  event_type ;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(Date event_Date_Begin, Date event_Date_Finish, String event_Description, Event_Place event_place,
			Event_Type event_type) {
		super();
		Event_Date_Begin = event_Date_Begin;
		Event_Date_Finish = event_Date_Finish;
		Event_Description = event_Description;
		this.event_place = event_place;
		this.event_type = event_type;
	}

	public long getEvent_Id() {
		return Event_Id;
	}

	public void setEvent_Id(long event_Id) {
		Event_Id = event_Id;
	}

	public Date getEvent_Date_Begin() {
		return Event_Date_Begin;
	}

	public void setEvent_Date_Begin(Date event_Date_Begin) {
		Event_Date_Begin = event_Date_Begin;
	}

	public Date getEvent_Date_Finish() {
		return Event_Date_Finish;
	}

	public void setEvent_Date_Finish(Date event_Date_Finish) {
		Event_Date_Finish = event_Date_Finish;
	}

	public String getEvent_Description() {
		return Event_Description;
	}

	public void setEvent_Description(String event_Description) {
		Event_Description = event_Description;
	}

	public Event_Place getEvent_place() {
		return event_place;
	}

	public void setEvent_place(Event_Place event_place) {
		this.event_place = event_place;
	}

	public Event_Type getEvent_type() {
		return event_type;
	}

	public void setEvent_type(Event_Type event_type) {
		this.event_type = event_type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Event_Date_Begin == null) ? 0 : Event_Date_Begin.hashCode());
		result = prime * result + ((Event_Date_Finish == null) ? 0 : Event_Date_Finish.hashCode());
		result = prime * result + ((Event_Description == null) ? 0 : Event_Description.hashCode());
		result = prime * result + (int) (Event_Id ^ (Event_Id >>> 32));
		result = prime * result + ((event_place == null) ? 0 : event_place.hashCode());
		result = prime * result + ((event_type == null) ? 0 : event_type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (Event_Date_Begin == null) {
			if (other.Event_Date_Begin != null)
				return false;
		} else if (!Event_Date_Begin.equals(other.Event_Date_Begin))
			return false;
		if (Event_Date_Finish == null) {
			if (other.Event_Date_Finish != null)
				return false;
		} else if (!Event_Date_Finish.equals(other.Event_Date_Finish))
			return false;
		if (Event_Description == null) {
			if (other.Event_Description != null)
				return false;
		} else if (!Event_Description.equals(other.Event_Description))
			return false;
		if (Event_Id != other.Event_Id)
			return false;
		if (event_place != other.event_place)
			return false;
		if (event_type != other.event_type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Event [Event_Id=" + Event_Id + ", Event_Date_Begin=" + Event_Date_Begin + ", Event_Date_Finish="
				+ Event_Date_Finish + ", Event_Description=" + Event_Description + ", event_place=" + event_place
				+ ", event_type=" + event_type + "]";
	}

	

}
