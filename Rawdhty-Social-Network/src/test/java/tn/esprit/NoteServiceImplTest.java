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

import tn.esprit.entities.Child;
import tn.esprit.entities.Note;
import tn.esprit.entities.Note_Subject;
import tn.esprit.entities.Note_Type;
import tn.esprit.repositories.NoteRepository;
import tn.esprit.services.NoteServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoteServiceImplTest {
	private static final Logger l = LogManager.getLogger(NoteServiceImplTest.class);
	@Autowired
	NoteServiceImpl nst;
	@Autowired
	NoteRepository nr;
	
	
	@Test
	public void testretriveallnotes(){
		nst.retrieveAllNotes();
	}
	@Test
	public void testaddnote() throws java.text.ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-04-01");
		Note n = new Note(Long.parseLong("1"), date, "test123",Note_Subject.PSYCHOLOGY,Note_Type.OTHER);
		nst.addNote(n);
	}
	@Test
	public void testdeleteNote(){
		nst.deleteNote("1");
	}
	@Test
	public void testupdateNote(){
		Note n = nr.findById(Long.parseLong("1")).get();
		n.setNote_Description("test321");
		nst.addNote(n);
		}
	@Test
	public void testretriveNote(){
		Note n = nr.findById(Long.parseLong("1")).get();
		nst.retrieveNote("1").getClass();
		System.out.println(n);
	}
		

}
