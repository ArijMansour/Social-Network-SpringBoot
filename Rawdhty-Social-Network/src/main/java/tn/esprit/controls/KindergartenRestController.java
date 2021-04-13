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

import tn.esprit.entities.Kindergarten;
import tn.esprit.services.KindergartenService;

@RestController
public class KindergartenRestController {

	@Autowired
	KindergartenService ks;
	
	// http://localhost:8083/SpringMVC/servlet/retrieve-all-kindergartens
	@GetMapping("/retrieve-all-kindergartens")
	@ResponseBody
	public List<Kindergarten> getKindergartens(){
		List<Kindergarten> list = ks.retrieveAllKindergartens();
		return list;
	}
	
	// http://localhost:8083/SpringMVC/servlet/retrieve-kindergarten/{Kindergarden_Id}
		@GetMapping("/retrieve-kindergarten/{Kindergarden_Id}")
		@ResponseBody
		public Kindergarten retrieveKindergarten(@PathVariable("Kindergarden_Id") String Kindergarden_Id){
			
			return ks.retrievekindergarten(Kindergarden_Id) ;
		}
		
		// http://localhost:8083/SpringMVC/servlet/add-kindergarten
		@PostMapping("/add-kindergarten")
		@ResponseBody
		public Kindergarten addKindergarten(@RequestBody Kindergarten k){
			Kindergarten k1 = ks.addkindergarten(k);
			return k1;
		}
		// http://localhost:8083/SpringMVC/servlet/remove-kindergarten/{Kindergarden_Id}
		@DeleteMapping("/remove-kindergarten/{Kindergarden_Id}")
		@ResponseBody
		public void removekindergarten(@PathVariable("Kindergarden_Id") String Kindergarden_Id){
			ks.deleteKindergarten(Kindergarden_Id);
		}
		
		// http://localhost:8083/SpringMVC/servlet/modify-kindergarten
		@PutMapping("/modify-kindergarten")
		@ResponseBody
		public Kindergarten modifyKindergarten(@RequestBody Kindergarten k){
			return ks.addkindergarten(k);
		}
	
}
