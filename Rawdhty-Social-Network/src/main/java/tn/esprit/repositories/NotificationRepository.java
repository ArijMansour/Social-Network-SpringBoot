package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.entities.Notification;

public interface NotificationRepository extends CrudRepository<Notification,Long> {
	@Query("SELECT n FROM Notification n WHERE n.receiver =:id ")
	public List<Notification> getNotifByUser(@Param("id")int id);
	
}
