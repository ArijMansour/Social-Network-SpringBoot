package tn.esprit.services;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Forum;
import tn.esprit.repositories.ForumRepository;




@Service
public class ForumServiceImpl implements ForumService{

	@Autowired
	ForumRepository forumRepository;
	
	public static final Logger l = LogManager.getLogger(ForumServiceImpl.class);

	@Override
	public List<Forum> retrieveAllForums() {
		
		List<Forum> forums = (List<Forum>) forumRepository.findAll();
		for (Forum forum : forums){
			l.info("forum +++ : " + forum);
		}
		return forums ;
	}

	@Override
	public Forum addForum(Forum forum) {
		return forumRepository.save(forum);
	}

	@Override
	public void deleteForum(String id) {
		forumRepository.deleteById(Long.parseLong(id));
		
	}

	@Override
	public Forum updateForum(Forum forum) {
		return forumRepository.save(forum);
	}

	@Override
	public Forum retrieveForum(String id) {
		Forum forum = forumRepository.findById(Long.parseLong(id)).get();
		l.info("forum returned :" + forum);
		 return forum;
	}

	
}
