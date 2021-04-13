package tn.esprit.services;

import java.util.List;


import tn.esprit.entities.Activity ;
public interface ActivityService {
	
	List<Activity> retrieveAllActivities();
	Activity addActivity(Activity a);
	void deleteActivity(String Activity_Id);
	Activity retrieveActivity(String  Activity_Id);
    Long getnbActivity() ; 
    List<Activity> getActivityByStatus(String i) ; 
    public List<Activity> searchActivities(String text);
	String GetUserbyActivityId(long id);
   
}
