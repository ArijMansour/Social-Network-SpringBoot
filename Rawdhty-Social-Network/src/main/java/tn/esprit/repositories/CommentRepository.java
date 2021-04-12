package tn.esprit.repositories;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Club;
import tn.esprit.entities.Comment;
import tn.esprit.entities.User;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	
	
	
	
}
