package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Satisfaction;

public interface SatisfactionService {
	
	List<Satisfaction> retrieveAllSatisfactions();
	Satisfaction addSatisfaction(Satisfaction s);
	void deleteSatisfaction(String id);
	Satisfaction retrieveSatisfaction(String id);
}
