package tn.esprit.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.User ;
import tn.esprit.services.UserService;


 @RestController
@RequestMapping("/User/Stats")//
public class UserStatistiqueRestController {
	@Autowired
	UserService userservice;
	
	
	@GetMapping("/ValidUser")
	public int ValidUser() {
		List<User> users = userservice.retrieveAllUsers();
		int valide = 0;
		for (User user : users) {
			if (user.isValid()) {
			valide++;
		}
	}
	return valide;
	} 
	
	
	
	/*@GetMapping("/KindergardenOwner")
	//public int KindergardenUser() {
		//List<User> users = userservice.retrieveAllUsers();
		//int valide = 0;
		//for (User user : users) {
			//if (user.getRole().getRoleType().name().equals(Role_Type.KINDERGARDENOWNER.toString())){
				//valide++;
			}
		}
		return valide;
	}*/
	
	//@GetMapping("/Doctor")
	//public int  DoctorUser() {
	//	List<User> users = userservice.retrieveAllUsers();
	//	int valide = 0;
	//	for (User user : users) {
		//	if (user.getRoleType().equals(roletype.DOCTOR.toString()))
		//	 {
		//		valide++;
		//	}
	//	}
	//	return valide;
		
		
	//}
	
//	@GetMapping("/Parent")
	//public int ParentUser() {
	//	List<User> users = userservice.retrieveAllUsers();
	//	int valide = 0;
	//	for (User u : users) {
		//	if (u.getRoleType().equals(roletype.PARENT.toString())) {
		//		valide++;
		//	}
	//	}
	//	return valide;
	//}
	
	

	//@GetMapping("/Educator")
	//public int Educator() {
	//	List<User> users = userservice.retrieveAllUsers();
	//	int valide = 0;
	//	for (User user : users) {
//			if (user.getRoleType().equals(roletype.EDUCATOR.toString())) {
	//			valide++;
	//		}
	//	}
	//	return valide;
//	}
	
	
	//
//}//

 }
