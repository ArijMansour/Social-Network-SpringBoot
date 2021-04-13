package tn.esprit.entities;


import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.esprit.entities.Activity;

@Entity
@Table(name = "T_Users")
public class User implements Serializable {
	// ok
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Email;
	private String Password;
	private String First_name;
	private String Last_name;
	private String Adresse;
	private String Telephone;
	private String Cin;
	private String Date;
	private int Status = 1;
	private String login ; //arij ** 
	private String gender ; //arij
	@Enumerated(EnumType.STRING)
	private Role role;
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	//private Set<Claim> claims;
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	//private Set<Meeting> meetings;
	
	 private boolean Valid ;
	 
	// @JsonIgnore
	 @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
		private Set<Activity> activity;
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public String getCin() {
		return Cin;
	}

	public void setCin(String cin) {
		Cin = cin;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isValid() {
		return Valid;
	}

	public void setValid(boolean valid) {
		Valid = valid;
	}

	public Set<Activity> getActivity() {
		return activity;
	}

	public void setActivity(Set<Activity> activity) {
		this.activity = activity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User(Long id, String email, String password, String first_name, String last_name, String adresse,
			String telephone, String cin, String date, int status, String login, String gender, Role role,
			boolean valid, Set<Activity> activity) {
		super();
		Id = id;
		Email = email;
		Password = password;
		First_name = first_name;
		Last_name = last_name;
		Adresse = adresse;
		Telephone = telephone;
		Cin = cin;
		Date = date;
		Status = status;
		this.login = login;
		this.gender = gender;
		this.role = role;
		Valid = valid;
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", Email=" + Email + ", Password=" + Password + ", First_name=" + First_name
				+ ", Last_name=" + Last_name + ", Adresse=" + Adresse + ", Telephone=" + Telephone + ", Cin=" + Cin
				+ ", Date=" + Date + ", Status=" + Status + ", login=" + login + ", gender=" + gender + ", role=" + role
				+ ", Valid=" + Valid + ", activity=" + activity + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	
}



