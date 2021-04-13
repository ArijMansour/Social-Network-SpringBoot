package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Note;



@Repository
public interface NoteRepository extends CrudRepository<Note,Long>{

}
