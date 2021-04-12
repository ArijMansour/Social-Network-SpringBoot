package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Meeting;
import tn.esprit.repositories.MeetingRepository;

@Service
public class MeetingServiceImpl implements MeetingService {

	// =======Oussema Mihoubi=======//

	@Autowired
	MeetingRepository meetingRepository;

	private static final Logger L = LogManager.getLogger(MeetingServiceImpl.class);

	@Override
	public List<Meeting> retrieveAllMeetings() {
		List<Meeting> meetings = (List<Meeting>) meetingRepository.findAll();
		for (Meeting meeting : meetings) {
			L.info("meeting +++ : " + meeting);
		}
		return meetings;
	}

	@Override
	public Meeting addMeeting(Meeting m) {
		return meetingRepository.save(m);
	}

	@Override
	public void deleteMeeting(String id) {
		meetingRepository.deleteById(Long.parseLong(id));
	}

	@Override
	public Meeting retrieveMeeting(String id) {
		return meetingRepository.findById(Long.parseLong(id)).get();
	}

	@Override
	public String retrieveNbrMeetings() {
		Long nbMeetings = Long.valueOf(meetingRepository.getMeetingsNumber());
		return "The number of meetings is: " + nbMeetings + " Meetings";
	}

	@Override
	public List<Meeting> retrieveMeetingByStatus(String i) {
		// TODO Auto-generated method stub
		return meetingRepository.findByMeeting_Status(Integer.valueOf(i));
	}

	@Override
	public String retrieveNbrMeetingsByStatus(int i) {
		Long nbMeetings = Long.valueOf(meetingRepository.getMeetingsNumberByStatus(i));
		if (i == 1 && nbMeetings == 1) {
			return "The number of scheduled meeting is: " + nbMeetings + " Scheduled Meeting";
		} else if (i == 1 && nbMeetings > 1) {
			return "The number of scheduled meetings is: " + nbMeetings + " Scheduled Meetings";
		} else
			return "The number of ended meetings is: " + nbMeetings + " Ended Meetings";
	}

	// ============================//

}
