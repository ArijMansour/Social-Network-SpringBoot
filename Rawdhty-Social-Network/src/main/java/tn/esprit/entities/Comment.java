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
@Table(name="T_Comments")
public class Comment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Comment_ID")
	private Long Comment_Id ; 
	private Date Comment_Date ; 
	private String Comment_text ;
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(Long comment_Id, Date comment_Date, String comment_text) {
		super();
		Comment_Id = (long) Comment_Id;
		Comment_Date = comment_Date;
		Comment_text = comment_text;
	}
	public Long getComment_Id() {
		return Comment_Id;
	}
	public void setComment_Id(Long comment_Id) {
		Comment_Id = comment_Id;
	}
	public Date getComment_Date() {
		return Comment_Date;
	}
	public void setComment_Date(Date comment_Date) {
		Comment_Date = comment_Date;
	}
	public String getComment_text() {
		return Comment_text;
	}
	public void setComment_text(String comment_text) {
		Comment_text = comment_text;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Comment_Date == null) ? 0 : Comment_Date.hashCode());
		result = prime * result + ((Comment_Id == null) ? 0 : Comment_Id.hashCode());
		result = prime * result + ((Comment_text == null) ? 0 : Comment_text.hashCode());
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
		Comment other = (Comment) obj;
		if (Comment_Date == null) {
			if (other.Comment_Date != null)
				return false;
		} else if (!Comment_Date.equals(other.Comment_Date))
			return false;
		if (Comment_Id == null) {
			if (other.Comment_Id != null)
				return false;
		} else if (!Comment_Id.equals(other.Comment_Id))
			return false;
		if (Comment_text == null) {
			if (other.Comment_text != null)
				return false;
		} else if (!Comment_text.equals(other.Comment_text))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Comment [Comment_Id=" + Comment_Id + ", Comment_Date=" + Comment_Date + ", Comment_text=" + Comment_text
				+ "]";
	}

}
