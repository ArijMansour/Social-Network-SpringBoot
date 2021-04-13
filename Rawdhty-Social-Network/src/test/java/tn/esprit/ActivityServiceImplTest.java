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


import tn.esprit.entities.Activity;
import tn.esprit.repositories.ActivityRepository;
import tn.esprit.services.ActivityServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityServiceImplTest {
	
	
	private static final Logger l = LogManager.getLogger(ActivityServiceImplTest.class);
	
	@Autowired
	ActivityServiceImpl cls;
	
	@Autowired
	ActivityRepository activityRepository;
	
	@Test
	public void testretrieveAllActivities() {
		cls.retrieveAllActivities();
	}
	
	/*@Test
	public void testAddActivity() throws java.text.ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateBegin = dateFormat.parse("2021-04-01");
		Date dateEnd = dateFormat.parse("2021-04-02");
		Activity cl = new Activity(Long.parseLong("1"),"testActivityName","testActivityType","testActivityDescription","testActivityImg",dateBegin,dateEnd);
		cls.addActivity(cl);*/
		
	//}
	
	@Test
	public void testdeleteActivity() {
		cls.deleteActivity(	"1");
	}
	
	@Test
	public void testupdateActivity() {
		Activity cl = activityRepository.findById(Long.parseLong("1")).get();
		cl.setActivity_Name("New Name");
		cls.addActivity(cl);
	}
	
	@Test
	public void testretrieveActivity() {
		Activity cl =activityRepository.findById(Long.parseLong("1")).get();
		cls.retrieveActivity("1").getClass();
		System.out.println(cl);
	}
}