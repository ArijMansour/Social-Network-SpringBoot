package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Club;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
	
}
