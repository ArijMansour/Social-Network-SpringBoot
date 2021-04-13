package tn.esprit.controls;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Chat;
import tn.esprit.services.ChatService;
//import tn.esprit.spring.service.UserServiceImpl;

@RestController
public class ChatRestController {
	
	@Autowired
	ChatService chatService;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-Chat
	@GetMapping("/retrieve-all-Chat")
	@ResponseBody
	public List<Chat> getlistchat() {
	List<Chat> list = chatService.retrieveAllChat();
	return list;
	}
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-Chat/{Chat-id}
	@GetMapping("/retrieve-Chat/{Chat-id}")
	@ResponseBody
	public Chat retrieveChat(@PathVariable("Chat-id") String ChatId) {
	return chatService.retrieveChat(ChatId);
	}

	// http://localhost:8081/SpringMVC/servlet/add-Chat
	@PostMapping("/add-Chat")
	@ResponseBody
	public Chat addChat(@RequestBody Chat c) {
	Chat Chat1 = chatService.addChat( c);
	return Chat1;
	}
	
	// http://localhost:8081/SpringMVC/servlet/remove-Chat/{Chat-id}
	@DeleteMapping("/remove-Chat/{Chat-id}")
	@ResponseBody
	public void removeChat(@PathVariable("Chat-id") String ChatId) {
	chatService.deleteChat(ChatId);
	}

	// http://localhost:8081/SpringMVC/servlet/modify-Chat
	@PutMapping("/modify-Chat")
	@ResponseBody
	public Chat modifyChat(@RequestBody Chat chat) {
	return chatService.addChat(chat);
	}
	
	//http://localhost:8081/SpringMVC/servlet/connectToChat
	@GetMapping("/connectToChat")
	public String connectToChat() {
		return chatService.connectToChat();
	}
	
	// localhost:8088/SpringMVC/servlet/translateFr
		@GetMapping("/translateFr")
		public String translate(@RequestBody String Content) {
			return chatService.translate(Content.intern());
		}
		// localhost:8088/SpringMVC/servlet/translateEn
				@GetMapping("/translateEn")
				public String translate2(@RequestBody String Content) {
					return chatService.translate(Content.intern());
				}
				
			
				// URL : http://localhost:8088/SpringMVC/servlet/getAllChat_by_Ordrequest/1
				 @GetMapping(value = "getAllChat_by_Ordrequest/{idChat}")
				   
				 public List<Chat> getAllChat_by_Order_request(@PathVariable("idChat")int idChat) {
						return chatService.getAllChat_by_Order_request(idChat);
				}
				 
				// http://localhost:8088/SpringMVC/servlet/count-chat
					@GetMapping("/count-chat")
					@ResponseBody
					public long retrieveChatByCount() {
					return chatService.retrieveChatByCount();
					}

}
