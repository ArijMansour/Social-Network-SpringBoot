package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Note;

public interface NoteService {
	
	List<Note> retrieveAllNotes();
	Note addNote(Note Note);
	Note updateNote(Note Note);
	Note retrieveNote(String note_Id);
	void deleteNote(String note_Id);

}
