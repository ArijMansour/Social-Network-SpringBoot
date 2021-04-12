package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="T_Doctors")
public class Doctor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Doctor_ID")
	private Long Doctor_Id ;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Long doctor_Id) {
		super();
		Doctor_Id = doctor_Id;
	}

	public Long getDoctor_Id() {
		return Doctor_Id;
	}

	public void setDoctor_Id(Long doctor_Id) {
		Doctor_Id = doctor_Id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Doctor_Id == null) ? 0 : Doctor_Id.hashCode());
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
		Doctor other = (Doctor) obj;
		if (Doctor_Id == null) {
			if (other.Doctor_Id != null)
				return false;
		} else if (!Doctor_Id.equals(other.Doctor_Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [Doctor_Id=" + Doctor_Id + "]";
	}

}
