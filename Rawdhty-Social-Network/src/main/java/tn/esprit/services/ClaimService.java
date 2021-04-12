package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Claim;
import tn.esprit.entities.Claims_Type;

public interface ClaimService {

	// =======Oussema Mihoubi=======//

	List<Claim> retrieveAllClaims();

	String addClaim(Claim cl);

	void deleteClaim(String id);

	Claim retrieveClaim(String id);

	String retrieveNbrClaims();
	
	String retrieveNbrClaimsByType(Claims_Type s);

	List<Claim> retrieveClaimsByType(Claims_Type s);

	// ============================//

}
