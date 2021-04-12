package tn.esprit;

import static org.junit.Assert.assertTrue;


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

import tn.esprit.entities.Event;
import tn.esprit.entities.Event_Place;
import tn.esprit.entities.Event_Type;
import tn.esprit.services.EventService;





@RunWith(SpringRunner.class)
@SpringBootTest
public class EventServiceImplTest {
	
	
	@Autowired
	EventService serviceEvent;
	
	
	
	@SuppressWarnings("unused")
	private static final Logger l = LogManager.getLogger(EventServiceImplTest.class);	

	@Test
	public void testAddEvent() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-04-11");
		Date date1 = dateFormat.parse("2021-05-20");
		Event event = new Event(date, date1, "event_Description1", Event_Place.KINDERGARDEN, Event_Type.COMETITION);
		assertTrue(event.getEvent_place().equals(Event_Place.KINDERGARDEN));
		assertTrue(event.getEvent_type().equals(Event_Type.COMETITION));
		serviceEvent.addEvent(event);
	}
	
	@Test
	public void testRetrieveEvent(){
		serviceEvent.retrieveEvent("1");
	}
	
	@Test
	public void testRetrieveAllEvent(){
		serviceEvent.retrieveAllEvent();
	}
	
	
	@Test
	public void testDeleteEvent(){
		serviceEvent.deleteEvent("2");
	}

	@Test
	public void testUpdateEvent() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-03-07");
		Date date1 = dateFormat.parse("2021-03-19");
		Event event = new Event(date, date1, "event_Description", Event_Place.KINDERGARDEN, Event_Type.COMETITION);
		serviceEvent.updateEvent(event);
	}
	
	
	
	
	
	
	
	
	
	

}
