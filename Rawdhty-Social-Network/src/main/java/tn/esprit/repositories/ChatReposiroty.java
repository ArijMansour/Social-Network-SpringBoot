package tn.esprit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.entities.Chat;




public interface  ChatReposiroty extends CrudRepository<Chat, Long> {
	@Query(value = "SELECT * FROM T_Chat t WHERE Chat_nbrequest=?1", nativeQuery = true)
    public List<Chat> getAllChat_by_Order(int idChat);
	long  count();
	
	
}
