package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Comment;
import tn.esprit.entities.Satisfaction;
import tn.esprit.entities.User;
import tn.esprit.repositories.SatisfactionRepository;

@Service
public class SatisfactionServiceImpl implements SatisfactionService {
	@Autowired
	@Qualifier("satisfactionRepository")
	SatisfactionRepository satisfactionRepository;
	@Autowired
	
	private static final Logger L = LogManager.getLogger(SatisfactionServiceImpl.class);
	
	@Override
	public List<Satisfaction> retrieveAllSatisfactions() {
		List<Satisfaction> satisfactions = (List<Satisfaction>) satisfactionRepository.findAll();
		for (Satisfaction satisfaction : satisfactions) {
			L.info("satisfaction +++ : " + satisfaction);
		}
		return satisfactions;
	}

	@Override
	public Satisfaction addSatisfaction(Satisfaction s) {
		System.out.println("Satisfaction Added Successfully");
		return satisfactionRepository.save(s);
	}

	@Override
	public void deleteSatisfaction(String id) {
		satisfactionRepository.deleteById(Long.parseLong(id));
		System.out.println("Satisfaction Deleted Successfully");
		
	}
	

	@Override
	public Satisfaction retrieveSatisfaction(String id) {
		return satisfactionRepository.findById(Long.parseLong(id)).get();
	}
	
	

	
	

}
