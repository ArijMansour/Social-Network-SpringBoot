package tn.esprit.services;

import java.util.List;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.entities.Activity;
import tn.esprit.repositories.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {
	
	@Autowired
	ActivityRepository activityRepository;
	
	private static final Logger L = LogManager.getLogger(ActivityServiceImpl.class);
	
	@Override
	public List<Activity> retrieveAllActivities() {
		List<Activity> activities = (List<Activity>) activityRepository.findAll();
		for (Activity activity :  activities) {
			L.info("activity +++ : " + activity);
		}
		return activities;
	}

	@Override
	public Activity addActivity(Activity a) {
		return activityRepository.save(a);
	}

	@Override
	public void deleteActivity(String Activity_Id) {
		 activityRepository.deleteById(Long.parseLong(Activity_Id));
		
	}


	@Override
	public Activity retrieveActivity(String Activity_Id) {
		return activityRepository.findById(Long.parseLong(Activity_Id)).get();
	}

	@Override
	public Long getnbActivity() {
		return Long.valueOf(activityRepository.getnbActivity()) ;
	}

	@Override
	public List<Activity> getActivityByStatus(String i) {
		return activityRepository.getActivityByStatus(Integer.parseInt(i));
		
	}

	
	
	@Override
	public List<Activity> searchActivities(String text) {
       return activityRepository.findActivitiesByTextContaining(text);

	}

	@Override
	public String GetUserbyActivityId(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
