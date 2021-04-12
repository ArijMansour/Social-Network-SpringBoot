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
@Table(name="T_Posts")
public class Post implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Posts_ID")
	private long Post_Id ; 
	private Date Post_Date ;
	private String Post_Description ; 
	private String post_Title ;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(long post_Id, Date post_Date, String post_Description, String post_Title) {
		super();
		Post_Id = post_Id;
		Post_Date = post_Date;
		Post_Description = post_Description;
		this.post_Title = post_Title;
	}
	public Date getPost_Date() {
		return Post_Date;
	}
	public void setPost_Date(Date post_Date) {
		Post_Date = post_Date;
	}
	public String getPost_Description() {
		return Post_Description;
	}
	public void setPost_Description(String post_Description) {
		Post_Description = post_Description;
	}
	public String getPost_Title() {
		return post_Title;
	}
	public void setPost_Title(String post_Title) {
		this.post_Title = post_Title;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Post_Date == null) ? 0 : Post_Date.hashCode());
		result = prime * result + ((Post_Description == null) ? 0 : Post_Description.hashCode());
		result = prime * result + (int) (Post_Id ^ (Post_Id >>> 32));
		result = prime * result + ((post_Title == null) ? 0 : post_Title.hashCode());
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
		Post other = (Post) obj;
		if (Post_Date == null) {
			if (other.Post_Date != null)
				return false;
		} else if (!Post_Date.equals(other.Post_Date))
			return false;
		if (Post_Description == null) {
			if (other.Post_Description != null)
				return false;
		} else if (!Post_Description.equals(other.Post_Description))
			return false;
		if (Post_Id != other.Post_Id)
			return false;
		if (post_Title == null) {
			if (other.post_Title != null)
				return false;
		} else if (!post_Title.equals(other.post_Title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Post [Post_Id=" + Post_Id + ", Post_Date=" + Post_Date + ", Post_Description=" + Post_Description
				+ ", post_Title=" + post_Title + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
