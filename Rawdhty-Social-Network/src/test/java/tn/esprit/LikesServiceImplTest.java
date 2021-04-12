package tn.esprit;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.entities.Likes;
import tn.esprit.services.LikesService;
import tn.esprit.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LikesServiceImplTest {
	
	@Autowired
	LikesService serviceLikes ;
	
	@Autowired
	UserService userService ;
	
	
	@SuppressWarnings("unused")
	private static final Logger l = LogManager.getLogger(LikesServiceImplTest.class);
	
	@Test
	public void addLike() throws java.text.ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-03-28");
		Likes like = new Likes(date);
		serviceLikes.addLikes(like);
	}
	
	@Test
	public void getAllLikes(){
		serviceLikes.retrieveAllLikes();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
