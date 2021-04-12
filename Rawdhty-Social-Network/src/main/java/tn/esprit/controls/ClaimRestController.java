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

import tn.esprit.entities.Claim;
import tn.esprit.entities.Claims_Type;
import tn.esprit.services.ClaimService;

@RestController
public class ClaimRestController {

	// =======Oussema Mihoubi=======//

	@Autowired
	ClaimService claimService;

	// http://localhost:8083/SpringMVC/servlet/retrieve-all-claims
	@GetMapping("/retrieve-all-claims")
	@ResponseBody
	public List<Claim> getClaims() {
		List<Claim> list = claimService.retrieveAllClaims();
		return list;
	}

	// http://localhost:8083/SpringMVC/servlet/retrieve-claim/{claim-id}
	@GetMapping("/retrieve-claim/{claim-id}")
	@ResponseBody
	public Claim retrieveClaim(@PathVariable("claim-id") String claimId) {
		return claimService.retrieveClaim(claimId);
	}

	// http://localhost:8083/SpringMVC/servlet/add-claim
	@PostMapping("/add-claim")
	@ResponseBody
	public String addClaim(@RequestBody Claim cl) {
		return claimService.addClaim(cl);
	}

	// http://localhost:8083/SpringMVC/servlet/remove-claim/{claim-id}
	@DeleteMapping("/remove-claim/{claim-id}")
	@ResponseBody
	public void removeClaim(@PathVariable("claim-id") String claimId) {
		claimService.deleteClaim(claimId);
	}

	// http://localhost:8083/SpringMVC/servlet/modify-claim
	@PutMapping("/modify-claim")
	@ResponseBody
	public String modifyClaim(@RequestBody Claim claim) {
		return claimService.addClaim(claim);
	}

	// http://localhost:8083/SpringMVC/servlet/claims-nbr
	@GetMapping("/claims-nbr")
	@ResponseBody
	public String getNbrClaims() {
		return claimService.retrieveNbrClaims();
	}

	// http://localhost:8083/SpringMVC/servlet/claims-nbr-type/{Claim_Type}
	@GetMapping("/claims-nbr-type/{Claim_Type}")
	@ResponseBody
	public String getNbrClaimsByType(@PathVariable("Claim_Type") Claims_Type s) {
		return claimService.retrieveNbrClaimsByType(s);
	}

	// http://localhost:8083/SpringMVC/servlet/claims-status/{claim-type}
	@GetMapping("/claims-status/{claim-type}")
	@ResponseBody
	public List<Claim> getClaimsByType(@PathVariable("claim-type") Claims_Type s) {
		return claimService.retrieveClaimsByType(s);
	}

	// ============================//

}
