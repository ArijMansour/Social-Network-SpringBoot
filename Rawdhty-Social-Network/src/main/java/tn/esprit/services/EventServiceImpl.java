package tn.esprit.services;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Event;
import tn.esprit.repositories.EventRepository;



@Service
public class EventServiceImpl implements EventService{
	
	
	@Autowired
	EventRepository eventRepository;
	
	public static final Logger l = LogManager.getLogger(EventServiceImpl.class);


	@Override
	public List<Event> retrieveAllEvent() {
		
		List<Event> events = (List<Event>) eventRepository.findAll();
		
		for (Event event : events){
			
			l.info("event +++ : " + event);
		}
		return events ;
	}

	@Override
	public Event addEvent(Event event) {
		return eventRepository.save(event);

	}

	@Override
	public void deleteEvent(String id) {
		eventRepository.deleteById(Long.parseLong(id));
		
	}

	@Override
	public Event updateEvent(Event event) {
		return eventRepository.save(event);

	}

	@Override
	public Event retrieveEvent(String id) {
		Event event = eventRepository.findById(Long.parseLong(id)).get();
		l.info("event returned :" + event);
		 return event;
	}

	

}
