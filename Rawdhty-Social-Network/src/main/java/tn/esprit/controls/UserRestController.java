package tn.esprit.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Claim;
import tn.esprit.entities.Course;
import tn.esprit.entities.Meeting;
import tn.esprit.entities.Role;
import tn.esprit.entities.User;
import tn.esprit.services.UserService;

@RestController
public class UserRestController {

	// =======Oussema Mihoubi=======//

	@Autowired
	UserService userService;

	// Retrieve All Users List
	// http://localhost:8083/SpringMVC/servlet/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers() {
		List<User> list = userService.retrieveAllUsers();
		return list;
	}

	// http://localhost:8083/SpringMVC/servlet/retrieve-user/{user-id}
	@GetMapping("/retrieve-user/{user-id}")
	@ResponseBody
	public User retrieveUser(@PathVariable("user-id") String userId) {
		return userService.retrieveUser(userId);
	}

	// http://localhost:8083/SpringMVC/servlet/add-user
	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User u) {
		User user = userService.addUser(u);
		return user;
	}

	// http://localhost:8083/SpringMVC/servlet/remove-user/{user-id}
	@DeleteMapping("/remove-user/{user-id}")
	@ResponseBody
	public void removeUser(@PathVariable("user-id") String userId) {
		userService.deleteUser(userId);
	}

	// http://localhost:8083/SpringMVC/servlet/remove-all-users
	/*
	 * @DeleteMapping("/remove-all-users")
	 * 
	 * @ResponseBody public void removeAllUsers() {
	 * userService.deleteAllUsers(); }
	 */
	// http://localhost:8083/SpringMVC/servlet/modify-user
	@PutMapping("/modify-user")
	@ResponseBody
	public User modifyUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	// http://localhost:8083/SpringMVC/servlet/users-nbr
	@GetMapping("/users-nbr")
	@ResponseBody
	public String getNbrUsers() {
		return userService.retrieveNbrUsers();
	}

	// http://localhost:8083/SpringMVC/servlet/users-nbr-status/{user-status}
	@GetMapping("/users-nbr-status/{user-status}")
	@ResponseBody
	public String getNbrUsersByStatus(@PathVariable("user-status") int i) {
		return userService.retrieveNbrUsersByStatus(i);
	}

	// http://localhost:8083/SpringMVC/servlet/users-role/{role}
	@GetMapping("/users-role/{role}")
	@ResponseBody
	public String getNbrUsersByRole(@PathVariable("role") Role s) {
		return userService.retrieveNbrUsersByRole(s);
	}

	// Retrieve All Users List By Status
	// http://localhost:8083/SpringMVC/servlet/retrieve-users-byStatus/{user-status}
	@GetMapping("/retrieve-users-byStatus/{user-status}")
	@ResponseBody
	public List<User> getUsersByStatus(@PathVariable("user-status") String i) {
		return userService.retrieveUsersByStatus(i);
	}

	// Retrieve All Users List By Role
	// http://localhost:8083/SpringMVC/servlet/retrieve-users-byRole/{user-role}
	@GetMapping("/retrieve-users-byRole/{user-role}")
	@ResponseBody
	public List<User> getUsersByRole(@PathVariable("user-role") String s) {
		return userService.retrieveUsersByRole(s);
	}

	// http://localhost:8083/SpringMVC/servlet/Add-Claim-To-User/{claim-id}/{user-id}
	@PutMapping("/Add-Claim-To-User/{claim-id}/{user-id}")
	@ResponseBody
	public String addClaimToUser(@PathVariable("user-id") String userId, @PathVariable("claim-id") String claimId) {
		return userService.addClaimToUser(Integer.valueOf(claimId), Integer.valueOf(userId));
	}

	// http://localhost:8083/SpringMVC/servlet/Add-Meeting-To-User/{meeting-id}/{user-id}
	@PutMapping("/Add-Meeting-To-User/{meeting-id}/{user-id}")
	@ResponseBody
	public String addMeetingToUser(@PathVariable("user-id") String uId, @PathVariable("meeting-id") String mId) {
		return userService.addMeetingToUser(Integer.valueOf(mId), Integer.valueOf(uId));
	}

	// http://localhost:8083/SpringMVC/servlet/Add-Course-To-Educator/{course-id}/{user-id}
	@PutMapping("/Add-Course-To-Educator/{course-id}/{user-id}")
	@ResponseBody
	public String addCourseToUser(@PathVariable("user-id") String uId, @PathVariable("course-id") String crId) {
		return userService.addCourseToEducator(Integer.valueOf(crId), Integer.valueOf(uId));
	}

	// http://localhost:8083/SpringMVC/servlet/Claims-User/{User-id}
	@GetMapping("/Claims-User/{User-id}")
	@ResponseBody
	public List<Claim> getAllClaimsByUser(@PathVariable("User-id") String userId) {

		return userService.getAllClaimsByUser(Integer.valueOf(userId));
	}

	// http://localhost:8083/SpringMVC/servlet/Meetings-User/{User-id}
	@GetMapping("/Meetings-User/{User-id}")
	@ResponseBody
	public List<Meeting> getAllMeetingsByUser(@PathVariable("User-id") String userId) {

		return userService.getAllMeetingsByUser(Integer.valueOf(userId));
	}

	// http://localhost:8083/SpringMVC/servlet/Courses-User/{User-id}
	@GetMapping("/Courses-User/{User-id}")
	@ResponseBody
	public List<Course> getAllCoursesByUser(@PathVariable("User-id") String userId) {

		return userService.getAllCoursesByEducator(Integer.valueOf(userId));
	}

	// http://localhost:8083/SpringMVC/servlet/Block-User/{User-id}
	@PutMapping("/Block-User/{User-id}")
	@ResponseBody
	public String blockUser(@PathVariable("User-id") int userId) {

		return userService.blockUser(userId);
	}

	// http://localhost:8083/SpringMVC/servlet/Activate-Account/{User-id}
	@PutMapping("/Activate-Account/{User-id}")
	@ResponseBody
	public String activeAccount(@PathVariable("User-id") int userId) {

		return userService.activateAccount(userId);
	}

	// http://localhost:8083/SpringMVC/servlet/Authenticate/{User-email}/{User-password}
	@GetMapping("/Authenticate/{User-email}/{User-password}")
	@ResponseBody
	public String Authenticate(@PathVariable("User-email") String userEmail,
			@PathVariable("User-password") String userPassword) {

		return userService.getUserByEmailandPassword(userEmail, userPassword);
	}

	// ============================//
}
