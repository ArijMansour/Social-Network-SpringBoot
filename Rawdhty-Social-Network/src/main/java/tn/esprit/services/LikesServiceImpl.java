package tn.esprit.services;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Likes;
import tn.esprit.repositories.LikesRepository;

@Service
public class LikesServiceImpl implements LikesService{
	
	@Autowired
	LikesRepository likesRepository ;
	
	
	
	public static final Logger l = LogManager.getLogger(LikesServiceImpl.class);


	@Override
	public List<Likes> retrieveAllLikes() {
		List<Likes> likes = (List<Likes>) likesRepository.findAll();
		for (Likes like : likes){
			l.info("like +++ : " + like);
		}
		return likes ;
	}

	@Override
	public Likes addLikes(Likes like) {
		return likesRepository.save(like);

	}

	@Override
	public void deleteLikes(String id) {
		likesRepository.deleteById(Long.parseLong(id));
		
	}

	@Override
	public Likes updateLikes(Likes like) {
		return likesRepository.save(like);

	}

	@Override
	public Likes retrieveLikes(String id) {
		Likes like = likesRepository.findById(Long.parseLong(id)).get();
		l.info("like returned :" + like);
		 return like;
	}

}
