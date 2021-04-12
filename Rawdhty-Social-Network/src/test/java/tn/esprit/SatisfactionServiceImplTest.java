package tn.esprit;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Satisfaction;
import tn.esprit.repositories.SatisfactionRepository;
import tn.esprit.services.SatisfactionServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SatisfactionServiceImplTest {
	

	private static final Logger l = LogManager.getLogger(CommentServiceImplTest.class);
	
	@Autowired
	SatisfactionServiceImpl ss;
	
	@Autowired
	SatisfactionRepository satisfactionRepository;
	
	@Test
	public void testretrieveAllSatisfactions() {
		ss.retrieveAllSatisfactions();
	}
	Date currentSqlDate = new Date(System.currentTimeMillis());
	
	@Test
	public void testAddSatisfaction() throws java.text.ParseException {
		Satisfaction s = new Satisfaction(Long.parseLong("2"),currentSqlDate,"new test satisfaction");
		ss.addSatisfaction(s);
		
	}
	
	@Test
	public void testdeleteSatisfaction() {
		ss.deleteSatisfaction("2");
	}
	
	@Test
	public void testupdateSatisfaction() {
		Satisfaction s = satisfactionRepository.findById(Long.parseLong("2")).get();
		s.setSatisfaction_Text("modification de satisfaction");
		ss.addSatisfaction(s);
	}
	
	@Test
	public void testretrieveSatisfaction() {
		Satisfaction s = satisfactionRepository.findById(Long.parseLong("1")).get();
		ss.retrieveSatisfaction("1").getClass();
		System.out.println(s);
	}

}
