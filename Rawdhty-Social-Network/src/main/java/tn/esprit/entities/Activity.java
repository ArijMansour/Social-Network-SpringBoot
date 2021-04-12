package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="T_Activities")
public class Activity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Activity_ID")
	private Long Activity_Id ; 
	private String Activity_Name ; 
	private String Activity_Type ; 
	private Date Activity_Date_Begin ; 
	private Date Activity_Date_Finish ;
	private String Activity_Description ; 
	private String Activity_Image ;
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Activity(Long activity_Id, String activity_Name, String activity_Type, Date activity_Date_Begin,
			Date activity_Date_Finish, String activity_Description, String activity_Image) {
		super();
		Activity_Id = activity_Id;
		Activity_Name = activity_Name;
		Activity_Type = activity_Type;
		Activity_Date_Begin = activity_Date_Begin;
		Activity_Date_Finish = activity_Date_Finish;
		Activity_Description = activity_Description;
		Activity_Image = activity_Image;
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
	public Date getActivity_Date_Begin() {
		return Activity_Date_Begin;
	}
	public void setActivity_Date_Begin(Date activity_Date_Begin) {
		Activity_Date_Begin = activity_Date_Begin;
	}
	public Date getActivity_Date_Finish() {
		return Activity_Date_Finish;
	}
	public void setActivity_Date_Finish(Date activity_Date_Finish) {
		Activity_Date_Finish = activity_Date_Finish;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Activity_Date_Begin == null) ? 0 : Activity_Date_Begin.hashCode());
		result = prime * result + ((Activity_Date_Finish == null) ? 0 : Activity_Date_Finish.hashCode());
		result = prime * result + ((Activity_Description == null) ? 0 : Activity_Description.hashCode());
		result = prime * result + ((Activity_Id == null) ? 0 : Activity_Id.hashCode());
		result = prime * result + ((Activity_Image == null) ? 0 : Activity_Image.hashCode());
		result = prime * result + ((Activity_Name == null) ? 0 : Activity_Name.hashCode());
		result = prime * result + ((Activity_Type == null) ? 0 : Activity_Type.hashCode());
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
		if (Activity_Date_Begin == null) {
			if (other.Activity_Date_Begin != null)
				return false;
		} else if (!Activity_Date_Begin.equals(other.Activity_Date_Begin))
			return false;
		if (Activity_Date_Finish == null) {
			if (other.Activity_Date_Finish != null)
				return false;
		} else if (!Activity_Date_Finish.equals(other.Activity_Date_Finish))
			return false;
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
		return true;
	}
	@Override
	public String toString() {
		return "Activity [Activity_Id=" + Activity_Id + ", Activity_Name=" + Activity_Name + ", Activity_Type="
				+ Activity_Type + ", Activity_Date_Begin=" + Activity_Date_Begin + ", Activity_Date_Finish="
				+ Activity_Date_Finish + ", Activity_Description=" + Activity_Description + ", Activity_Image="
				+ Activity_Image + "]";
	}

}
