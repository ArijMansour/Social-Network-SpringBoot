package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Claim;
import tn.esprit.entities.Claims_Type;
import tn.esprit.repositories.ClaimRepository;

@Service
public class ClaimServiceImpl implements ClaimService {

	// =======Oussema Mihoubi=======//

	private static final Logger L = LogManager.getLogger(ClaimServiceImpl.class);

	@Autowired
	ClaimRepository claimRepository;

	@Override
	public List<Claim> retrieveAllClaims() {
		List<Claim> claims = (List<Claim>) claimRepository.findAll();
		for (Claim claim : claims) {
			L.info("claim +++ : " + claim);
		}
		return claims;
	}

	@Override
	public String addClaim(Claim cl) {
		claimRepository.save(cl);
		return "Claim Added Successfully";
	}

	@Override
	public void deleteClaim(String id) {
		claimRepository.deleteById(Long.parseLong(id));

	}

	@Override
	public Claim retrieveClaim(String id) {
		return claimRepository.findById(Long.parseLong(id)).get();
	}

	@Override
	public String retrieveNbrClaims() {
		Long nbClaims = Long.valueOf(claimRepository.getClaimsNumber());
		if (nbClaims > 1) {
			return "The number of claims is: " + nbClaims + " Claims";
		} else
			return "The number of claims is: " + nbClaims + " Claim";
	}

	@Override
	public String retrieveNbrClaimsByType(Claims_Type s) {
		Long nbClaims = Long.valueOf(claimRepository.getClaimsNumberByType(s));
		if (nbClaims > 1) {
			return "The number of claims is: " + nbClaims + " " + s + " Claims";
		} else
			return "The number of claims is: " + nbClaims + " " + s + " Claim";
	}

	@Override
	public List<Claim> retrieveClaimsByType(Claims_Type s) {

		return claimRepository.getClaimsByType(s);
	}

	// ============================//

}
