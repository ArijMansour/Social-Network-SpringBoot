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

import tn.esprit.entities.Club;
import tn.esprit.services.ClubService;


@RestController
public class ClubRestController {
	@Autowired
	ClubService clubService;

	// http://localhost:8083/SpringMVC/servlet/retrieve-all-clubs
	@GetMapping("/retrieve-all-clubs")
	@ResponseBody
	public List<Club> getClubs() {
		List<Club> list = clubService.retrieveAllClubs();
		return list;
	}

	// http://localhost:8083/SpringMVC/servlet/retrieve-club/{club-id}
	@GetMapping("/retrieve-club/{club-id}")
	@ResponseBody
	public Club retrieveClub(@PathVariable("club-id") String clubId) {
		return clubService.retrieveClub(clubId);
	}

	// http://localhost:8083/SpringMVC/servlet/add-club
	@PostMapping("/add-club")
	@ResponseBody
	public Club addClub(@RequestBody Club c) {
		Club club = clubService.addClub(c);
		return club;
	}

	// http://localhost:8083/SpringMVC/servlet/remove-club/{club-id}
	@DeleteMapping("/remove-club/{club-id}")
	@ResponseBody
	public String removeClub(@PathVariable("club-id") String clubId) {
		String a="vous avez supprimer le club de l'id: ";
		clubService.deleteClub(clubId);
		return (a+clubId);
	}

	// http://localhost:8083/SpringMVC/servlet/modify-club
	@PutMapping("/modify-club")
	@ResponseBody
	public Club modifyClub(@RequestBody Club club) {
		return clubService.addClub(club);
	}

}
