package tn.esprit.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Comment;
import tn.esprit.repositories.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	@Qualifier("commentRepository")
	CommentRepository commentRepository;
	@Autowired
	
	private static final Logger L = LogManager.getLogger(CommentServiceImpl.class);
	
	@Override
	public List<Comment> retrieveAllComments() {
		List<Comment> comments = (List<Comment>) commentRepository.findAll();
		for (Comment comment : comments) {
			L.info("comment +++ : " + comment);
		}
		return comments;
	}

	@Override
	public Comment addComment(Comment cm) {
		System.out.println("Comment Added Successfully");
		return commentRepository.save(cm);
	}

	@Override
	public void deleteComment(String id) {
		commentRepository.deleteById(Long.parseLong(id));
		System.out.println("Comment Deleted Successfully");
		
	}


	@Override
	public Comment retrieveComment(String id) {
		return commentRepository.findById(Long.parseLong(id)).get();
	}
	
	
}
