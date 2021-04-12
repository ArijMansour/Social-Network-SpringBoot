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
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
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
	@JoinColumn(name= "id_user")
	private User user;
  
 

public static long getSerialversionuid() {
	return serialVersionUID;
}



public Activity(User user) {
	super();
	
}

public Activity(Long activity_Id, String activity_Name, String activity_Type, String activity_Description,
		String activity_Image, int activity_Status, Date date_debut, Date date_fin) {
	super();
	Activity_Id = activity_Id;
	Activity_Name = activity_Name;
	Activity_Type = activity_Type;
	Activity_Description = activity_Description;
	Activity_Image = activity_Image;
	Activity_Status = activity_Status;
	this.date_debut = date_debut;
	this.date_fin = date_fin;
	
}

public int getActivity_Status() {
	return Activity_Status;
}

public void setActivity_Status(int activity_Status) {
	Activity_Status = activity_Status;
}

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

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Activity_Description == null) ? 0 : Activity_Description.hashCode());
	result = prime * result + ((Activity_Id == null) ? 0 : Activity_Id.hashCode());
	result = prime * result + ((Activity_Image == null) ? 0 : Activity_Image.hashCode());
	result = prime * result + ((Activity_Name == null) ? 0 : Activity_Name.hashCode());
	result = prime * result + ((Activity_Type == null) ? 0 : Activity_Type.hashCode());
	result = prime * result + ((date_debut == null) ? 0 : date_debut.hashCode());
	result = prime * result + ((date_fin == null) ? 0 : date_fin.hashCode());
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
	Activity other = (Activity) obj;
	if (Activity_Description == null) {
		if (other.Activity_Description != null)
			return false;
	} else if (!Activity_Description.equals(other.Activity_Description))
		return false;
	if (Activity_Id == null) {
		if (other.Activity_Id != null)
			return false;
	} else if (!Activity_Id.equals(other.Activity_Id))
		return false;
	if (Activity_Image == null) {
		if (other.Activity_Image != null)
			return false;
	} else if (!Activity_Image.equals(other.Activity_Image))
		return false;
	if (Activity_Name == null) {
		if (other.Activity_Name != null)
			return false;
	} else if (!Activity_Name.equals(other.Activity_Name))
		return false;
	if (Activity_Type == null) {
		if (other.Activity_Type != null)
			return false;
	} else if (!Activity_Type.equals(other.Activity_Type))
		return false;
	if (date_debut == null) {
		if (other.date_debut != null)
			return false;
	} else if (!date_debut.equals(other.date_debut))
		return false;
	if (date_fin == null) {
		if (other.date_fin != null)
			return false;
	} else if (!date_fin.equals(other.date_fin))
		return false;
	return true;
}

@Override
public String toString() {
	return "Activity [Activity_Id=" + Activity_Id + ", Activity_Name=" + Activity_Name + ", Activity_Type="
			+ Activity_Type + ", Activity_Description=" + Activity_Description + ", Activity_Image=" + Activity_Image
			+ ", date_debut=" + date_debut + ", date_fin=" + date_fin + "]";
}

public Activity() {
	super();
	// TODO Auto-generated constructor stub
}

public Activity(Long activity_Id, String activity_Name, String activity_Type, String activity_Description,
		String activity_Image, Date date_debut, Date date_fin) {
	super();
	Activity_Id = activity_Id;
	Activity_Name = activity_Name;
	Activity_Type = activity_Type;
	Activity_Description = activity_Description;
	Activity_Image = activity_Image;
	this.date_debut = date_debut;
	this.date_fin = date_fin;
}


 
 
	
}
