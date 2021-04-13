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

import tn.esprit.entities.Path;
import tn.esprit.services.PathService;

@RestController
public class PathRestController {
	@Autowired
	PathService ps;
	// http://localhost:8083/SpringMVC/servlet/retrieve-all-Paths
		@GetMapping("/retrieve-all-Paths")
		@ResponseBody
		public List<Path> getPaths() {
		List<Path> list = ps.retrieveAllPaths();
		return list;
		}
		// http://localhost:8083/SpringMVC/servlet/retrieve-Path/{Path-id}
		@GetMapping("/retrieve-Path/{Path-id}")
		@ResponseBody
		public Path retrievePath(@PathVariable("Path-id") String PathId) {
		return ps.retrievePath(PathId);
		}

		// http://localhost:8083/SpringMVC/servlet/add-Path
		@PostMapping("/add-Path")
		@ResponseBody
		public Path addPath(@RequestBody Path p) {
		Path Path1 = ps.addPath( p);
		return Path1;
		}
		
		// http://localhost:8083/SpringMVC/servlet/remove-Path/{Path-id}
		@DeleteMapping("/remove-Path/{Path-id}")
		@ResponseBody
		public void removePath(@PathVariable("Path-id") String PathId) {
		ps.deletePath(PathId);
		}

		// http://localhost:8083/SpringMVC/servlet/modify-Path
		@PutMapping("/modify-Path")
		@ResponseBody
		public Path modifyPath(@RequestBody Path Path) {
		return ps.addPath(Path);
		}

}
