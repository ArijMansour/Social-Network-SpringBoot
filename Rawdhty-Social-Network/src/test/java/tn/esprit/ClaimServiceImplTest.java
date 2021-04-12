package tn.esprit;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Claim;
import tn.esprit.entities.Claims_Type;
import tn.esprit.repositories.ClaimRepository;
import tn.esprit.services.ClaimServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClaimServiceImplTest {

	// =======Oussema Mihoubi=======//

	private static final Logger l = LogManager.getLogger(ClaimServiceImplTest.class);

	@Autowired
	ClaimServiceImpl cls;

	@Autowired
	ClaimRepository claimRepository;

	@Test
	public void testretrieveAllClaims() {
		cls.retrieveAllClaims();
	}

	@Test
	public void testAddClaim() throws java.text.ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("31-03-2021");
		Claim cl = new Claim("testClaimDesc3", date, "testClaimImg3", Claims_Type.Application);
		cls.addClaim(cl);

	}

	@Test
	public void testdeleteClaim() {
		cls.deleteClaim("1");
	}

	@Test
	public void testupdateClaim() {
		Claim cl = claimRepository.findById(Long.parseLong("1")).get();
		cl.setClaims_Description("New Description");
		cls.addClaim(cl);
	}

	@Test
	public void testretrieveClaim() {
		Claim cl = claimRepository.findById(Long.parseLong("1")).get();
		cls.retrieveClaim("1").getClass();
		System.out.println(cl);
	}

	// ============================//

}
