package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="T_Educators")
public class Educator implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Educator_ID")
	private Long Educator_Id ;

	public Educator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Educator(Long educator_Id) {
		super();
		Educator_Id = educator_Id;
	}

	public Long getEducator_Id() {
		return Educator_Id;
	}

	public void setEducator_Id(Long educator_Id) {
		Educator_Id = educator_Id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Educator_Id == null) ? 0 : Educator_Id.hashCode());
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
		Educator other = (Educator) obj;
		if (Educator_Id == null) {
			if (other.Educator_Id != null)
				return false;
		} else if (!Educator_Id.equals(other.Educator_Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Educator [Educator_Id=" + Educator_Id + "]";
	}

}
