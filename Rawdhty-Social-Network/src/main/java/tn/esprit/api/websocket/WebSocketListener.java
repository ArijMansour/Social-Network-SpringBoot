package tn.esprit.api.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import tn.esprit.entities.Chat;

@Component
public class WebSocketListener {
	  private static final Logger logger = LoggerFactory.getLogger(WebSocketListener.class);
	  
	    @Autowired
	    private SimpMessageSendingOperations messagingTemplate;
	 

	    @EventListener
	    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
	        logger.info("Received a new web socket connection");
	    }
	 
	    @EventListener
	    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
	        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
	 
	        String username = (String) headerAccessor.getSessionAttributes().get("username");
	         
	        if(username != null) {
	            logger.info("User Disconnected : " + username);
	 
	            Chat chatMessage = new Chat();
	            chatMessage.setType(Chat.MessageType.LEAVE);
	            chatMessage.setSender(username);
	 
	            messagingTemplate.convertAndSend("/topic/publicChatRoom", chatMessage);
	        }
	    }
	     
	}
