package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Post;




public interface PostService {
	
	List<Post> retrieveAllPosts();
	Post addPost(Post post);
	void deletePost(String id);
	Post updatePost(Post post);
	Post retrievePost(String id);

}
