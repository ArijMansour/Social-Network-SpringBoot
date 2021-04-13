package tn.esprit.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity 
@Table(name="T_Notifications")
public class Notification implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Notification_ID")
	private Long Notification_Id ; 
	private String Notification_Text ; 
	private String Notification_Type ;
	private int sender;
	private int receiver;
	private LocalDateTime date;
	//@ManyToMany(mappedBy="l_Notification", cascade = CascadeType.ALL)
	//private Set <Parent> l_Parent_Notif ;// 
	
	

	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	//public Set<Parent> getL_Parent_Notif() {
		//return l_Parent_Notif;
	//}
	//public void setL_Parent_Notif(Set<Parent> l_Parent_Notif) {
		//this.l_Parent_Notif = l_Parent_Notif;
	//}
	
	
	public Notification(Long notification_Id, Date notification_Date, String notification_Text,
			String notification_Type, int sender, int receiver, LocalDateTime date, Set<Parent> l_Parent_Notif) {
		super();
		Notification_Id = notification_Id;
		Notification_Text = notification_Text;
		Notification_Type = notification_Type;
		this.sender = sender;
		this.receiver = receiver;
		this.date = date;
		//this.l_Parent_Notif = l_Parent_Notif;
	}
	
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notification(Long notification_Id, Date notification_Date, String notification_Text,
			String notification_Type) {
		super();
		Notification_Id = notification_Id;
		Notification_Text = notification_Text;
		Notification_Type = notification_Type;
	}
	public Long getNotification_Id() {
		return Notification_Id;
	}
	public void setNotification_Id(Long notification_Id) {
		Notification_Id = notification_Id;
	}
	
	
	public String getNotification_Text() {
		return Notification_Text;
	}
	public void setNotification_Text(String notification_Text) {
		Notification_Text = notification_Text;
	}
	public String getNotification_Type() {
		return Notification_Type;
	}
	public void setNotification_Type(String notification_Type) {
		Notification_Type = notification_Type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Notification_Id == null) ? 0 : Notification_Id.hashCode());
		result = prime * result + ((Notification_Text == null) ? 0 : Notification_Text.hashCode());
		result = prime * result + ((Notification_Type == null) ? 0 : Notification_Type.hashCode());
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
		Notification other = (Notification) obj;
		if (Notification_Id == null) {
			if (other.Notification_Id != null)
				return false;
		} else if (!Notification_Id.equals(other.Notification_Id))
			return false;
		if (Notification_Text == null) {
			if (other.Notification_Text != null)
				return false;
		} else if (!Notification_Text.equals(other.Notification_Text))
			return false;
		if (Notification_Type == null) {
			if (other.Notification_Type != null)
				return false;
		} else if (!Notification_Type.equals(other.Notification_Type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Notification [Notification_Id=" + Notification_Id + ", Notification_Date=" 
				+ ", Notification_Text=" + Notification_Text + ", Notification_Type=" + Notification_Type + "]";
	}
	public Notification(Long notification_Id, Date notification_Date, String notification_Text,
			String notification_Type, Set<Parent> l_Parent_Notif) {
		super();
		Notification_Id = notification_Id;
		Notification_Text = notification_Text;
		Notification_Type = notification_Type;
		//this.l_Parent_Notif = l_Parent_Notif;
	}

}
