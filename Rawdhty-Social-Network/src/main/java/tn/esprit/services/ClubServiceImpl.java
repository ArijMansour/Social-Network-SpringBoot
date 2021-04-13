package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Club;
import tn.esprit.repositories.ClubRepository;


@Service
public class ClubServiceImpl implements ClubService {

	@Autowired
	ClubRepository clubRepository;
	
	private static final Logger L = LogManager.getLogger(ClubServiceImpl.class);
	
	@Override
	public List<Club> retrieveAllClubs() {
		List<Club> clubs = (List<Club>) clubRepository.findAll();
		for (Club club : clubs) {
			L.info("club +++ : " + club);
		}
		return clubs;
	}

	@Override
	public Club addClub(Club c) {
		System.out.println("Club Added Successfully");
		return clubRepository.save(c);
	}

	@Override
	public void deleteClub(String id) {
		 clubRepository.deleteById(Long.parseLong(id));
		System.out.println("Club Deleted Successfully");
		
	}


	@Override
	public Club retrieveClub(String id) {
		return clubRepository.findById(Long.parseLong(id)).get();
	}


}
