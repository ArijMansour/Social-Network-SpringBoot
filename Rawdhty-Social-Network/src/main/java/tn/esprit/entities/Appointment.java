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
@Table(name="T_Appointments")
public class Appointment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Appointment_ID")
	private Long Appoinment_Id ; 
	private Date  Appoinment_Date ; 
	private String  Appoinment_Subject ;
	
	@Enumerated(EnumType.STRING ) 
	private Appointment_Place  appoitnment_place ;
	@Enumerated(EnumType.STRING ) 
	private Appoitnment_Type   appoitnment_type ;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(Long appoinment_Id, Date appoinment_Date, String appoinment_Subject,
			Appointment_Place appoitnment_place, Appoitnment_Type appoitnment_type) {
		super();
		Appoinment_Id = appoinment_Id;
		Appoinment_Date = appoinment_Date;
		Appoinment_Subject = appoinment_Subject;
		this.appoitnment_place = appoitnment_place;
		this.appoitnment_type = appoitnment_type;
	}
	public Long getAppoinment_Id() {
		return Appoinment_Id;
	}
	public void setAppoinment_Id(Long appoinment_Id) {
		Appoinment_Id = appoinment_Id;
	}
	public Date getAppoinment_Date() {
		return Appoinment_Date;
	}
	public void setAppoinment_Date(Date appoinment_Date) {
		Appoinment_Date = appoinment_Date;
	}
	public String getAppoinment_Subject() {
		return Appoinment_Subject;
	}
	public void setAppoinment_Subject(String appoinment_Subject) {
		Appoinment_Subject = appoinment_Subject;
	}
	public Appointment_Place getAppoitnment_place() {
		return appoitnment_place;
	}
	public void setAppoitnment_place(Appointment_Place appoitnment_place) {
		this.appoitnment_place = appoitnment_place;
	}
	public Appoitnment_Type getAppoitnment_type() {
		return appoitnment_type;
	}
	public void setAppoitnment_type(Appoitnment_Type appoitnment_type) {
		this.appoitnment_type = appoitnment_type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Appoinment_Date == null) ? 0 : Appoinment_Date.hashCode());
		result = prime * result + ((Appoinment_Id == null) ? 0 : Appoinment_Id.hashCode());
		result = prime * result + ((Appoinment_Subject == null) ? 0 : Appoinment_Subject.hashCode());
		result = prime * result + ((appoitnment_place == null) ? 0 : appoitnment_place.hashCode());
		result = prime * result + ((appoitnment_type == null) ? 0 : appoitnment_type.hashCode());
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
		Appointment other = (Appointment) obj;
		if (Appoinment_Date == null) {
			if (other.Appoinment_Date != null)
				return false;
		} else if (!Appoinment_Date.equals(other.Appoinment_Date))
			return false;
		if (Appoinment_Id == null) {
			if (other.Appoinment_Id != null)
				return false;
		} else if (!Appoinment_Id.equals(other.Appoinment_Id))
			return false;
		if (Appoinment_Subject == null) {
			if (other.Appoinment_Subject != null)
				return false;
		} else if (!Appoinment_Subject.equals(other.Appoinment_Subject))
			return false;
		if (appoitnment_place != other.appoitnment_place)
			return false;
		if (appoitnment_type != other.appoitnment_type)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Appointment [Appoinment_Id=" + Appoinment_Id + ", Appoinment_Date=" + Appoinment_Date
				+ ", Appoinment_Subject=" + Appoinment_Subject + ", appoitnment_place=" + appoitnment_place
				+ ", appoitnment_type=" + appoitnment_type + "]";
	}
	
	

}
