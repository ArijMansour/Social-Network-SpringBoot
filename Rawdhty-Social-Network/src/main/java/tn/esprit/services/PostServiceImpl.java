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
public class PostServiceImpl implements PostService{

	@Autowired
	PostRepository postRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LikesRepository likesRepository ;
	
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
		Post post = postRepository.findById(Long.parseLong(id)).get();
		//User u = userRepository.findById(Long.valueOf(id)).get();
		if(post.getUser() != null ){
			post.setUser(null);
			postRepository.delete(post);
		}else
			postRepository.delete(post);
		
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
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	

	@Override
	public void affectPostToUser(String id, String postId) {
		Post post = postRepository.findById(Long.valueOf(postId)).get();
		User user = userRepository.findById(Long.valueOf(id)).orElse(null);
		post.setUser(user);
		postRepository.save(post);
		
	}
	

	@Override
	public List<Post> getPostsByUserId(long id) {
		return postRepository.getPostByUserId(id);
	}

	@Override
	public List<Post> getPostsLikedByUser(long id) {
		return postRepository.getPostsLikedByUser(id);
	}

	@Override
	public int CountPosts() {
		//List <Post> posts=(List<Post>) postRepository.findAll();
		
		return    postRepository.getNombrePosts();
	}

	@Override
	public int CountPostsByUser(long id) {
		List <Post> posts=(List<Post>) postRepository.getPostByUserId(id);
		return posts.size();
	}
	
	

	@Override
	public Post mostLikedPost() throws Exception {
		int max=0;
		Post mostliked= new Post();
		for(Post p : postRepository.findAll()){
			int nbLikes = ((List<Likes>) likesRepository.getLikesByPostId(p.getPost_Id())).size();
			if (max<nbLikes){
				max = nbLikes ;
				mostliked = p ;
			}
		}
		
		return mostliked ;
			
	}
	
	
	
	

	

}
