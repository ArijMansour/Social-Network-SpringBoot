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

import tn.esprit.NotificationServiceImplTest;
import tn.esprit.entities.Notification;
import tn.esprit.repositories.NotificationRepository;
import tn.esprit.services.NotificationServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NotificationServiceImplTest {
	
private static final Logger l = LogManager.getLogger(ChatServiceImplTest.class);
	
	@Autowired
	NotificationServiceImpl cs;
	
	@Autowired
	NotificationRepository notificationRepository;
	
	@Test
	public void testretrieveAllNotifications() {
		cs.retrieveAllNotifications();
	}
	
	@Test
	public void testAddActivity() throws java.text.ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-04-01");
		Notification cl = new Notification(Long.parseLong("1"),date,"testNotificationText","testNotificationType",null);
		cs.addNotification(cl);
		
	}
	
	@Test
	public void testdeleteCourse() {
		cs.deleteNotification("1");
	}
	
	@Test
	public void testupdateMeeting() {
		Notification cr = notificationRepository.findById(Long.parseLong("1")).get();
		cr.setNotification_Text("NewNotificationText");
		cs.addNotification(cr);
	}
	
	@Test
	public void testretrieveMeeting() {
		Notification cr = notificationRepository.findById(Long.parseLong("1")).get();
		cs.retrieveNotification("1").getClass();
		System.out.println(cr);
	}

}