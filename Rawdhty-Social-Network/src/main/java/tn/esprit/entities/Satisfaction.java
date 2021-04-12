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
@Table(name="T_Satisfactions")
public class Satisfaction implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Satisfaction_ID")
	private Long Satisfaction_Id ; 
	private Date Satisfaction_Date ;
	private String Satisfaction_Text ;
	public Satisfaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Satisfaction(Long satisfaction_Id, Date satisfaction_Date, String satisfaction_Text) {
		super();
		Satisfaction_Id = satisfaction_Id;
		Satisfaction_Date = satisfaction_Date;
		Satisfaction_Text = satisfaction_Text;
	}
	public Long getSatisfaction_Id() {
		return Satisfaction_Id;
	}
	public void setSatisfaction_Id(Long satisfaction_Id) {
		Satisfaction_Id = satisfaction_Id;
	}
	public Date getSatisfaction_Date() {
		return Satisfaction_Date;
	}
	public void setSatisfaction_Date(Date satisfaction_Date) {
		Satisfaction_Date = satisfaction_Date;
	}
	public String getSatisfaction_Text() {
		return Satisfaction_Text;
	}
	public void setSatisfaction_Text(String satisfaction_Text) {
		Satisfaction_Text = satisfaction_Text;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Satisfaction_Date == null) ? 0 : Satisfaction_Date.hashCode());
		result = prime * result + ((Satisfaction_Id == null) ? 0 : Satisfaction_Id.hashCode());
		result = prime * result + ((Satisfaction_Text == null) ? 0 : Satisfaction_Text.hashCode());
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
		Satisfaction other = (Satisfaction) obj;
		if (Satisfaction_Date == null) {
			if (other.Satisfaction_Date != null)
				return false;
		} else if (!Satisfaction_Date.equals(other.Satisfaction_Date))
			return false;
		if (Satisfaction_Id == null) {
			if (other.Satisfaction_Id != null)
				return false;
		} else if (!Satisfaction_Id.equals(other.Satisfaction_Id))
			return false;
		if (Satisfaction_Text == null) {
			if (other.Satisfaction_Text != null)
				return false;
		} else if (!Satisfaction_Text.equals(other.Satisfaction_Text))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Satisfaction [Satisfaction_Id=" + Satisfaction_Id + ", Satisfaction_Date=" + Satisfaction_Date
				+ ", Satisfaction_Text=" + Satisfaction_Text + "]";
	}

}
