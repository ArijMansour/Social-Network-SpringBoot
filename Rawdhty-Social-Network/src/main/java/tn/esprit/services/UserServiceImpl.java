package tn.esprit.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Claim;
import tn.esprit.entities.Course;
import tn.esprit.entities.Meeting;
import tn.esprit.entities.Role;
import tn.esprit.entities.User;
import tn.esprit.repositories.ClaimRepository;
import tn.esprit.repositories.CourseRepository;
import tn.esprit.repositories.MeetingRepository;
import tn.esprit.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	// =======Oussema Mihoubi=======//

	@Autowired
	UserRepository userRepository;

	@Autowired
	ClaimRepository claimRepository;

	@Autowired
	MeetingRepository meetingRepository;

	@Autowired
	CourseRepository courseRepository;

	private static final Logger L = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<User> retrieveAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		for (User user : users) {
			L.info("user +++ : " + user);
		}
		return users;
	}

	@Override
	public User addUser(User u) {
		System.out.println("User Added Successfully");
		return userRepository.save(u);
	}

	@Override
	public void deleteUser(String id) {
		userRepository.deleteById(Long.parseLong(id));
		System.out.println("User Deleted Successfully");

	}

	@Override
	public User retrieveUser(String id) {
		return userRepository.findById(Long.parseLong(id)).get();
	}

	@Override
	public String retrieveNbrUsers() {
		Long nbUsers = Long.valueOf(userRepository.getUsersNumber());
		return "The number of users is: " + nbUsers + " Users";
	}

	@Override
	public String retrieveNbrUsersByRole(Role s) {
		Long nbUsers = Long.valueOf(userRepository.getUsersNumberByRole(s));

		return "The number of users desired is: " + nbUsers + " " + s;

	}

	@Override
	public String retrieveNbrUsersByStatus(int i) {
		Long nbUsers = Long.valueOf(userRepository.getUsersNumberByStatus(i));
		if (i == 1) {
			return "The number of active users is: " + nbUsers + " Active Users";
		} else if (nbUsers > 1) {
			return "The number of blocked users is: " + nbUsers + " Blocked Users";
		} else
			return "The number of blocked users is: " + nbUsers + " Blocked User";

	}

	@Override
	public List<User> retrieveUsersByRole(String s) {
		List<User> users = (List<User>) userRepository.findAll();
		List<User> userbyType = new ArrayList<User>();
		for (User u : users) {
			if (u.getRole().name().equals(s)) {
				userbyType.add(u);
			}
		}
		return userbyType;
	}

	@Override
	public List<User> retrieveUsersByStatus(String i) {
		return userRepository.getUsersByStatus(Integer.valueOf(i));
	}

	@Override
	public String addClaimToUser(int claimId, int userId) {
		Claim c = claimRepository.findById(Long.valueOf(claimId)).get();
		User u = userRepository.findById(Long.valueOf(userId)).get();
		L.info("Claim : " + u);

		c.setUser(u);
		claimRepository.save(c);

		return "Claim added to user successfully";

	}

	@Override
	public String addMeetingToUser(int mId, int uId) {
		Meeting m = meetingRepository.findById(Long.valueOf(mId)).get();
		User u = userRepository.findById(Long.valueOf(uId)).get();

		m.setUser(u);
		meetingRepository.save(m);

		return "Meeting added to user successfully";

	}

	@Override
	public String addCourseToEducator(int cId, int uId) {
		Course cr = courseRepository.findById(Long.valueOf(cId)).get();
		User u = userRepository.findById(Long.valueOf(uId)).get();
		if (u.getRole().name().equals("EDUCATOR")) {
			cr.setUser(u);
			courseRepository.save(cr);
			return "Course Add successfully to Educator";
		} else
			return "This user isn't an Educator!";
	}

	@Override
	public List<Claim> getAllClaimsByUser(int userId) {
		List<Claim> claims = (List<Claim>) claimRepository.findAll();

		List<Claim> sClaims = new ArrayList<Claim>();
		for (Claim c : claims) {

			if (c.getUser().getId() == userId) {
				sClaims.add(c);

			}
		}
		return sClaims;
	}

	@Override
	public List<Meeting> getAllMeetingsByUser(int userId) {
		List<Meeting> meetings = (List<Meeting>) meetingRepository.findAll();

		List<Meeting> sMeetings = new ArrayList<Meeting>();
		for (Meeting m : meetings) {

			if (m.getUser().getId() == userId) {
				sMeetings.add(m);

			}
		}
		return sMeetings;
	}

	@Override
	public List<Course> getAllCoursesByEducator(int uId) {
		List<Course> courses = (List<Course>) courseRepository.findAll();
		List<Course> sCourses = new ArrayList<Course>();
		for (Course cr : courses) {
			if (cr.getUser().getId() == uId) {
				sCourses.add(cr);
			}
		}
		return sCourses;
	}


	@Override
	public String getUserByEmailandPassword(String l, String p) {
		User u = userRepository.getUserByEmailAndPass(l, p);
		if (u != null && u.getStatus() != 0) {
			return "Logged in successfully " + u;
		} else
			return "Wrong Email or Password! Try again";

	}

	@Override
	public String blockUser(int uId) {
		User u = userRepository.findById(Long.valueOf(uId)).get();
		if (u.getStatus() == 1) {
			u.setStatus(0);
			userRepository.save(u);
			return "User Blocked";
		} else
			return "This user is already blocked!";

	}

	@Override
	public String activateAccount(int uId) {
		User u = userRepository.findById(Long.valueOf(uId)).get();
		if (u.getStatus() == 0) {
			u.setStatus(1);
			userRepository.save(u);
			return "Account Activated " + u;
		} else
			return "This account is already activated!";
	}

	// ============================//

}
