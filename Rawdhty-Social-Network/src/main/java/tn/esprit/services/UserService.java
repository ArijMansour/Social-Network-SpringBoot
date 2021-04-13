package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Claim;
import tn.esprit.entities.Meeting;
import tn.esprit.entities.Role;
import tn.esprit.entities.User;

public interface UserService {

	// =======Oussema Mihoubi=======//

	List<User> retrieveAllUsers();

	User addUser(User u);

	void deleteUser(String id);

	User retrieveUser(String id);

	String retrieveNbrUsers();

	String retrieveNbrUsersByRole(Role s);

	String retrieveNbrUsersByStatus(int i);

	List<User> retrieveUsersByRole(String s);

	List<User> retrieveUsersByStatus(String i);

	String addClaimToUser(int claimId, int userId);

	List<Claim> getAllClaimsByUser(int userId);

	String addMeetingToUser(int mId, int uId);

	List<Meeting> getAllMeetingsByUser(int uId);

	

	// ============================//

}
