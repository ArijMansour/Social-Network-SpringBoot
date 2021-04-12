package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="T_Notes")
public class Note implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Notes_ID")
	private Long Note_Id ;
	private Date Note_Creation_Date ;
	private String Note_Description ; 
	
	@Enumerated(EnumType.STRING ) 
	private Note_Subject note_subject ;
	 
	@Enumerated(EnumType.STRING ) 
	private Note_Type note_type ;

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(Long note_Id, Date note_Creation_Date, String note_Description, Note_Subject note_subject,
			Note_Type note_type) {
		super();
		Note_Id = note_Id;
		Note_Creation_Date = note_Creation_Date;
		Note_Description = note_Description;
		this.note_subject = note_subject;
		this.note_type = note_type;
	}

	public Long getNote_Id() {
		return Note_Id;
	}

	public void setNote_Id(Long note_Id) {
		Note_Id = note_Id;
	}

	public Date getNote_Creation_Date() {
		return Note_Creation_Date;
	}

	public void setNote_Creation_Date(Date note_Creation_Date) {
		Note_Creation_Date = note_Creation_Date;
	}

	public String getNote_Description() {
		return Note_Description;
	}

	public void setNote_Description(String note_Description) {
		Note_Description = note_Description;
	}

	public Note_Subject getNote_subject() {
		return note_subject;
	}

	public void setNote_subject(Note_Subject note_subject) {
		this.note_subject = note_subject;
	}

	public Note_Type getNote_type() {
		return note_type;
	}

	public void setNote_type(Note_Type note_type) {
		this.note_type = note_type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Note_Creation_Date == null) ? 0 : Note_Creation_Date.hashCode());
		result = prime * result + ((Note_Description == null) ? 0 : Note_Description.hashCode());
		result = prime * result + ((Note_Id == null) ? 0 : Note_Id.hashCode());
		result = prime * result + ((note_subject == null) ? 0 : note_subject.hashCode());
		result = prime * result + ((note_type == null) ? 0 : note_type.hashCode());
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
		Note other = (Note) obj;
		if (Note_Creation_Date == null) {
			if (other.Note_Creation_Date != null)
				return false;
		} else if (!Note_Creation_Date.equals(other.Note_Creation_Date))
			return false;
		if (Note_Description == null) {
			if (other.Note_Description != null)
				return false;
		} else if (!Note_Description.equals(other.Note_Description))
			return false;
		if (Note_Id == null) {
			if (other.Note_Id != null)
				return false;
		} else if (!Note_Id.equals(other.Note_Id))
			return false;
		if (note_subject != other.note_subject)
			return false;
		if (note_type != other.note_type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Note [Note_Id=" + Note_Id + ", Note_Creation_Date=" + Note_Creation_Date + ", Note_Description="
				+ Note_Description + ", note_subject=" + note_subject + ", note_type=" + note_type + "]";
	}

}
