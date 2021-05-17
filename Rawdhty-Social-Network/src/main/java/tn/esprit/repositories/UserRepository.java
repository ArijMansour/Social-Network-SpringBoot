package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Activity;
import tn.esprit.entities.Role;
import tn.esprit.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	// =======Oussema Mihoubi=======//

	@Query("SELECT count(*) as nbUsers FROM User")
	int getUsersNumber();


	@Query("SELECT count(*) as nbUsers FROM User u WHERE u.Status = :Status")
	int getUsersNumberByStatus(@Param("Status") int i);

	@Query("SELECT u FROM User u WHERE u.role = :role")
	List<User> getUsersByRole(@Param("role") Role s);

	@Query("SELECT u FROM User u WHERE u.Status = :Status")
	List<User> getUsersByStatus(@Param("Status") int i);

	// ============================//
	//Arij Mansour//
	
	@Query("SELECT count(*) as nbUsers FROM User u WHERE u.role = :role")
	int getUsersNumberByRole(@Param("role") Role s);
	
	//@Query("SELECT new Responsejoin( c.role , p.activity_Name) FROM User c JOIN p.activities p")
	//public List <Responsejoin> getJoinInformation();
	//User save(Activity activity);
	
	@Query("Select "
			+ "DISTINCT A.Activity_Name FROM tn.esprit.entities.Activity A "
			+ "join A.user U "
			+ "where U.Id=:Id")
    public String  GetUserbyActivityId(@Param("Id")long Id); 
	
	
	@Query("Select "
			+ "DISTINCT A.sender FROM tn.esprit.entities.Chat A "
			+ "join A.user U "
			+ "where U.Id=:Id")
    public String  GetUserbyChat_sender(@Param("Id")long Id); 
	
	
}
