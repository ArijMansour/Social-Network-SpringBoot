package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.entities.Claim;
import tn.esprit.entities.Claims_Type;

public interface ClaimRepository extends CrudRepository<Claim, Long> {

	// =======Oussema Mihoubi=======//

	@Query("SELECT count(*) as nbClaims FROM Claim")
	int getClaimsNumber();

	@Query("SELECT count(*) as nbClaim FROM Claim c WHERE c.cl_Type = :cl_Type")
	int getClaimsNumberByType(@Param("cl_Type") Claims_Type s);

	@Query("SELECT c FROM Claim c WHERE c.cl_Type = :cl_Type")
	List<Claim> getClaimsByType(@Param("cl_Type") Claims_Type s);

	// ============================//

}
