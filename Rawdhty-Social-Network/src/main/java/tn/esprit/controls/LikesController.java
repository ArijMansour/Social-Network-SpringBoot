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


import tn.esprit.entities.Likes;
import tn.esprit.services.LikesServiceImpl;
import tn.esprit.services.PostServiceImpl;
import tn.esprit.services.UserServiceImpl;


@RestController
public class LikesController {
	
	@Autowired
	private LikesServiceImpl serviceLikes;
	
	@Autowired
	private PostServiceImpl servicePost;
	
	@Autowired
	private UserServiceImpl serviceUser ;
	
	
	
	
	
	//find all Likes.
	// http://localhost:8083/SpringMVC/servlet/getAllLikes
	@GetMapping(value = "getAllLikes")
	public List<Likes> getAllLike(){
		List<Likes> list = serviceLikes.retrieveAllLikes();
		return list ;
	}
	
	
	//save a Like
	   // http://localhost:8083/SpringMVC/servlet/addLike
	
	@PostMapping(value = "/addLike")
	@ResponseBody
	public Likes addLikes(@RequestBody Likes like){
		return serviceLikes.addLikes(like);
	}
	
	
	//Update like
	// http://localhost:8083/SpringMVC/servlet/updateLike
	
	
	@PutMapping(value = "/updateLike")
	public Likes updateLike(@RequestBody Likes like){
		return serviceLikes.updateLikes(like);
		
	}
	
	// delete a Like
	// http://localhost:8083/SpringMVC/servlet/deleteLike

	
	@DeleteMapping("deleteLike")
	public String deleteLike(@RequestParam String id){
		
		serviceLikes.deleteLikes(id);
		return "Like Deleted !!";
		
	}
	
	
	///////////////////Metier////////////////////////
	
	
	// http://localhost:8083/SpringMVC/servlet/AffectUserToLike
	
		@PutMapping(value = "/AffectUserToLike/{id}/{Post_Id}/{likeid}")
		@ResponseBody
			public void AffectUserToLike(@PathVariable("id") String id  , @PathVariable("Post_Id") String Post_Id , @PathVariable("likeid") String likeid ){
			
			serviceLikes.affectPostToUser(id, Post_Id, likeid);
			
		}
		
		
		// http://localhost:8083/SpringMVC/servlet/getLikesByUserId
		
		@GetMapping(value = "/getLikesByUserId/{userId}")
		public List<Likes> getLikesByUserId(@PathVariable("userId") long userId){
			return serviceLikes.getLikesByUserId(userId);
		}
		
		
		// http://localhost:8083/SpringMVC/servlet/getLikesByPostId
		
		@GetMapping(value = "/getLikesByPostId/{postId}")
		public List<Likes> getLikesByPostId(@PathVariable("postId") long postId){
			return serviceLikes.getLikesByPostId(postId);
		}
	
		/*
		// http://localhost:8083/SpringMVC/servlet/affectLikeToUser
		
		@PutMapping(value = "affectLikeToUser/{userId}/{likeid}")
		public void AffectLikeToUser(@PathVariable("userId") long userId , @PathVariable("likeid") long likeid){
			serviceLikes.affectUserToLike(likeid , userId);
		}
		
		*/
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
