package tn.esprit.services;

import java.util.List;
import tn.esprit.entities.Notification ;
import tn.esprit.entities.User;
public interface NotificationService {
	
	List<Notification> retrieveAllNotifications();
	Notification addNotification(Notification a);
	void deleteNotification(String Notification_Id);
	Notification retrieveNotification(String Notification_Id);
	public List<Notification> getNotifByUser(int id);
	long retrieveNotifByCount();
}
