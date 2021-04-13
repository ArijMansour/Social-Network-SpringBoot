package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Profile;
import tn.esprit.repositories.ProfileRepository;


@Service
public class ProfileServiceImpl implements ProfileService {
	@Autowired
	ProfileRepository profileRepository;

	private static final Logger L = LogManager.getLogger(ProfileServiceImpl.class);
	@Override
	public List<Profile> retrieveAllProfiles() {
		List<Profile> profiles = (List<Profile>) profileRepository.findAll();
		for (Profile profile : profiles) {
			L.info("profile +++ : " + profile);
		}
		return profiles;
	}

	@Override
	public Profile addProfile(Profile p) {
		System.out.println("Profile Added Successfully");
		return profileRepository.save(p);
	}

	@Override
	public void deleteProfile(String id) {
		profileRepository.deleteById(Long.parseLong(id));
		System.out.println("Profile Deleted Successfully");

	}


	@Override
	public Profile retrieveProfile(String id) {
		return profileRepository.findById(Long.parseLong(id)).get();
	}


}
