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

import tn.esprit.entities.Activity;
import tn.esprit.repositories.ActivityRepository;
import tn.esprit.services.ActivityService;
//import tn.esprit.spring.service.UserServiceImpl;

@RestController
public class ActivityRestController {
	
	@Autowired
	ActivityService activityService;
	
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-activities
	@GetMapping("/retrieve-all-activities")
	@ResponseBody
	public List<Activity> getactivities() {
	List<Activity> list = activityService.retrieveAllActivities();
	return list;
	}
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-activity/{activity-id}
	@GetMapping("/retrieve-activity/{activity-id}")
	@ResponseBody
	public Activity retrieveActivity(@PathVariable("activity-id") String activityId) {
	return activityService.retrieveActivity(activityId);
	}

	// http://localhost:8081/SpringMVC/servlet/add-activity
	@PostMapping("/add-activity")
	@ResponseBody
	public Activity addActivity(@RequestBody Activity a) {
	Activity activity1 = activityService.addActivity( a);
	return activity1;
	}
	
	// http://localhost:8081/SpringMVC/servlet/remove-activity/{activity-id}
	@DeleteMapping("/remove-activity/{activity-id}")
	@ResponseBody
	public void removeActivity(@PathVariable("activity-id") String activityId) {
	activityService.deleteActivity(activityId);
	}

	// http://localhost:8081/SpringMVC/servlet/modify-activity
	@PutMapping("/modify-activity")
	@ResponseBody
	public Activity modifyActivity(@RequestBody Activity activity) {
	return activityService.addActivity(activity);
	}
	
	// http://localhost:8081/SpringMVC/servlet/nbActivities
	@GetMapping("/nbActivities")
	@ResponseBody
	public Long getnbActivities () {
		
		return activityService.getnbActivity() ;
	}
	
	// http://localhost:8081/SpringMVC/servlet/activity-status
		@GetMapping("/activity-status")
		@ResponseBody
		public List <Activity> getActivityByStatus(@RequestParam("Activity_Status") String Activity_Status ) {
			return activityService.getActivityByStatus(Activity_Status) ;
			
		}

		// http://localhost:8081/SpringMVC/servlet/activity/search?pattern=
				@GetMapping("/activity/search")
				@ResponseBody
				public List <Activity> searchActivities(@RequestParam("pattern") String pattern ) {
					return activityService. searchActivities(pattern) ;
					
				}
			
			

}
