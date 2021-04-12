package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_KindergartenOwners")
public class KindergartenOwner implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="KindergardenOwner_ID")
    private Long KindergardenOwner_Id ;

	public KindergartenOwner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KindergartenOwner(Long kindergardenOwner_Id) {
		super();
		KindergardenOwner_Id = kindergardenOwner_Id;
	}

	public Long getKindergardenOwner_Id() {
		return KindergardenOwner_Id;
	}

	public void setKindergardenOwner_Id(Long kindergardenOwner_Id) {
		KindergardenOwner_Id = kindergardenOwner_Id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((KindergardenOwner_Id == null) ? 0 : KindergardenOwner_Id.hashCode());
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
		KindergartenOwner other = (KindergartenOwner) obj;
		if (KindergardenOwner_Id == null) {
			if (other.KindergardenOwner_Id != null)
				return false;
		} else if (!KindergardenOwner_Id.equals(other.KindergardenOwner_Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KindergartenOwner [KindergardenOwner_Id=" + KindergardenOwner_Id + "]";
	}

}
