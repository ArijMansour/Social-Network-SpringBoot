package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Note;
import tn.esprit.repositories.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	NoteRepository noteRepository;
	private static final Logger L = LogManager.getLogger(NoteServiceImpl.class);
	@Override
	public List<Note>retrieveAllNotes(){
		List<Note>Notes =(List<Note>)noteRepository.findAll();
		for(Note Note:Notes){
			L.info("Note+++"+ Note);}
		return Notes;
	}
@Override
public Note addNote(Note Note){
	return noteRepository.save(Note);
}
@Override
public Note updateNote(Note Note){
	return noteRepository.save(Note);
}
@Override
public Note retrieveNote(String note_Id){
	return noteRepository.findById(Long.parseLong(note_Id)).get();
}

@Override
public void deleteNote(String note_Id){
noteRepository.deleteById(Long.parseLong(note_Id));
}
	
	
	
	
}
