package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Child;

public interface ChildService {
	
	List<Child> retrieveAllChildren();
	Child addChild(Child Child);
	void deleteChild(String Child_ID);
	Child updateChild(Child Child);
	Child retrieveChild(String Child_ID );

}
