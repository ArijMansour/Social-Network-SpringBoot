package tn.esprit.services;

import java.util.List;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Likes;
import tn.esprit.entities.Post;
import tn.esprit.entities.User;
import tn.esprit.repositories.LikesRepository;
import tn.esprit.repositories.PostRepository;
import tn.esprit.repositories.UserRepository;

@Service
public class LikesServiceImpl implements LikesService{
	
	@Autowired
	LikesRepository likesRepository ;
	
	@Autowired
	UserRepository userRepository ;
	
	@Autowired
	PostRepository postRepository;
	
	
	
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

	@Override
	public void affectPostToUser(String id, String Post_Id , String likeid) {
		Likes like = likesRepository.findById(Long.valueOf(likeid)).get();
		User user = userRepository.findById(Long.valueOf(id)).orElse(null);
		Post post = postRepository.findById(Long.valueOf(Post_Id)).get();
		like.setUser(user);
		like.setPost(post);
		likesRepository.save(like);
		
	}

	@Override
	public List<Likes> getLikesByUserId(long id) {
		return likesRepository.getLikesByUserId(id);
	}

	@Override
	public List<Likes> getLikesByPostId(long id) {
		return likesRepository.getLikesByPostId(id);
	}

	@Override
	public boolean IsLikeExists(long iduser, long idpost) {
		int count = likesRepository.isLikeExists(iduser, idpost);
		 if (count == 0){
			return false;
		}
		 else {
			 return true;
		 }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


