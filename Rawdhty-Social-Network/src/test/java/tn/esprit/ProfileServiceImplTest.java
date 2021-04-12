package tn.esprit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Profile;
import tn.esprit.repositories.ProfileRepository;
import tn.esprit.services.ProfileServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfileServiceImplTest {

	private static final Logger l = LogManager.getLogger(ProfileServiceImplTest.class);


	@Autowired
	ProfileServiceImpl ps;
	
	@Autowired
	ProfileRepository profileRepository;
	
	@Test
	public void testretrieveAllProfiles() {
		ps.retrieveAllProfiles();
	}	
	@Test
	public void testAddProfile() throws java.text.ParseException {
		Profile p = new Profile(Long.parseLong("3"),"k","je");
		ps.addProfile(p);
		
	}
	
	@Test
	public void testdeleteProfile() {
		ps.deleteProfile("2");
	}
	
	@Test
	public void testupdateProfile() {
		Profile p = profileRepository.findById(Long.parseLong("2")).get();
		p.setBio("modification de bio");
		ps.addProfile(p);
	}
	
	@Test
	public void testretrieveProfile() {
		Profile p = profileRepository.findById(Long.parseLong("1")).get();
		ps.retrieveProfile("1").getClass();
		System.out.println(p);
	}

}
