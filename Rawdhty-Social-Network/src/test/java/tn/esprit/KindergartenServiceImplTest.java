package tn.esprit;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Kindergarten;
import tn.esprit.repositories.KindergartenRepository;
import tn.esprit.services.KindergartenServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KindergartenServiceImplTest {

	private static final Logger l = LogManager.getLogger(KindergartenServiceImplTest.class);
	 @Autowired
	 KindergartenServiceImpl kst;
	 @Autowired
	 KindergartenRepository kr;
	
	 @Test
	 public void testretrieveAllKindergarten(){
		 kst.retrieveAllKindergartens();
	 }
	 
	 @Test
	 public void testAddKindergarten() throws java.text.ParseException{
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = dateFormat.parse("2021-04-01");
			Kindergarten k = new Kindergarten(Long.parseLong("25"),"kinderone","sousse",Long.parseLong("251819"),"1527sbd5685",date,"jknùnnù@jbm.fn");
			kst.addkindergarten(k);
	 }
	 @Test
	 public void testdeleteKindergarten(){
		 kst.deleteKindergarten("25");
	 }
	 @Test 
	 public void testupdateKindergarten(){
		 Kindergarten k = kr.findById(Long.parseLong("25")).get();
		 k.setKindergarden_adresse("beja");
		 kst.addkindergarten(k);
	 }
	 @Test 
	 public void testretriveKindergarten(){
		 Kindergarten k = kr.findById(Long.parseLong("25")).get();
		 kst.retrievekindergarten("25").getClass();
		 System.out.println(k);
	 }
}
