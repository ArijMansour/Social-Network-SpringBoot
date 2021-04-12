package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Profile;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {

}
