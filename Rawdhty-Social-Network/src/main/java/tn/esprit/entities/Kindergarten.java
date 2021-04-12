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
@Table(name="T_Kindergartens")
public class Kindergarten implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Kindergarden_ID")
	private Long Kindergarden_Id ;
	private String Kindergarden_name ;
	private String kindergarden_adresse ; 
	private Long Kindergarden_phone ; 
	private String Kindergarden_Matricule_Fiscale ; 
	private Date Kindergarden_Date ; 
	private String Kindergarden_Email ;
	public Kindergarten() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kindergarten(Long kindergarden_Id, String kindergarden_name, String kindergarden_adresse,
			Long kindergarden_phone, String kindergarden_Matricule_Fiscale, Date kindergarden_Date,
			String kindergarden_Email) {
		super();
		Kindergarden_Id = kindergarden_Id;
		Kindergarden_name = kindergarden_name;
		this.kindergarden_adresse = kindergarden_adresse;
		Kindergarden_phone = kindergarden_phone;
		Kindergarden_Matricule_Fiscale = kindergarden_Matricule_Fiscale;
		Kindergarden_Date = kindergarden_Date;
		Kindergarden_Email = kindergarden_Email;
	}
	public Long getKindergarden_Id() {
		return Kindergarden_Id;
	}
	public void setKindergarden_Id(Long kindergarden_Id) {
		Kindergarden_Id = kindergarden_Id;
	}
	public String getKindergarden_name() {
		return Kindergarden_name;
	}
	public void setKindergarden_name(String kindergarden_name) {
		Kindergarden_name = kindergarden_name;
	}
	public String getKindergarden_adresse() {
		return kindergarden_adresse;
	}
	public void setKindergarden_adresse(String kindergarden_adresse) {
		this.kindergarden_adresse = kindergarden_adresse;
	}
	public Long getKindergarden_phone() {
		return Kindergarden_phone;
	}
	public void setKindergarden_phone(Long kindergarden_phone) {
		Kindergarden_phone = kindergarden_phone;
	}
	public String getKindergarden_Matricule_Fiscale() {
		return Kindergarden_Matricule_Fiscale;
	}
	public void setKindergarden_Matricule_Fiscale(String kindergarden_Matricule_Fiscale) {
		Kindergarden_Matricule_Fiscale = kindergarden_Matricule_Fiscale;
	}
	public Date getKindergarden_Date() {
		return Kindergarden_Date;
	}
	public void setKindergarden_Date(Date kindergarden_Date) {
		Kindergarden_Date = kindergarden_Date;
	}
	public String getKindergarden_Email() {
		return Kindergarden_Email;
	}
	public void setKindergarden_Email(String kindergarden_Email) {
		Kindergarden_Email = kindergarden_Email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Kindergarden_Date == null) ? 0 : Kindergarden_Date.hashCode());
		result = prime * result + ((Kindergarden_Email == null) ? 0 : Kindergarden_Email.hashCode());
		result = prime * result + ((Kindergarden_Id == null) ? 0 : Kindergarden_Id.hashCode());
		result = prime * result
				+ ((Kindergarden_Matricule_Fiscale == null) ? 0 : Kindergarden_Matricule_Fiscale.hashCode());
		result = prime * result + ((Kindergarden_name == null) ? 0 : Kindergarden_name.hashCode());
		result = prime * result + ((Kindergarden_phone == null) ? 0 : Kindergarden_phone.hashCode());
		result = prime * result + ((kindergarden_adresse == null) ? 0 : kindergarden_adresse.hashCode());
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
		Kindergarten other = (Kindergarten) obj;
		if (Kindergarden_Date == null) {
			if (other.Kindergarden_Date != null)
				return false;
		} else if (!Kindergarden_Date.equals(other.Kindergarden_Date))
			return false;
		if (Kindergarden_Email == null) {
			if (other.Kindergarden_Email != null)
				return false;
		} else if (!Kindergarden_Email.equals(other.Kindergarden_Email))
			return false;
		if (Kindergarden_Id == null) {
			if (other.Kindergarden_Id != null)
				return false;
		} else if (!Kindergarden_Id.equals(other.Kindergarden_Id))
			return false;
		if (Kindergarden_Matricule_Fiscale == null) {
			if (other.Kindergarden_Matricule_Fiscale != null)
				return false;
		} else if (!Kindergarden_Matricule_Fiscale.equals(other.Kindergarden_Matricule_Fiscale))
			return false;
		if (Kindergarden_name == null) {
			if (other.Kindergarden_name != null)
				return false;
		} else if (!Kindergarden_name.equals(other.Kindergarden_name))
			return false;
		if (Kindergarden_phone == null) {
			if (other.Kindergarden_phone != null)
				return false;
		} else if (!Kindergarden_phone.equals(other.Kindergarden_phone))
			return false;
		if (kindergarden_adresse == null) {
			if (other.kindergarden_adresse != null)
				return false;
		} else if (!kindergarden_adresse.equals(other.kindergarden_adresse))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kindergarten [Kindergarden_Id=" + Kindergarden_Id + ", Kindergarden_name=" + Kindergarden_name
				+ ", kindergarden_adresse=" + kindergarden_adresse + ", Kindergarden_phone=" + Kindergarden_phone
				+ ", Kindergarden_Matricule_Fiscale=" + Kindergarden_Matricule_Fiscale + ", Kindergarden_Date="
				+ Kindergarden_Date + ", Kindergarden_Email=" + Kindergarden_Email + "]";
	}

}
