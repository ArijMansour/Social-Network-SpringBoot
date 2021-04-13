package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "T_Claims")
public class Claim implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Claims_ID")
	private Long Claims_Id;
	private String Claims_Description;
	private Date Claims_Date;
	private String Claims_image;
	@Enumerated(EnumType.STRING)
	private Claims_Type cl_Type;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Claim(Long claims_Id, String claims_Description, Date claims_Date, String claims_image,
			Claims_Type cl_Type) {
		super();
		Claims_Id = claims_Id;
		Claims_Description = claims_Description;
		Claims_Date = claims_Date;
		Claims_image = claims_image;
		this.cl_Type = cl_Type;
	}

	public Claim(String claims_Description, Date claims_Date, String claims_image, Claims_Type cl_Type) {
		super();
		Claims_Description = claims_Description;
		Claims_Date = claims_Date;
		Claims_image = claims_image;
		this.cl_Type = cl_Type;
	}

	public Claim(String claims_Description, Date claims_Date, String claims_image, Claims_Type cl_Type, User user) {
		super();
		Claims_Description = claims_Description;
		Claims_Date = claims_Date;
		Claims_image = claims_image;
		this.cl_Type = cl_Type;
		this.user = user;
	}

	public Long getClaims_Id() {
		return Claims_Id;
	}

	public void setClaims_Id(Long claims_Id) {
		Claims_Id = claims_Id;
	}

	public String getClaims_Description() {
		return Claims_Description;
	}

	public void setClaims_Description(String claims_Description) {
		Claims_Description = claims_Description;
	}

	public Date getClaims_Date() {
		return Claims_Date;
	}

	public void setClaims_Date(Date claims_Date) {
		Claims_Date = claims_Date;
	}

	public String getClaims_image() {
		return Claims_image;
	}

	public void setClaims_image(String claims_image) {
		Claims_image = claims_image;
	}

	public Claims_Type getCl_Type() {
		return cl_Type;
	}

	public void setCl_Type(Claims_Type cl_Type) {
		this.cl_Type = cl_Type;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Claims_Date == null) ? 0 : Claims_Date.hashCode());
		result = prime * result + ((Claims_Description == null) ? 0 : Claims_Description.hashCode());
		result = prime * result + ((Claims_Id == null) ? 0 : Claims_Id.hashCode());
		result = prime * result + ((Claims_image == null) ? 0 : Claims_image.hashCode());
		result = prime * result + ((cl_Type == null) ? 0 : cl_Type.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Claim other = (Claim) obj;
		if (Claims_Date == null) {
			if (other.Claims_Date != null)
				return false;
		} else if (!Claims_Date.equals(other.Claims_Date))
			return false;
		if (Claims_Description == null) {
			if (other.Claims_Description != null)
				return false;
		} else if (!Claims_Description.equals(other.Claims_Description))
			return false;
		if (Claims_Id == null) {
			if (other.Claims_Id != null)
				return false;
		} else if (!Claims_Id.equals(other.Claims_Id))
			return false;
		if (Claims_image == null) {
			if (other.Claims_image != null)
				return false;
		} else if (!Claims_image.equals(other.Claims_image))
			return false;
		if (cl_Type != other.cl_Type)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Claim [Claims_Id=" + Claims_Id + ", Claims_Description=" + Claims_Description + ", Claims_Date="
				+ Claims_Date + ", Claims_image=" + Claims_image + ", cl_Type=" + cl_Type + "]";
	}

}
