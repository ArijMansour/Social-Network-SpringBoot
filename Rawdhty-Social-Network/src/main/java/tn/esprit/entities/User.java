package tn.esprit.entities;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	private int Status;

	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Claim> claims;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Meeting> meetings;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Course> courses;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String email, String password, String first_name, String last_name, String adresse,
			String telephone, String cin, String date, int status, Role role) {
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
		this.role = role;
	}

	public User(String email, String password, String first_name, String last_name, String adresse, String telephone,
			String cin, String date, int status, Role role) {
		super();
		Email = email;
		Password = password;
		First_name = first_name;
		Last_name = last_name;
		Adresse = adresse;
		Telephone = telephone;
		Cin = cin;
		Date = date;
		Status = status;
		this.role = role;
	}

	public User(String email, String password, String first_name, String last_name, String adresse, String telephone,
			String cin, String date, Role role) {
		super();
		Email = email;
		Password = password;
		First_name = first_name;
		Last_name = last_name;
		Adresse = adresse;
		Telephone = telephone;
		Cin = cin;
		Date = date;
		this.role = role;
	}


	private int Status = 1;
	private String login ; //arij ** 
	private String gender ; //arij
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Claim> claims;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Meeting> meetings;

	private boolean Valid ;

	
	 private boolean Valid ;

	 
	 @JsonIgnore
	 @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
		private Set<Activity> activity;

	
	 @JsonIgnore
	 @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
		private Set<Chat> chat;
	
	
	 public Long getId() {
=======

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

	public Set<Claim> getClaims() {
		return claims;
	}

	public void setClaims(Set<Claim> claims) {
		this.claims = claims;
	}

	public Set<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(Set<Meeting> meetings) {
		this.meetings = meetings;
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


=======
	public Set<Claim> getClaims() {
		return claims;
	}

	public void setClaims(Set<Claim> claims) {
		this.claims = claims;
	}

	public Set<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(Set<Meeting> meetings) {
		this.meetings = meetings;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Adresse == null) ? 0 : Adresse.hashCode());
		result = prime * result + ((Cin == null) ? 0 : Cin.hashCode());
		result = prime * result + ((Date == null) ? 0 : Date.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((First_name == null) ? 0 : First_name.hashCode());

		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
=======
		result = prime * result + (int) (Id ^ (Id >>> 32));

		result = prime * result + ((Last_name == null) ? 0 : Last_name.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + Status;
		result = prime * result + ((Telephone == null) ? 0 : Telephone.hashCode());

		result = prime * result + (Valid ? 1231 : 1237);
		result = prime * result + ((activity == null) ? 0 : activity.hashCode());
		result = prime * result + ((claims == null) ? 0 : claims.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
=======
		result = prime * result + ((claims == null) ? 0 : claims.hashCode());
		result = prime * result + ((courses == null) ? 0 : courses.hashCode());

		result = prime * result + ((meetings == null) ? 0 : meetings.hashCode());
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
		User other = (User) obj;
		if (Adresse == null) {
			if (other.Adresse != null)
				return false;
		} else if (!Adresse.equals(other.Adresse))
			return false;
		if (Cin == null) {
			if (other.Cin != null)
				return false;
		} else if (!Cin.equals(other.Cin))
			return false;
		if (Date == null) {
			if (other.Date != null)
				return false;
		} else if (!Date.equals(other.Date))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (First_name == null) {
			if (other.First_name != null)
				return false;
		} else if (!First_name.equals(other.First_name))
			return false;

		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
=======
		if (Id != other.
			return false;
		if (Last_name == null) {
			if (other.Last_name != null)
				return false;
		} else if (!Last_name.equals(other.Last_name))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (Status != other.Status)
			return false;
		if (Telephone == null) {
			if (other.Telephone != null)
				return false;
		} else if (!Telephone.equals(other.Telephone))
			return false;

		if (Valid != other.Valid)
			return false;
		if (activity == null) {
			if (other.activity != null)
				return false;
		} else if (!activity.equals(other.activity))
			return false;
=======

		if (claims == null) {
			if (other.claims != null)
				return false;
		} else if (!claims.equals(other.claims))
			return false;

		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
=======
		if (courses == null) {
			if (other.courses != null)
				return false;
		} else if (!courses.equals(other.courses))

			return false;
		if (meetings == null) {
			if (other.meetings != null)
				return false;
		} else if (!meetings.equals(other.meetings))
			return false;
		if (role != other.role)
			return false;
		return true;

	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", Email=" + Email + ", Password=" + Password + ", First_name=" + First_name
				+ ", Last_name=" + Last_name + ", Adresse=" + Adresse + ", Telephone=" + Telephone + ", Cin=" + Cin
				+ ", Date=" + Date + ", Status=" + Status + ", login=" + login + ", gender=" + gender + ", role=" + role
				+ ", claims=" + claims + ", meetings=" + meetings + ", Valid=" + Valid + ", activity=" + activity + "]";
	}

=======
=======

	public User(Long id, String email, String password, String first_name, String last_name, String adresse,
			String telephone, String cin, String date, int status, String login, String gender, Role role,
			Set<Claim> claims, Set<Meeting> meetings, boolean valid, Set<Activity> activity) {
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
		this.claims = claims;
		this.meetings = meetings;
		Valid = valid;
		this.activity = activity;

	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}



