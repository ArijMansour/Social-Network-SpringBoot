package tn.esprit.services;

import java.util.List;
import tn.esprit.entities.Chat ;

public interface ChatService {
	
	List<Chat> retrieveAllChat();
	Chat addChat(Chat c );
	void deleteChat(String Chat_Id);
	Chat retrieveChat(String Chat_Id);
	public String connectToChat();
	public String translate(String word) ;
	public String translate2(String Content);
	List<Chat> getAllChat_by_Order_request(int idChat);
	long retrieveChatByCount();
	
	 
}
