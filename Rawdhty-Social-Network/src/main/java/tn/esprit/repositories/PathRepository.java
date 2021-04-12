package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Path;
@Repository
public interface PathRepository extends CrudRepository<Path, Long> {

}
