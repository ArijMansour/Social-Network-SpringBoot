package tn.esprit;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Club;
import tn.esprit.entities.Club_Type;
import tn.esprit.repositories.ClubRepository;
import tn.esprit.services.ClubServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClubServiceImplTest {

	private static final Logger l = LogManager.getLogger(ClubServiceImplTest.class);
	
	@Autowired
	ClubServiceImpl cl;
	
	@Autowired
	ClubRepository clubRepository;
	
	@Test
	public void testretrieveAllClubs() {
		cl.retrieveAllClubs();
	}
	
	
	@Test
	public void testAddClub() throws java.text.ParseException {
		Club c = new Club(1, "club_Description", Club_Type.COMEDY);
		cl.addClub(c);
		
	}
	
	@Test
	public void testdeleteClub() {
		cl.deleteClub("2");
	}
	
	@Test
	public void testupdateClub() {
		Club c = clubRepository.findById(Long.parseLong("3")).get();
		c.setClub_Description("modification du description");
		cl.addClub(c);
	}
	
	@Test
	public void testretrieveClub() {
		Club c = clubRepository.findById(Long.parseLong("1")).get();
		cl.retrieveClub("1").getClass();
		System.out.println(c);
	}
}
