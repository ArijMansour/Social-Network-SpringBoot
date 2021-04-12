package tn.esprit.services;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Post;
import tn.esprit.repositories.PostRepository;




@Service
public class PostServiceImpl implements PostService{

	@Autowired
	PostRepository postRepository;
	
	public static final Logger l = LogManager.getLogger(PostServiceImpl.class);

	@Override
	public List<Post> retrieveAllPosts() {
		
		List<Post> posts = (List<Post>) postRepository.findAll();
		for (Post post : posts){
			l.info("post +++ : " + post);
		}
		return posts ;
	}

	@Override
	public Post addPost(Post post) {
		return postRepository.save(post);
	}

	@Override
	public void deletePost(String id) {
		postRepository.deleteById(Long.parseLong(id));
		
	}

	@Override
	public Post updatePost(Post post) {
		return postRepository.save(post);
	}

	@Override
	public Post retrievePost(String id) {
		Post post = postRepository.findById(Long.parseLong(id)).get();
		l.info("post returned :" + post);
		 return post;
	}

	

}
