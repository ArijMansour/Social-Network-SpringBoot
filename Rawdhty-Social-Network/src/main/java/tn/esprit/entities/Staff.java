package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Staff")
public class Staff implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Staff_ID")
	private Long Staff_Id ; 
	private String Staff_First_name ;
	private String  Staff_Last_name ;
	private String  Staff_Adresse ; 
	private String  Staff_Telephone ; 
	private String  Staff_Cin ; 
	private String  Staff_Date ;
	
	@Enumerated(EnumType.STRING ) 
	private Role role ;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(Long staff_Id, String staff_First_name, String staff_Last_name, String staff_Adresse,
			String staff_Telephone, String staff_Cin, String staff_Date, Role role) {
		super();
		Staff_Id = staff_Id;
		Staff_First_name = staff_First_name;
		Staff_Last_name = staff_Last_name;
		Staff_Adresse = staff_Adresse;
		Staff_Telephone = staff_Telephone;
		Staff_Cin = staff_Cin;
		Staff_Date = staff_Date;
		this.role = role;
	}

	public Long getStaff_Id() {
		return Staff_Id;
	}

	public void setStaff_Id(Long staff_Id) {
		Staff_Id = staff_Id;
	}

	public String getStaff_First_name() {
		return Staff_First_name;
	}

	public void setStaff_First_name(String staff_First_name) {
		Staff_First_name = staff_First_name;
	}

	public String getStaff_Last_name() {
		return Staff_Last_name;
	}

	public void setStaff_Last_name(String staff_Last_name) {
		Staff_Last_name = staff_Last_name;
	}

	public String getStaff_Adresse() {
		return Staff_Adresse;
	}

	public void setStaff_Adresse(String staff_Adresse) {
		Staff_Adresse = staff_Adresse;
	}

	public String getStaff_Telephone() {
		return Staff_Telephone;
	}

	public void setStaff_Telephone(String staff_Telephone) {
		Staff_Telephone = staff_Telephone;
	}

	public String getStaff_Cin() {
		return Staff_Cin;
	}

	public void setStaff_Cin(String staff_Cin) {
		Staff_Cin = staff_Cin;
	}

	public String getStaff_Date() {
		return Staff_Date;
	}

	public void setStaff_Date(String staff_Date) {
		Staff_Date = staff_Date;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Staff_Adresse == null) ? 0 : Staff_Adresse.hashCode());
		result = prime * result + ((Staff_Cin == null) ? 0 : Staff_Cin.hashCode());
		result = prime * result + ((Staff_Date == null) ? 0 : Staff_Date.hashCode());
		result = prime * result + ((Staff_First_name == null) ? 0 : Staff_First_name.hashCode());
		result = prime * result + ((Staff_Id == null) ? 0 : Staff_Id.hashCode());
		result = prime * result + ((Staff_Last_name == null) ? 0 : Staff_Last_name.hashCode());
		result = prime * result + ((Staff_Telephone == null) ? 0 : Staff_Telephone.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		Staff other = (Staff) obj;
		if (Staff_Adresse == null) {
			if (other.Staff_Adresse != null)
				return false;
		} else if (!Staff_Adresse.equals(other.Staff_Adresse))
			return false;
		if (Staff_Cin == null) {
			if (other.Staff_Cin != null)
				return false;
		} else if (!Staff_Cin.equals(other.Staff_Cin))
			return false;
		if (Staff_Date == null) {
			if (other.Staff_Date != null)
				return false;
		} else if (!Staff_Date.equals(other.Staff_Date))
			return false;
		if (Staff_First_name == null) {
			if (other.Staff_First_name != null)
				return false;
		} else if (!Staff_First_name.equals(other.Staff_First_name))
			return false;
		if (Staff_Id == null) {
			if (other.Staff_Id != null)
				return false;
		} else if (!Staff_Id.equals(other.Staff_Id))
			return false;
		if (Staff_Last_name == null) {
			if (other.Staff_Last_name != null)
				return false;
		} else if (!Staff_Last_name.equals(other.Staff_Last_name))
			return false;
		if (Staff_Telephone == null) {
			if (other.Staff_Telephone != null)
				return false;
		} else if (!Staff_Telephone.equals(other.Staff_Telephone))
			return false;
		if (role != other.role)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Staff [Staff_Id=" + Staff_Id + ", Staff_First_name=" + Staff_First_name + ", Staff_Last_name="
				+ Staff_Last_name + ", Staff_Adresse=" + Staff_Adresse + ", Staff_Telephone=" + Staff_Telephone
				+ ", Staff_Cin=" + Staff_Cin + ", Staff_Date=" + Staff_Date + ", role=" + role + "]";
	}

}
