package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Kindergarten;



public interface KindergartenService {

	List<Kindergarten> retrieveAllKindergartens();
	Kindergarten addkindergarten(Kindergarten Kindergarten);
	void deleteKindergarten(String Kindergarden_Id);
	Kindergarten updatekindergarten(Kindergarten Kindergarten);
	Kindergarten retrievekindergarten(String Kindergarden_Id );
	
}
