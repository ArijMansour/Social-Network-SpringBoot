package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="T_BusDrivers")
public class BusDriver implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BusDriver_ID")
	private Long BusDriver_Id ;

	public BusDriver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusDriver(Long busDriver_Id) {
		super();
		BusDriver_Id = busDriver_Id;
	}

	public Long getBusDriver_Id() {
		return BusDriver_Id;
	}

	public void setBusDriver_Id(Long busDriver_Id) {
		BusDriver_Id = busDriver_Id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BusDriver_Id == null) ? 0 : BusDriver_Id.hashCode());
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
		BusDriver other = (BusDriver) obj;
		if (BusDriver_Id == null) {
			if (other.BusDriver_Id != null)
				return false;
		} else if (!BusDriver_Id.equals(other.BusDriver_Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BusDriver [BusDriver_Id=" + BusDriver_Id + "]";
	}

}
