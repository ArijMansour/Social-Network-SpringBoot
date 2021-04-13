package tn.esprit.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.services.ChildService;
import tn.esprit.entities.Child;

@RestController
public class ChildRestController {
	
	@Autowired
	ChildService childService;
	
	// http://localhost:8083/SpringMVC/servlet/retrieve-all-children
	@GetMapping("/retrieve-all-children")
	@ResponseBody
	public List<Child> getChildren() {
	List<Child> list = childService.retrieveAllChildren();
	return list;
	}
	
	// http://localhost:8083/SpringMVC/servlet/retrieve-Child/{Child-id}
	@GetMapping("/retrieve-Child/{Child-id}")
	@ResponseBody
	public Child retrieveChild(@PathVariable("Child-id") String ChildId) {
	return childService.retrieveChild(ChildId);
	}

	// http://localhost:8083/SpringMVC/servlet/add-Child
	@PostMapping("/add-Child")
	@ResponseBody
	public Child addChild(@RequestBody Child a) {
	Child Child1 = childService.addChild( a);
	return Child1;
	}
	
	// http://localhost:8083/SpringMVC/servlet/remove-Child/{Child-id}
	@DeleteMapping("/remove-Child/{Child-id}")
	@ResponseBody
	public void removeChild(@PathVariable("Child-id") String ChildId) {
	childService.deleteChild(ChildId);
	}

	// http://localhost:8083/SpringMVC/servlet/modify-Child
	@PutMapping("/modify-Child")
	@ResponseBody
	public Child modifyChild(@RequestBody Child Child) {
	return childService.addChild(Child);
	}

}
