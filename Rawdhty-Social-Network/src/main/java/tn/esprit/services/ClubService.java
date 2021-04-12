package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Club;





public interface ClubService {
	
	List<Club> retrieveAllClubs();
	Club addClub(Club c);
	void deleteClub(String id);
	Club retrieveClub(String id);

}
