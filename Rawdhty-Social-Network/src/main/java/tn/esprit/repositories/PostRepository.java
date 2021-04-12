package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Post;


@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
	
	@Query("SELECT p FROM Post p WHERE p.user.id =:id ") 
	public List<Post> getPostByUserId(@Param("id") long id);
	
	@Query("SELECT p FROM Post p WHERE p.id IN (SELECT l.post.id FROM Likes l WHERE l.user.id =:id)")
	public List<Post> getPostsLikedByUser(@Param("id") long id);
	
	@Query("SELECT count(*) as nbr FROM Post")
	int getNombrePosts();
	
	
	
	

}
