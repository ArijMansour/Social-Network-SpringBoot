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
@Table(name="T_Chat")
public class Chat implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Chat_ID")
	
	private Long Chat_Id ; 
	private String Chat_Text ; 
	private Date Chat_Date ;
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chat(Long chat_Id, String chat_Text, Date chat_Date) {
		super();
		Chat_Id = chat_Id;
		Chat_Text = chat_Text;
		Chat_Date = chat_Date;
	}
	public Long getChat_Id() {
		return Chat_Id;
	}
	public void setChat_Id(Long chat_Id) {
		Chat_Id = chat_Id;
	}
	public String getChat_Text() {
		return Chat_Text;
	}
	public void setChat_Text(String chat_Text) {
		Chat_Text = chat_Text;
	}
	public Date getChat_Date() {
		return Chat_Date;
	}
	public void setChat_Date(Date chat_Date) {
		Chat_Date = chat_Date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Chat_Date == null) ? 0 : Chat_Date.hashCode());
		result = prime * result + ((Chat_Id == null) ? 0 : Chat_Id.hashCode());
		result = prime * result + ((Chat_Text == null) ? 0 : Chat_Text.hashCode());
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
		Chat other = (Chat) obj;
		if (Chat_Date == null) {
			if (other.Chat_Date != null)
				return false;
		} else if (!Chat_Date.equals(other.Chat_Date))
			return false;
		if (Chat_Id == null) {
			if (other.Chat_Id != null)
				return false;
		} else if (!Chat_Id.equals(other.Chat_Id))
			return false;
		if (Chat_Text == null) {
			if (other.Chat_Text != null)
				return false;
		} else if (!Chat_Text.equals(other.Chat_Text))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Chat [Chat_Id=" + Chat_Id + ", Chat_Text=" + Chat_Text + ", Chat_Date=" + Chat_Date + "]";
	}

}
