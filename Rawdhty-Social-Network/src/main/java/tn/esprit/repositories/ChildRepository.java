package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Child;

@Repository
public interface ChildRepository extends CrudRepository<Child, Long> {

}
