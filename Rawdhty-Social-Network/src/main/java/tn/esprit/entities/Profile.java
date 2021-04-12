package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ta_profile")

public class Profile implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="profile_ID")
	private Long id ;
	private String bio ;
	private String city ;
	public Profile() {
		
	
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(Long id, String bio, String city) {
		super();
		this.id = id;
		this.bio = bio;
		this.city = city;
	}
	public Profile( String bio, String city) {
		super();
		this.bio = bio;
		this.city = city;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", bio=" + bio + ", city=" + city + "]";
	}
	
	
	
	
}
