package tn.esprit.controls;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Notification;
import tn.esprit.services.NotificationService;
//import tn.esprit.spring.service.UserServiceImpl;

@RestController
public class NotificationRestController {
	
	@Autowired
	NotificationService notificationService;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-Notification
	@GetMapping("/retrieve-all-Notification")
	@ResponseBody
	public List<Notification> getlistNotification() {
	List<Notification> list = notificationService.retrieveAllNotifications();
	return list;
	}
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-Notification/{Notification-id}
	@GetMapping("/retrieve-Notification/{Notification-id}")
	@ResponseBody
	public Notification retrieveNotification(@PathVariable("Notification-id") String NotificationId) {
	return notificationService.retrieveNotification(NotificationId);
	}

	// http://localhost:8081/SpringMVC/servlet/add-Notification
	@PostMapping("/add-Notification")
	@ResponseBody
	public Notification addNotification(@RequestBody Notification c) {
	Notification Notification1 = notificationService.addNotification( c);
	return Notification1;
	}
	
	// http://localhost:8081/SpringMVC/servlet/remove-Notification/{Notification-id}
	@DeleteMapping("/remove-Notification/{Notification-id}")
	@ResponseBody
	public void removeNotification(@PathVariable("Notification-id") String NotificationId) {
	notificationService.deleteNotification(NotificationId);
	}

	// http://localhost:8081/SpringMVC/servlet/modify-Notification
	@PutMapping("/modify-Notification")
	@ResponseBody
	public Notification modifyNotification(@RequestBody Notification Notification) {
	return notificationService.addNotification(Notification);
	}
	//URL: http://localhost:9293/SpringMVC/servlet/Notif/get-notif-by-user/{idU}

			@GetMapping("/Notif/get-notif-by-user/{idU}")
			public List<Notification> getNotifByUser(@PathVariable("idU") int idU)   
			{  
				return notificationService.getNotifByUser(idU);  
			}  
			

			// http://localhost:9090/SpringMVC/servlet/count-notif
			@GetMapping("/count-notif")
			@ResponseBody
			public long retrieveNotifByCount() {
			return notificationService.retrieveNotifByCount();
			}
	

}
