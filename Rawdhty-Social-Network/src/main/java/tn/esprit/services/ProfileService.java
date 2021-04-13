package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Profile;


public interface ProfileService {

	List<Profile> retrieveAllProfiles();
	Profile addProfile(Profile p);
	void deleteProfile(String id);
	Profile retrieveProfile(String id);

}
