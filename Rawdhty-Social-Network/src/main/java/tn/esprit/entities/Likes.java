package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_Likes")
public class Likes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long likesId ;
	private Date dateLike ;
	public Likes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Likes(long likesId, Date dateLike) {
		super();
		this.likesId = likesId;
		this.dateLike = dateLike;
	}



	public Likes(Date dateLike) {
		super();
		this.dateLike = dateLike;
	}
	public long getLikesId() {
		return likesId;
	}
	public void setLikesId(long likesId) {
		this.likesId = likesId;
	}
	public Date getDateLike() {
		return dateLike;
	}
	public void setDateLike(Date dateLike) {
		this.dateLike = dateLike;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateLike == null) ? 0 : dateLike.hashCode());
		result = prime * result + (int) (likesId ^ (likesId >>> 32));
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
		Likes other = (Likes) obj;
		if (dateLike == null) {
			if (other.dateLike != null)
				return false;
		} else if (!dateLike.equals(other.dateLike))
			return false;
		if (likesId != other.likesId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Likes [likesId=" + likesId + ", dateLike=" + dateLike + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
