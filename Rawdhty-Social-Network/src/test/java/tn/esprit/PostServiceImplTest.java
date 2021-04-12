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

import tn.esprit.entities.Post;
import tn.esprit.services.PostService;




@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceImplTest {
	
	@Autowired
	PostService servicePosts;
	
	
	@SuppressWarnings("unused")
	private static final Logger l = LogManager.getLogger(PostServiceImplTest.class);
	
	@Test
	public void testAddPost() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-02-28");
		Post post = new Post(3, date, "wihjfciwha2", "energie");
		servicePosts.addPost(post);
	}
	
	@Test
	public void testRetrievePost(){
		servicePosts.retrievePost("2");
	}
	
	@Test
	public void testRetrieveAllPosts(){
		servicePosts.retrieveAllPosts();
	}
	
	@Test
	public void testDeletePost(){
		servicePosts.deletePost("2");
	}
	
	@Test
	public void testUpdatePost() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-03-25");
		Post post = new Post(1, date, "very amusing day ", "Be Happy");
		servicePosts.updatePost(post);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
