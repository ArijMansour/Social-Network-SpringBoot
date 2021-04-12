package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Likes;

@Repository
public interface LikesRepository extends CrudRepository<Likes, Long> {
	
	
	
	@Query("SELECT l FROM Likes l WHERE l.user.id =:id ")
	public List<Likes> getLikesByUserId(@Param("id") long id);
	
	
	@Query("SELECT l FROM Likes l WHERE l.post.id =:id")
	public List<Likes> getLikesByPostId(@Param("id") long id);
	
	
	@Query("SELECT count(l) FROM Likes l where l.user.id =:iduser and l.post.id =:idpost")
	public int isLikeExists(@Param("iduser") long iduser, @Param("idpost") long idp);

}
