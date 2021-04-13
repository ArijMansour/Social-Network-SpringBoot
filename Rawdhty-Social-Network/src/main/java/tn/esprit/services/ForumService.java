package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Forum;




public interface ForumService {
	
	List<Forum> retrieveAllForums();
	Forum addForum(Forum forum);
	void deleteForum(String id);
	Forum updateForum(Forum forum);
	Forum retrieveForum(String id);

}
