package tn.esprit.services;

import java.util.List;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.entities.Notification;
import tn.esprit.entities.User;
import tn.esprit.repositories.NotificationRepository;

@Service
public class NotificationServiceImpl implements NotificationService {
	
	@Autowired
	NotificationRepository notificationRepository;
	
	private static final Logger L = LogManager.getLogger(NotificationServiceImpl.class);
	
	@Override
	public List<Notification> retrieveAllNotifications() {
		List<Notification> listnotif = (List<Notification>) notificationRepository.findAll();
		for (Notification notif :  listnotif) {
			L.info("notif +++ : " + notif);
		}
		return listnotif;
	}

	@Override
	public Notification addNotification(Notification a) {
		return notificationRepository.save(a);
	}

	@Override
	public void deleteNotification(String Notification_Id) {
		 notificationRepository.deleteById(Long.parseLong(Notification_Id));
		
	}


	@Override
	public Notification retrieveNotification(String Notification_Id) {
		return notificationRepository.findById(Long.parseLong(Notification_Id)).get();
	}
	
	@Override
    public List<Notification> getNotifByUser(int id) {

        return notificationRepository.getNotifByUser(id);

    }
	
	@Override
	public long retrieveNotifByCount() {
		return notificationRepository.count();
	}
}
