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

import tn.esprit.entities.Satisfaction;
import tn.esprit.services.SatisfactionService;

@RestController
public class SatisfactionRestController {
	@Autowired
	SatisfactionService satisfactionService;

	// http://localhost:8083/SpringMVC/servlet/retrieve-all-satisfactions
	@GetMapping("/retrieve-all-satisfactions")
	@ResponseBody
	public List<Satisfaction> getSatisfactions() {
		List<Satisfaction> list = satisfactionService.retrieveAllSatisfactions();
		return list;
	}

	// http://localhost:8083/SpringMVC/servlet/retrieve-satisfaction/{satisfaction-id}
	@GetMapping("/retrieve-satisfaction/{satisfaction-id}")
	@ResponseBody
	public Satisfaction retrieveClub(@PathVariable("satisfaction-id") String satisfactionId) {
		return satisfactionService.retrieveSatisfaction(satisfactionId);
	}

	// http://localhost:8083/SpringMVC/servlet/add-satisfaction
	@PostMapping("/add-satisfaction")
	@ResponseBody
	public Satisfaction addClub(@RequestBody Satisfaction s) {
		Satisfaction satisfaction = satisfactionService.addSatisfaction(s);
		return satisfaction;
	}

	// http://localhost:8083/SpringMVC/servlet/remove-satisfaction/{satisfaction-id}
	@DeleteMapping("/remove-satisfaction/{satisfaction-id}")
	@ResponseBody
	public String removeClub(@PathVariable("satisfaction-id") String satisfactionId) {
		String a="vous avez supprimer la satisfaction de l'id: ";
		satisfactionService.deleteSatisfaction(satisfactionId);
		return (a+satisfactionId);
	}

	// http://localhost:8083/SpringMVC/servlet/modify-satisfaction
	@PutMapping("/modify-satisfaction")
	@ResponseBody
	public Satisfaction modifySatisfaction(@RequestBody Satisfaction satisfaction) {
		return satisfactionService.addSatisfaction(satisfaction);
	}
	
	


}
