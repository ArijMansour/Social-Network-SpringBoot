package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Meeting;

public interface MeetingService {

	// =======Oussema Mihoubi=======//

	List<Meeting> retrieveAllMeetings();

	Meeting addMeeting(Meeting m);

	void deleteMeeting(String id);

	Meeting retrieveMeeting(String id);

	String retrieveNbrMeetings();

	String retrieveNbrMeetingsByStatus(int i);

	List<Meeting> retrieveMeetingByStatus(String i);

	// ============================//

}
