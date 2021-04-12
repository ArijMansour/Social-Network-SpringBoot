package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Forum;


@Repository
public interface ForumRepository extends CrudRepository<Forum, Long> {

}
