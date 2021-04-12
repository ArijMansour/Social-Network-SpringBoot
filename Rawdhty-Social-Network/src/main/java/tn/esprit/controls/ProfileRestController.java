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

import tn.esprit.entities.Profile;
import tn.esprit.services.ProfileService;

@RestController
public class ProfileRestController {


	@Autowired
	ProfileService profileService;

	// http://localhost:8083/SpringMVC/servlet/retrieve-all-profiles
	@GetMapping("/retrieve-all-profiles")
	@ResponseBody
	public List<Profile> getProfiles() {
		List<Profile> list = profileService.retrieveAllProfiles();
		return list;
	}

	// http://localhost:8083/SpringMVC/servlet/retrieve-profile/{profile-id}
	@GetMapping("/retrieve-profile/{profile-id}")
	@ResponseBody
	public Profile retrieveProfile(@PathVariable("profile-id") String profileId) {
		return profileService.retrieveProfile(profileId);
		
	}

	// http://localhost:8083/SpringMVC/servlet/add-profile
	@PostMapping("/add-profile")
	@ResponseBody
	public Profile addProfile(@RequestBody Profile p) {
		Profile profile = profileService.addProfile(p);
		return profile;
	}

	// http://localhost:8083/SpringMVC/servlet/remove-profile/{profile-id}
	@DeleteMapping("/remove-profile/{profile-id}")
	@ResponseBody
	public String removeProfile(@PathVariable("profile-id") String profileId) {
		String a="vous avez supprimer le profile de l'id: ";

		profileService.deleteProfile(profileId);
		
		return (a+profileId);

	}

	// http://localhost:8083/SpringMVC/servlet/modify-profile
	@PutMapping("/modify-profile")
	@ResponseBody
	public Profile modifyProfile(@RequestBody Profile pr) {
		return profileService.addProfile(pr);
	}
}
