package tn.esprit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.ChatServiceImplTest;
import tn.esprit.entities.Chat;
import tn.esprit.entities.User;
import tn.esprit.services.ChatServiceImpl;
import tn.esprit.repositories.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatServiceImplTest {
	
private static final Logger l = LogManager.getLogger(ChatServiceImplTest.class);
	
	@Autowired
	ChatServiceImpl cs;
	
	@Autowired
	ChatReposiroty chatRepository;
	
	@Test
	public void testretrieveAllCourses() {
		cs.retrieveAllChat();
	}
	
	@Test
	public void testAddCourse() throws java.text.ParseException {
		User arij = null;
		/*Chat cr = new Chat(Long.parseLong("1"),"testChattext",null, null, "testChat","testContent","ol",0,arij);*/
		/*cs.addChat(cr);*/
		
	}
	
	@Test
	public void testdeleteCourse() {
		cs.deleteChat("1");
	}
	
	@Test
	public void testupdateMeeting() {
		Chat cr = chatRepository.findById(Long.parseLong("1")).get();
		cr.setChat_Text("NewChatText");
		cs.addChat(cr);
	}
	
	@Test
	public void testretrieveMeeting() {
		Chat cr = chatRepository.findById(Long.parseLong("1")).get();
		cs.retrieveChat("1").getClass();
		System.out.println(cr);
	}

}