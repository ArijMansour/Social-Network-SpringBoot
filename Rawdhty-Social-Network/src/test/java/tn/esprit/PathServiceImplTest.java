package tn.esprit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Path;
import tn.esprit.entities.Path_From;
import tn.esprit.entities.Path_To;
import tn.esprit.repositories.PathRepository;
import tn.esprit.services.PathServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest

public class PathServiceImplTest {
	private static final Logger l = LogManager.getLogger(PathServiceImplTest.class);
	@Autowired
	PathServiceImpl pst;
	@Autowired
	PathRepository pr;
	
	@Test
	public void testretrieveAllPaths(){
		pst.retrieveAllPaths();
	}
	@Test
	public void testretaddPath()throws java.text.ParseException {
		Path p = new Path(Long.parseLong("1"), "b123", 35, Path_From.ADRESSE_CHILD, Path_To.KINDERGARDEN);
		pst.addPath(p);
		
	}
	@Test
	public void testdeletePath(){
		pst.deletePath("1");
	}
	
	@Test
	public void testupdatePath(){
		Path p = pr.findById(Long.parseLong("1")).get();
		p.setItinarary_Place_Number(32);
		pst.addPath(p);
	}
	
	@Test
	public void testretrivePath(){
		Path p = pr.findById(Long.parseLong("1")).get();
		pst.retrievePath("1").getClass();
		System.out.println(p);
	}
	
}
