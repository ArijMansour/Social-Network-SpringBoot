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
import tn.esprit.services.PostServiceImpl;





@RestController
public class PostController {
	
	
	@Autowired
	private PostServiceImpl servicePost;
	
	
	
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

}
