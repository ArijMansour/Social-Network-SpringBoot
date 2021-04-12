package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Comment;

public interface CommentService {


	List<Comment> retrieveAllComments();
	Comment addComment(Comment ct);
	void deleteComment(String id);
	Comment retrieveComment(String id);

}
