package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Likes;



public interface LikesService {
	
	
	List<Likes> retrieveAllLikes();
	Likes addLikes(Likes like);
	void deleteLikes(String id);
	Likes updateLikes(Likes like);
	Likes retrieveLikes(String id);

}
