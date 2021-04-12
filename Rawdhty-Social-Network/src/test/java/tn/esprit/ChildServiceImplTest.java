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

import tn.esprit.entities.Child;
import tn.esprit.repositories.ChildRepository;
import tn.esprit.services.ChildServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChildServiceImplTest {
	
	private static final Logger l = LogManager.getLogger(ChildServiceImplTest.class);
	
	@Autowired
	ChildServiceImpl cst;
	
	@Autowired
	ChildRepository cr;
	
	@Test
	public void testretrieveAllChildren() {
		cst.retrieveAllChildren();
	}
	
	@Test
	public void testAddChild() throws java.text.ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-04-01");
		Child c = new Child(Long.parseLong("1"),"Rached","Chakchouk",date,"Ariana");
		cst.addChild(c);
		
	}
	
	@Test
	public void testdeleteChild() {
		cst.deleteChild("1");
	}
	
	@Test
	public void testupdateChild() {
		Child c = cr.findById(Long.parseLong("1")).get();
		c.setChild_Adresse("Sfax");
		cst.addChild(c);
	}
	
	@Test
	public void testretrieveChild() {
		Child c = cr.findById(Long.parseLong("1")).get();
		cst.retrieveChild("1").getClass();
		System.out.println(c);
	}

}
