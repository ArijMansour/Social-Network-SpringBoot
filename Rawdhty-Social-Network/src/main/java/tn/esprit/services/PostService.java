package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Post;




public interface PostService {
	
	List<Post> retrieveAllPosts();
	Post addPost(Post post);
	void deletePost(String id);
	Post updatePost(Post post);
	Post retrievePost(String id);
	void affectPostToUser(String id, String postId);
	public int CountPosts();
	public int CountPostsByUser(long id);
	public List<Post> getPostsByUserId(long id);
	public List<Post> getPostsLikedByUser( long id);
	public Post mostLikedPost() throws Exception;



}
