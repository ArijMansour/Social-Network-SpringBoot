package tn.esprit.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Note;
import tn.esprit.services.NoteService;

@RestController

public class NoteRestController {
	
	@Autowired
	NoteService ns;
	// http://localhost:8083/SpringMVC/servlet/retrieve-all-Notes
		@GetMapping("/retrieve-all-Notes")
		@ResponseBody
			public List<Note>getNotes(){
			List<Note> list = ns.retrieveAllNotes();
			return list;
		}
		// http://localhost:8083/SpringMVC/servlet/retrieve-Note/{Note-id}
		@GetMapping("/retrieve-Note/{Note-id}")
		@ResponseBody
		public Note retrieveNote(@PathVariable("Note-id") String NoteId) {
		return ns.retrieveNote(NoteId);
		}

		// http://localhost:8083/SpringMVC/servlet/add-Note
		@PostMapping("/add-Note")
		@ResponseBody
		public Note addNote(@RequestBody Note n) {
		Note Note1 = ns.addNote(n);
		return Note1;
		}
		
		// http://localhost:8083/SpringMVC/servlet/remove-Note/{Note-id}
		@DeleteMapping("/remove-Note/{Note-id}")
		@ResponseBody
		public void removeNote(@PathVariable("Note-id") String NoteId) {
		ns.deleteNote(NoteId);
		}

		// http://localhost:8083/SpringMVC/servlet/modify-Note
		@PutMapping("/modify-Note")
		@ResponseBody
		public Note modifyNote(@RequestBody Note Note) {
		return ns.addNote(Note);
		}

}
