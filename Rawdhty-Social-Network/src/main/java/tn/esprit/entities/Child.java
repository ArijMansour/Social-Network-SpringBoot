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
@Table(name="T_Child")
public class Child implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Child_ID")
	private Long Child_ID ;
	private String Child_F_name ;
	private String Child_L_name ;
	private Date Child_Birth_Date ; 
	private String Child_Adresse ;
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child(Long child_ID, String child_F_name, String child_L_name, Date child_Birth_Date, String child_Adresse) {
		super();
		Child_ID = child_ID;
		Child_F_name = child_F_name;
		Child_L_name = child_L_name;
		Child_Birth_Date = child_Birth_Date;
		Child_Adresse = child_Adresse;
	}
	public Long getChild_ID() {
		return Child_ID;
	}
	public void setChild_ID(Long child_ID) {
		Child_ID = child_ID;
	}
	public String getChild_F_name() {
		return Child_F_name;
	}
	public void setChild_F_name(String child_F_name) {
		Child_F_name = child_F_name;
	}
	public String getChild_L_name() {
		return Child_L_name;
	}
	public void setChild_L_name(String child_L_name) {
		Child_L_name = child_L_name;
	}
	public Date getChild_Birth_Date() {
		return Child_Birth_Date;
	}
	public void setChild_Birth_Date(Date child_Birth_Date) {
		Child_Birth_Date = child_Birth_Date;
	}
	public String getChild_Adresse() {
		return Child_Adresse;
	}
	public void setChild_Adresse(String child_Adresse) {
		Child_Adresse = child_Adresse;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Child_Adresse == null) ? 0 : Child_Adresse.hashCode());
		result = prime * result + ((Child_Birth_Date == null) ? 0 : Child_Birth_Date.hashCode());
		result = prime * result + ((Child_F_name == null) ? 0 : Child_F_name.hashCode());
		result = prime * result + ((Child_ID == null) ? 0 : Child_ID.hashCode());
		result = prime * result + ((Child_L_name == null) ? 0 : Child_L_name.hashCode());
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
		Child other = (Child) obj;
		if (Child_Adresse == null) {
			if (other.Child_Adresse != null)
				return false;
		} else if (!Child_Adresse.equals(other.Child_Adresse))
			return false;
		if (Child_Birth_Date == null) {
			if (other.Child_Birth_Date != null)
				return false;
		} else if (!Child_Birth_Date.equals(other.Child_Birth_Date))
			return false;
		if (Child_F_name == null) {
			if (other.Child_F_name != null)
				return false;
		} else if (!Child_F_name.equals(other.Child_F_name))
			return false;
		if (Child_ID == null) {
			if (other.Child_ID != null)
				return false;
		} else if (!Child_ID.equals(other.Child_ID))
			return false;
		if (Child_L_name == null) {
			if (other.Child_L_name != null)
				return false;
		} else if (!Child_L_name.equals(other.Child_L_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Child [Child_ID=" + Child_ID + ", Child_F_name=" + Child_F_name + ", Child_L_name=" + Child_L_name
				+ ", Child_Birth_Date=" + Child_Birth_Date + ", Child_Adresse=" + Child_Adresse + "]";
	}

}
