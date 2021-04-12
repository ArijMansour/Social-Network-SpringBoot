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
@Table(name="T_Paths")
public class Path implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Itinarary_ID")
	private Long Itinarary_Id ; 
	private String Itinarary_Bus_Ref ; 
	private int Itinarary_Place_Number ;
	
	@Enumerated(EnumType.STRING ) 
    private Path_From path_from ; 
	
	@Enumerated(EnumType.STRING ) 
	private Path_To path_to ;

	public Path() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Path(Long itinarary_Id, String itinarary_Bus_Ref, int itinarary_Place_Number,
			Path_From path_from, Path_To path_to) {
		super();
		Itinarary_Id = itinarary_Id;
		Itinarary_Bus_Ref = itinarary_Bus_Ref;
		Itinarary_Place_Number = itinarary_Place_Number;
		this.path_from = path_from;
		this.path_to = path_to;
	}

	public Long getItinarary_Id() {
		return Itinarary_Id;
	}

	public void setItinarary_Id(Long itinarary_Id) {
		Itinarary_Id = itinarary_Id;
	}

	public String getItinarary_Bus_Ref() {
		return Itinarary_Bus_Ref;
	}

	public void setItinarary_Bus_Ref(String itinarary_Bus_Ref) {
		Itinarary_Bus_Ref = itinarary_Bus_Ref;
	}

	public int getItinarary_Place_Number() {
		return Itinarary_Place_Number;
	}

	public void setItinarary_Place_Number(int itinarary_Place_Number) {
		Itinarary_Place_Number = itinarary_Place_Number;
	}

	public Path_From getPath_from() {
		return path_from;
	}

	public void setPath_from(Path_From path_from) {
		this.path_from = path_from;
	}

	public Path_To getPath_to() {
		return path_to;
	}

	public void setPath_to(Path_To path_to) {
		this.path_to = path_to;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Itinarary_Bus_Ref == null) ? 0 : Itinarary_Bus_Ref.hashCode());
		result = prime * result + ((Itinarary_Id == null) ? 0 : Itinarary_Id.hashCode());
		result = prime * result + Itinarary_Place_Number;
		result = prime * result + ((path_from == null) ? 0 : path_from.hashCode());
		result = prime * result + ((path_to == null) ? 0 : path_to.hashCode());
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
		Path other = (Path) obj;
		if (Itinarary_Bus_Ref == null) {
			if (other.Itinarary_Bus_Ref != null)
				return false;
		} else if (!Itinarary_Bus_Ref.equals(other.Itinarary_Bus_Ref))
			return false;
		if (Itinarary_Id == null) {
			if (other.Itinarary_Id != null)
				return false;
		} else if (!Itinarary_Id.equals(other.Itinarary_Id))
			return false;
		if (Itinarary_Place_Number != other.Itinarary_Place_Number)
			return false;
		if (path_from != other.path_from)
			return false;
		if (path_to != other.path_to)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Path [Itinarary_Id=" + Itinarary_Id + ", Itinarary_Bus_Ref=" + Itinarary_Bus_Ref
				+ ", Itinarary_Place_Number=" + Itinarary_Place_Number + ", path_from=" + path_from + ", path_to="
				+ path_to + "]";
	}

}
