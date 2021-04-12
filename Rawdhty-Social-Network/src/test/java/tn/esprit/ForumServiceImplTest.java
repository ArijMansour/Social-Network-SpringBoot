package tn.esprit;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Forum;
import tn.esprit.services.ForumService;





@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumServiceImplTest {
	
	@SuppressWarnings("unused")
	private static final Logger l = LogManager.getLogger(ForumServiceImplTest.class);
	
	
	@Autowired
	ForumService serviceForum;
	

	@Test
	public void testAddForum() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-03-11");
		Forum forum = new Forum("forum_Subject", date);
		serviceForum.addForum(forum);
	}
	
	@Test
	public void testRetrieveForum(){
		serviceForum.retrieveForum("2");
	}
	
	@Test
	public void testRetrieveAllForums(){
		serviceForum.retrieveAllForums();
	}
	
	@Test
	public void testDeleteForum(){
		serviceForum.deleteForum("3");
	}
	
	@Test
	public void testUpdateForum() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-03-15");
		Forum forum = new Forum("about health", date);
		serviceForum.updateForum(forum);
	}
	

}
