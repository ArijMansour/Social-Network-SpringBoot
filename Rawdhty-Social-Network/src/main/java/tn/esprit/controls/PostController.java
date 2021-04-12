package tn.esprit.controls;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.entities.Post;
import tn.esprit.services.LikesServiceImpl;
import tn.esprit.services.PostServiceImpl;
import tn.esprit.services.UserServiceImpl;





@RestController
public class PostController {
	
	
	@Autowired
	private PostServiceImpl servicePost;
	
	@Autowired
	private UserServiceImpl serviceUser ;
	
	@Autowired
	private LikesServiceImpl serviceLikes ;
	
	
	
	//find all Posts
			// http://localhost:8083/SpringMVC/servlet/get-all-Posts
		@GetMapping(value = "/get-all-Posts")
		@ResponseBody
			public List<Post> findAllPosts(){
				List<Post> list = servicePost.retrieveAllPosts();
				return list;
			}
		
		//save a Post
		   // http://localhost:8083/SpringMVC/servlet/addPost
		
		@PostMapping(value = "/addPost")
		public Post addPost(@RequestBody Post post){
			System.out.println("post added check your DataBase .....");
			servicePost.addPost(post);
			return post;
		}
		
		
		//UpdatePost
				// http://localhost:8083/SpringMVC/servlet/updatePost
				
				
				@PutMapping(value = "/updatePost")
				public Post updatePost(@RequestBody Post post){
					return servicePost.updatePost(post);
					
				}
				
				
				// delete a Post
				// http://localhost:8083/SpringMVC/servlet/deletePost

				
				@DeleteMapping("deletePost")
				public String deletePost(@RequestParam String id){
					
					servicePost.deletePost(id);
					return "Post Deleted !!";
					
				}
				
				
				// findOnePost
				// http://localhost:8083/SpringMVC/servlet/retrieve-Post
				
					@GetMapping(value = "/retrieve-Post/{Post-id}")
					@ResponseBody
					public Post findPost(@PathVariable("Post-id") String Id){
						return servicePost.retrievePost(Id);
						
					}
					
					
					//////////////////////////////metier////////////////////////
					
					///////////////////////////////////////////////////////////////////////////////////////////////////////
					
					// http://localhost:8083/SpringMVC/servlet/AffectUserToPost
					
					// http://localhost:8083/SpringMVC/servlet/AffectUserToPost
					
					@PutMapping(value = "/AffectUserToPost/{id}/{Post_id}")
					@ResponseBody
						public void AffectUserToPost(@PathVariable("id") String id , @PathVariable("Post_id") String postId){
						
						servicePost.affectPostToUser(id, postId);
						
					}
					//////////////////////////////////////////////////////////////////////////////////////////////////////
					
					
					// http://localhost:8083/SpringMVC/servlet/posts-by-userId
					 
					 @GetMapping("/posts-by-user/{id}")
						public List<Post> getPostsByUser(@PathVariable("id") long id) {
							return servicePost.getPostsByUserId(id);
						}
					 
					////////////////////////////////////////////////////////////////////////////////////////////////////
					 
					 // http://localhost:8083/SpringMVC/servlet/PostLikedByUserId
					 
					 @GetMapping("/PostLikedByUserId/{userId}")
						public List<Post> getMostLikedPost(@PathVariable("userId") long id) {
							return servicePost.getPostsLikedByUser(id);
						}
					 
					 /////////////////////////////////////////////////////////////////////////////////////////////////////
					 
					 
					 // http://localhost:8083/SpringMVC/servlet/numberOfPosts
					 
					 @GetMapping(value = "numberOfPosts")
					 @ResponseBody
					 public String CountPosts(){
						 int a =  servicePost.CountPosts();
						 return "The number of posts exists are  : " + "  "+  a ;
					 }
					 
					 /////////////////////////////////////////////////////////////////////////////////////////////////////
					 
					 // http://localhost:8083/SpringMVC/servlet/numberOfPostsByUser
					 
					 @GetMapping(value = "numberOfPostsByUser/{userId}")
					 @ResponseBody
					 public String CountPostsByUserId(@PathVariable("userId") long userId){
						 int a =  servicePost.CountPostsByUser(userId);
						 return "This User have : " + a + "current posts" ;
					 }
					 
					 ///////////////////////////////////////////////////////////////////////////////////////////////////////////
					 // http://localhost:8083/SpringMVC/servlet/mostLikedPosts
					 
					 @GetMapping(value = "/mostLikedPosts")
						 public Post mostLikedPost() throws Exception{
							 return servicePost.mostLikedPost();
						 }
					 
					 
					 ////////////////////////////////////////////////////////////////////////////////////////////////////////////
					 
					// http://localhost:8083/SpringMVC/servlet/isLikesExisit/{userId}/{postId}
					 
						@GetMapping(value = "/isLikesExisit/{userId}/{postId}")
						public String likesExists(@PathVariable("userId") long userId , @PathVariable("postId") long postId){
							boolean a =  serviceLikes.IsLikeExists(userId, postId);
							
							if (a == true){
								return " you already liked this post , you can't like twice !!!";
							}else
								
								return "yes you can like this post";
							
						}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					

}
