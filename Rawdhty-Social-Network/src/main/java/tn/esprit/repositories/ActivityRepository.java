package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import tn.esprit.entities.Activity;

public interface ActivityRepository extends CrudRepository<Activity,Long> {

	@Query("Select count(*) as nbActivity from Activity ")
	int getnbActivity () ;
	@Query("Select a  from Activity a Where a.Activity_Status = :Activity_Status ")
	List<Activity> getActivityByStatus(@Param("Activity_Status") int i) ; 
	//@Query("SELECT a FROM Activity a WHERE a.Activity_Description LIKE %?1% OR a.user.login LIKE %?1% ")
	//public List<Activity> findActivitiesByTextContaining(String text);
	
}
