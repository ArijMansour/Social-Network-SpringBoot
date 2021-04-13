package tn.esprit.services;



import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.entities.Chat;
import tn.esprit.repositories.ChatReposiroty;
import com.amazonaws.services.translate.AmazonTranslate;
import com.amazonaws.services.translate.AmazonTranslateClientBuilder;
import com.amazonaws.services.translate.model.TranslateTextRequest;
import com.amazonaws.services.translate.model.TranslateTextResult;


@Service
public class ChatServiceImpl implements ChatService {
	
	@Autowired
	ChatReposiroty chatRepository;
	@Autowired
	
	private static final Logger L = LogManager.getLogger(ChatServiceImpl.class);
	
	@Override
	public List<Chat> retrieveAllChat() {
		List<Chat> listchat = (List<Chat>) chatRepository.findAll();
		for (Chat chat :  listchat) {
			L.info("chat +++ : " + chat);
		}
		return listchat;
	}

	@Override
	public Chat addChat(Chat a ) {
		return chatRepository.save(a);
	}

	@Override
	public void deleteChat(String Chat_Id) {
		 chatRepository.deleteById(Long.parseLong(Chat_Id));
		
	}


	@Override
	public Chat retrieveChat(String Chat_Id) {
		return chatRepository.findById(Long.parseLong(Chat_Id)).get();
	}

	public String connectToChat(){
		return "Hi, how Can we help you?";
	}
	
	// Arij Mansour 
	public String translate(String Content) {
		AmazonTranslate translate = AmazonTranslateClientBuilder.defaultClient();
		TranslateTextRequest request = new TranslateTextRequest().withText(Content).withSourceLanguageCode("fr")
				.withTargetLanguageCode("en");
		TranslateTextResult result = translate.translateText(request);
		System.out.println(result.getTranslatedText());
		return (result.getTranslatedText());
	}

	// Translation Test 
	public String translate2(String Content) {
		AmazonTranslate translate = AmazonTranslateClientBuilder.defaultClient();
		TranslateTextRequest request = new TranslateTextRequest().withText(Content).withSourceLanguageCode("en")
				.withTargetLanguageCode("fr");
		TranslateTextResult result = translate.translateText(request);
		System.out.println(result.getTranslatedText());
		return (result.getTranslatedText());
	}
	
	 @Override
	 public List<Chat> getAllChat_by_Order_request(int idChat) {
		return chatRepository.getAllChat_by_Order(idChat);
	}
	
	 @Override
		public long retrieveChatByCount() {
			return chatRepository.count();
		}
}
	
	

	
	
	
	
	


