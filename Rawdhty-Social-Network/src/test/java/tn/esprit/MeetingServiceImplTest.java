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

import tn.esprit.entities.Meeting;
import tn.esprit.repositories.MeetingRepository;
import tn.esprit.services.MeetingServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MeetingServiceImplTest {

	// =======Oussema Mihoubi=======//

	private static final Logger l = LogManager.getLogger(MeetingServiceImplTest.class);

	@Autowired
	MeetingServiceImpl ms;

	@Autowired
	MeetingRepository meetingRepository;

	@Test
	public void testretrieveAllMeetings() {
		ms.retrieveAllMeetings();
	}

	@Test
	public void testAddMeeting() throws java.text.ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-04-12");
		Meeting m = new Meeting("testTopic3", 2, "testLocation3", "testDetails3", date, 0);
		ms.addMeeting(m);

	}

	@Test
	public void testdeleteMeeting() {
		ms.deleteMeeting("1");
	}

	@Test
	public void testupdateMeeting() {
		Meeting m = meetingRepository.findById(Long.parseLong("1")).get();
		m.setMeeting_Location("NewLocationForTest");
		ms.addMeeting(m);
	}

	@Test
	public void testretrieveMeeting() {
		Meeting m = meetingRepository.findById(Long.parseLong("1")).get();
		ms.retrieveMeeting("1").getClass();
		System.out.println(m);
	}

	// ============================//

}
