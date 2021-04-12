package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Satisfaction;

@Repository
public interface SatisfactionRepository extends CrudRepository<Satisfaction, Long> {

}
