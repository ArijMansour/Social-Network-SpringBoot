package tn.esprit.controls;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Event;
import tn.esprit.services.EventServiceImpl;





@RestController
public class EventController {
	
	@Autowired
	private EventServiceImpl serviceEvent;
	
	
	
	//find all Events
		// http://localhost:8083/SpringMVC/servlet/get-all-Events
	
	@GetMapping(value = "/get-all-Events")
	@ResponseBody
		public List<Event> findAllEvents(){
			List<Event> list = serviceEvent.retrieveAllEvent();
			return list;
		}
	
	
	//save an Event 
	   // http://localhost:8083/SpringMVC/servlet/addEvent
	
	@PostMapping(value = "/addEvent")
	public Event addEvent(@RequestBody Event event){
		System.out.println("Event added jawou behi .....");
		serviceEvent.addEvent(event);
		return event;
	}
	
	
	
	
	
	
	
	//UpdateEvent
		// http://localhost:8083/SpringMVC/servlet/updateEvent
		
		
		@PutMapping(value = "/updateEvent")
		public Event updateEvent(@RequestBody Event event){
			return serviceEvent.updateEvent(event);
			
		}
		
		
		
		// delete an Event
				// http://localhost:8083/SpringMVC/servlet/deleteEvent

				
				@DeleteMapping("deleteEvent")
				public String deleteEvent(@RequestParam String id){
					
					serviceEvent.deleteEvent(id);
					return "Event Deleted !!";
					
				}
		
				
				
				// findOneAppoinment
				// http://localhost:8083/SpringMVC/servlet/retrieve-Event
				
					@GetMapping(value = "/retrieve-Event/{Event-id}")
					@ResponseBody
					public Event findEvent(@PathVariable("Event-id") String Id){
						return serviceEvent.retrieveEvent(Id);
						
					}
		
		/*
		// delete an Event
		// http://localhost:8083/SpringMVC/servlet/deleteEvent

		
		@DeleteMapping("deleteEvent")
		public String deleteEvent(@RequestParam String id){
			
			serviceEvent.deleteEvent(id);
			return "Event Deleted !!";
			
		}
		
		// findOneAppoinment
		// http://localhost:8083/SpringMVC/servlet/findEvent
		
			@GetMapping(value = "/retrieve-Event/{Event-id}")
			@ResponseBody
			public Event findEvent(@PathVariable("Event-id") String Id){
				return serviceEvent.retrieveEvent(Id);
				
			}*/
	
	

}
