package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.entities.Meeting;

public interface MeetingRepository extends CrudRepository<Meeting, Long> {

	// =======Oussema Mihoubi=======//

	@Query("SELECT count(*) as nbMeetings FROM Meeting")
	int getMeetingsNumber();

	@Query("SELECT count(*) as nbMeetings FROM Meeting m WHERE m.Meeting_Status = :Meeting_Status")
	int getMeetingsNumberByStatus(@Param("Meeting_Status") int i);

	@Query("SELECT m FROM Meeting m WHERE m.Meeting_Status = :Meeting_Status")
	List<Meeting> findByMeeting_Status(@Param("Meeting_Status") int i);

	// ============================//

}
