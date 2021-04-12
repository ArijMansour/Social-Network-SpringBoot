package tn.esprit;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.entities.Comment;
import tn.esprit.repositories.CommentRepository;
import tn.esprit.services.CommentServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceImplTest {
	

	private static final Logger l = LogManager.getLogger(CommentServiceImplTest.class);
	
	@Autowired
	CommentServiceImpl cs;
	
	@Autowired
	CommentRepository commentRepository;
	
	@Test
	public void testretrieveAllComments() {
		cs.retrieveAllComments();
	}
	
	@Test
	public void testAddComment() throws java.text.ParseException {
		Date currentSqlDate = new Date(System.currentTimeMillis());
		Comment cm = new Comment(Long.valueOf(1),currentSqlDate,"1éme exemple");
		cs.addComment(cm);
		
	}
	
	@Test
	public void testdeleteComment() {
		cs.deleteComment("2");
	}
	
	@Test
	public void testupdateComment() {
		Comment cm = commentRepository.findById(Long.parseLong("11")).get();
		cm.setComment_text("hedhi ch9awlek");
		cs.addComment(cm);
	}
	
	@Test
	public void testretrieveComment() {
		Comment cm = commentRepository.findById(Long.parseLong("1")).get();
		cs.retrieveComment("1").getClass();
		System.out.println(cm);
	}

}
