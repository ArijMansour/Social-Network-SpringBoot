package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="T_Parents")
public class Parent implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Parent_ID")	
	private Long Parent_Id ; 
	private String Parent_First_name ;
	private String  Parent_Last_name ;
	private String  Parent_Adresse ; 
	private String  Parent_Telephone ; 
	private String  Parent_Cin ; 
	private String  Parent_Date ;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent(Long parent_Id, String parent_First_name, String parent_Last_name, String parent_Adresse,
			String parent_Telephone, String parent_Cin, String parent_Date) {
		super();
		Parent_Id = parent_Id;
		Parent_First_name = parent_First_name;
		Parent_Last_name = parent_Last_name;
		Parent_Adresse = parent_Adresse;
		Parent_Telephone = parent_Telephone;
		Parent_Cin = parent_Cin;
		Parent_Date = parent_Date;
	}
	public Long getParent_Id() {
		return Parent_Id;
	}
	public void setParent_Id(Long parent_Id) {
		Parent_Id = parent_Id;
	}
	public String getParent_First_name() {
		return Parent_First_name;
	}
	public void setParent_First_name(String parent_First_name) {
		Parent_First_name = parent_First_name;
	}
	public String getParent_Last_name() {
		return Parent_Last_name;
	}
	public void setParent_Last_name(String parent_Last_name) {
		Parent_Last_name = parent_Last_name;
	}
	public String getParent_Adresse() {
		return Parent_Adresse;
	}
	public void setParent_Adresse(String parent_Adresse) {
		Parent_Adresse = parent_Adresse;
	}
	public String getParent_Telephone() {
		return Parent_Telephone;
	}
	public void setParent_Telephone(String parent_Telephone) {
		Parent_Telephone = parent_Telephone;
	}
	public String getParent_Cin() {
		return Parent_Cin;
	}
	public void setParent_Cin(String parent_Cin) {
		Parent_Cin = parent_Cin;
	}
	public String getParent_Date() {
		return Parent_Date;
	}
	public void setParent_Date(String parent_Date) {
		Parent_Date = parent_Date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Parent_Adresse == null) ? 0 : Parent_Adresse.hashCode());
		result = prime * result + ((Parent_Cin == null) ? 0 : Parent_Cin.hashCode());
		result = prime * result + ((Parent_Date == null) ? 0 : Parent_Date.hashCode());
		result = prime * result + ((Parent_First_name == null) ? 0 : Parent_First_name.hashCode());
		result = prime * result + ((Parent_Id == null) ? 0 : Parent_Id.hashCode());
		result = prime * result + ((Parent_Last_name == null) ? 0 : Parent_Last_name.hashCode());
		result = prime * result + ((Parent_Telephone == null) ? 0 : Parent_Telephone.hashCode());
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
		Parent other = (Parent) obj;
		if (Parent_Adresse == null) {
			if (other.Parent_Adresse != null)
				return false;
		} else if (!Parent_Adresse.equals(other.Parent_Adresse))
			return false;
		if (Parent_Cin == null) {
			if (other.Parent_Cin != null)
				return false;
		} else if (!Parent_Cin.equals(other.Parent_Cin))
			return false;
		if (Parent_Date == null) {
			if (other.Parent_Date != null)
				return false;
		} else if (!Parent_Date.equals(other.Parent_Date))
			return false;
		if (Parent_First_name == null) {
			if (other.Parent_First_name != null)
				return false;
		} else if (!Parent_First_name.equals(other.Parent_First_name))
			return false;
		if (Parent_Id == null) {
			if (other.Parent_Id != null)
				return false;
		} else if (!Parent_Id.equals(other.Parent_Id))
			return false;
		if (Parent_Last_name == null) {
			if (other.Parent_Last_name != null)
				return false;
		} else if (!Parent_Last_name.equals(other.Parent_Last_name))
			return false;
		if (Parent_Telephone == null) {
			if (other.Parent_Telephone != null)
				return false;
		} else if (!Parent_Telephone.equals(other.Parent_Telephone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Parent [Parent_Id=" + Parent_Id + ", Parent_First_name=" + Parent_First_name + ", Parent_Last_name="
				+ Parent_Last_name + ", Parent_Adresse=" + Parent_Adresse + ", Parent_Telephone=" + Parent_Telephone
				+ ", Parent_Cin=" + Parent_Cin + ", Parent_Date=" + Parent_Date + "]";
	}

}
