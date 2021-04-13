package tn.esprit.entities;

import java.io.Serializable;
import java.util.* ;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore; 
@Entity 
@Table(name="T_Activities")
public class Activity implements  Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Activity_ID")
	private Long Activity_Id ; 
	private String Activity_Name ; 
	private String Activity_Type ; 
	private String Activity_Description ; 
	private String Activity_Image ;
	private int Activity_Status ;
	
 @Temporal (TemporalType.DATE)
     
	 private Date date_debut ;
 
 @Temporal (TemporalType.DATE)
 private Date date_fin ;
 
 
   @JsonIgnore
	@ManyToOne
	@JoinColumn(name= "iduser")
	private User user;

public Long getActivity_Id() {
	return Activity_Id;
}


public void setActivity_Id(Long activity_Id) {
	Activity_Id = activity_Id;
}


public String getActivity_Name() {
	return Activity_Name;
}


public void setActivity_Name(String activity_Name) {
	Activity_Name = activity_Name;
}


public String getActivity_Type() {
	return Activity_Type;
}


public void setActivity_Type(String activity_Type) {
	Activity_Type = activity_Type;
}


public String getActivity_Description() {
	return Activity_Description;
}


public void setActivity_Description(String activity_Description) {
	Activity_Description = activity_Description;
}


public String getActivity_Image() {
	return Activity_Image;
}


public void setActivity_Image(String activity_Image) {
	Activity_Image = activity_Image;
}


public int getActivity_Status() {
	return Activity_Status;
}


public void setActivity_Status(int activity_Status) {
	Activity_Status = activity_Status;
}


public Date getDate_debut() {
	return date_debut;
}


public void setDate_debut(Date date_debut) {
	this.date_debut = date_debut;
}


public Date getDate_fin() {
	return date_fin;
}


public void setDate_fin(Date date_fin) {
	this.date_fin = date_fin;
}


public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}


@Override
public String toString() {
	return "Activity [Activity_Id=" + Activity_Id + ", Activity_Name=" + Activity_Name + ", Activity_Type="
			+ Activity_Type + ", Activity_Description=" + Activity_Description + ", Activity_Image=" + Activity_Image
			+ ", Activity_Status=" + Activity_Status + ", date_debut=" + date_debut + ", date_fin=" + date_fin
			+ ", user=" + user + "]";
}


public Activity(Long activity_Id, String activity_Name, String activity_Type, String activity_Description,
		String activity_Image, int activity_Status, Date date_debut, Date date_fin, User user) {
	super();
	Activity_Id = activity_Id;
	Activity_Name = activity_Name;
	Activity_Type = activity_Type;
	Activity_Description = activity_Description;
	Activity_Image = activity_Image;
	Activity_Status = activity_Status;
	this.date_debut = date_debut;
	this.date_fin = date_fin;
	this.user = user;
}


public Activity() {
	super();
	// TODO Auto-generated constructor stub
}
 




}


 
 
	

