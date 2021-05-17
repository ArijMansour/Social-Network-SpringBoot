package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.esprit.entities.Chat;
import tn.esprit.entities.User;
import tn.esprit.entities.Chat.MessageType;

@Entity 
@Table(name="T_Chat")
public class Chat implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Chat_ID")
	private long Chat_Id ; 
	private String Chat_Text ; 
	private Date Chat_Date ;
	private MessageType type;
    private String sender;
	private String content;
	private int Chat_nbrequest ;
	@Column(name = "respense")
	private String respense;

	public enum MessageType {
        CHAT, JOIN, LEAVE
    }
	//@JsonIgnore
	
	
	  @JsonIgnore
		@ManyToOne
		@JoinColumn(name= "iduser")
		private User user;

	public long getChat_Id() {
		return Chat_Id;
	}

	public void setChat_Id(long chat_Id) {
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

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRespense() {
		return respense;
	}

	public void setRespense(String respense) {
		this.respense = respense;
	}

	

	



	public Chat(long chat_Id, String chat_Text, Date chat_Date, MessageType type, String sender, String content,
			int chat_nbrequest, String respense, User user) {
		super();
		Chat_Id = chat_Id;
		Chat_Text = chat_Text;
		Chat_Date = chat_Date;
		this.type = type;
		this.sender = sender;
		this.content = content;
		Chat_nbrequest = chat_nbrequest;
		this.respense = respense;
		this.user = user;
	}

	public int getChat_nbrequest() {
		return Chat_nbrequest;
	}

	public void setChat_nbrequest(int chat_nbrequest) {
		Chat_nbrequest = chat_nbrequest;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Chat_Date == null) ? 0 : Chat_Date.hashCode());
		result = prime * result + (int) (Chat_Id ^ (Chat_Id >>> 32));
		result = prime * result + ((Chat_Text == null) ? 0 : Chat_Text.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((respense == null) ? 0 : respense.hashCode());
		result = prime * result + ((sender == null) ? 0 : sender.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		if (Chat_Id != other.Chat_Id)
			return false;
		if (Chat_Text == null) {
			if (other.Chat_Text != null)
				return false;
		} else if (!Chat_Text.equals(other.Chat_Text))
			return false;
		
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (respense == null) {
			if (other.respense != null)
				return false;
		} else if (!respense.equals(other.respense))
			return false;
		if (sender == null) {
			if (other.sender != null)
				return false;
		} else if (!sender.equals(other.sender))
			return false;
		if (type != other.type)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "Chat [Chat_Id=" + Chat_Id + ", Chat_Text=" + Chat_Text + ", Chat_Date=" + Chat_Date + ", type=" + type
				+ ", sender=" + sender + ", content=" + content + ", Chat_nbrequest=" + Chat_nbrequest + ", respense="
				+ respense + "]";
	}

	public Chat(long chat_Id, String chat_Text, Date chat_Date, MessageType type, String sender, String content,
			String respense, User user) {
		super();
		Chat_Id = chat_Id;
		Chat_Text = chat_Text;
		Chat_Date = chat_Date;
		this.type = type;
		this.sender = sender;
		this.content = content;
		this.respense = respense;

		
		this.user = user;
	}

	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}