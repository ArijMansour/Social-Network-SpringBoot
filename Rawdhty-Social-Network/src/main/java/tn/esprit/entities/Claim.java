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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Claim [Claims_Id=" + Claims_Id + ", Claims_Description=" + Claims_Description + ", Claims_Date="
				+ Claims_Date + ", Claims_image=" + Claims_image + ", cl_Type=" + cl_Type + "]";
	}

	

}
