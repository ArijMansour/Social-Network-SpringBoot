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
@Table(name="T_Forums")
public class Forum implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Forum_ID")
	private long Forum_Id; 
	private String Forum_Subject ; 
	private Date Forum_Date_Creation ;
	public Forum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Forum(String forum_Subject, Date forum_Date_Creation) {
		super();
		Forum_Subject = forum_Subject;
		Forum_Date_Creation = forum_Date_Creation;
	}
	public long getForum_Id() {
		return Forum_Id;
	}
	public void setForum_Id(long forum_Id) {
		Forum_Id = forum_Id;
	}
	public String getForum_Subject() {
		return Forum_Subject;
	}
	public void setForum_Subject(String forum_Subject) {
		Forum_Subject = forum_Subject;
	}
	public Date getForum_Date_Creation() {
		return Forum_Date_Creation;
	}
	public void setForum_Date_Creation(Date forum_Date_Creation) {
		Forum_Date_Creation = forum_Date_Creation;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Forum_Date_Creation == null) ? 0 : Forum_Date_Creation.hashCode());
		result = prime * result + (int) (Forum_Id ^ (Forum_Id >>> 32));
		result = prime * result + ((Forum_Subject == null) ? 0 : Forum_Subject.hashCode());
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
		Forum other = (Forum) obj;
		if (Forum_Date_Creation == null) {
			if (other.Forum_Date_Creation != null)
				return false;
		} else if (!Forum_Date_Creation.equals(other.Forum_Date_Creation))
			return false;
		if (Forum_Id != other.Forum_Id)
			return false;
		if (Forum_Subject == null) {
			if (other.Forum_Subject != null)
				return false;
		} else if (!Forum_Subject.equals(other.Forum_Subject))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Forum [Forum_Id=" + Forum_Id + ", Forum_Subject=" + Forum_Subject + ", Forum_Date_Creation="
				+ Forum_Date_Creation + "]";
	}
	
	
	

}
