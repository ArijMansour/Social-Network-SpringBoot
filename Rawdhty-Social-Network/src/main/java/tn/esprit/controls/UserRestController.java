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

import tn.esprit.entities.Role;
import tn.esprit.entities.Claim;
import tn.esprit.entities.Meeting;
import tn.esprit.entities.User;
import tn.esprit.repositories.UserRepository;
import tn.esprit.services.UserService;

@RestController
public class UserRestController {

	// =======Oussema Mihoubi=======//

	@Autowired
	UserService userService;
	@Autowired
	UserRepository userRepository;
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

	// Retrieve All Users List By Role
	// http://localhost:8083/SpringMVC/servlet/retrieve-users-byRole/{user-role}
	@GetMapping("/retrieve-users-byRole/{user-role}")
	@ResponseBody
	public List<User> getUsersByRole(@PathVariable("user-role") String s) {
		return userService.retrieveUsersByRole(s);
	}
	
	
	
	// http://localhost:8083/SpringMVC/servlet/GetUserbyActivity/{Id}
	@GetMapping("/GetUserbyActivity/{Id}")
	@ResponseBody
	public String getUsersByActivity(@PathVariable("Id") long Id){
		return userRepository.GetUserbyActivityId(Id);
		
	}
	
	
	

}
