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
@Table(name="T_Clubs")
public class Club implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Club_ID")
	private Long Club_Id ; 
	private String Club_Description ; 
	
	@Enumerated(EnumType.STRING) 
	private Club_Type club_type ;

	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Club(Long club_Id, String club_Description, Club_Type club_type) {
		super();
		Club_Id = club_Id;
		Club_Description = club_Description;
		this.club_type = club_type;
	}

	public Long getClub_Id() {
		return Club_Id;
	}

	public void setClub_Id(Long club_Id) {
		Club_Id = club_Id;
	}

	public String getClub_Description() {
		return Club_Description;
	}

	public void setClub_Description(String club_Description) {
		Club_Description = club_Description;
	}

	public Club_Type getClub_type() {
		return club_type;
	}

	public void setClub_type(Club_Type club_type) {
		this.club_type = club_type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Club_Description == null) ? 0 : Club_Description.hashCode());
		result = prime * result + ((Club_Id == null) ? 0 : Club_Id.hashCode());
		result = prime * result + ((club_type == null) ? 0 : club_type.hashCode());
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
		Club other = (Club) obj;
		if (Club_Description == null) {
			if (other.Club_Description != null)
				return false;
		} else if (!Club_Description.equals(other.Club_Description))
			return false;
		if (Club_Id == null) {
			if (other.Club_Id != null)
				return false;
		} else if (!Club_Id.equals(other.Club_Id))
			return false;
		if (club_type != other.club_type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Club [Club_Id=" + Club_Id + ", Club_Description=" + Club_Description + ", club_type=" + club_type + "]";
	}

}
