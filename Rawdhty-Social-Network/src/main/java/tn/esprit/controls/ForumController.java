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

import tn.esprit.entities.Forum;
import tn.esprit.services.ForumServiceImpl;





@RestController
public class ForumController {
	
	@Autowired
	private ForumServiceImpl serviceForum;
	
	
	//find all Forum
			// http://localhost:8083/SpringMVC/servlet/get-all-Forums
		@GetMapping(value = "/get-all-Forums")
		@ResponseBody
			public List<Forum> findAllForum(){
				List<Forum> list = serviceForum.retrieveAllForums();
				return list;
			}
		
		//save an Forum
		   // http://localhost:8083/SpringMVC/servlet/addForum
		
		@PostMapping(value = "/addForum")
		public Forum addForum(@RequestBody Forum forum){
			System.out.println("forum added jawou behi .....");
			serviceForum.addForum(forum);
			return forum;
		}
		
		//UpdateForum
				// http://localhost:8083/SpringMVC/servlet/updateForum
				
				
				@PutMapping(value = "/updateForum")
				public Forum updateForum(@RequestBody Forum forum){
					return serviceForum.updateForum(forum);
					
				}
				
				
				// delete an Forum
				// http://localhost:8083/SpringMVC/servlet/deleteForum

				
				@DeleteMapping("deleteForum")
				public String deleteForum(@RequestParam String id){
					
					serviceForum.deleteForum(id);
					return "Forum Deleted !!";
					
				}
				
				
				// findOneForum
				// http://localhost:8083/SpringMVC/servlet/retrieve-Forum
				
					@GetMapping(value = "/retrieve-Forum/{Forum-id}")
					@ResponseBody
					public Forum findForum(@PathVariable("Forum-id") String Id){
						return serviceForum.retrieveForum(Id);
						
					}
	
	
	

}
