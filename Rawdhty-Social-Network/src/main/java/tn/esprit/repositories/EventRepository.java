package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Event;
@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

}
