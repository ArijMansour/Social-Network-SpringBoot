package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Event;




public interface EventService {
	
	List<Event> retrieveAllEvent();
	Event       addEvent(Event event);
	void        deleteEvent(String id);
	Event       updateEvent(Event event);
	Event       retrieveEvent(String id);

}
