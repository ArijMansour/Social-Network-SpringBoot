package tn.esprit.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Comment;
import tn.esprit.services.CommentService;





@RestController
public class CommentRestController {


	@Autowired
	private CommentService commentService;

	// http://localhost:8083/SpringMVC/servlet/retrieve-all-comments
	@GetMapping("/retrieve-all-comments")
	@ResponseBody
	public List<Comment> getComments() {
		List<Comment> list = commentService.retrieveAllComments();
		return list;
	}

	// http://localhost:8083/SpringMVC/servlet/retrieve-comment/{comment-id}
	@GetMapping("/retrieve-comment/{comment-id}")
	@ResponseBody
	public Comment retrieveComment(@PathVariable("comment-id") String commentId) {
		return commentService.retrieveComment(commentId);
	}

	// http://localhost:8083/SpringMVC/servlet/add-comment
	@PostMapping("/add-comment")
	@ResponseBody
	public Comment addComment(@RequestBody Comment cm) {
		Comment comment = commentService.addComment(cm);
		return comment;
	}

	// http://localhost:8083/SpringMVC/servlet/remove-comment/{comment-id}
	@DeleteMapping("/remove-comment/{comment-id}")
	@ResponseBody
	public String removeComment(@PathVariable("comment-id") String commentId) {
		String a="vous avez supprimer le commentaire de l'id: ";
		commentService.deleteComment(commentId);
		return (a+commentId);
	}

	// http://localhost:8083/SpringMVC/servlet/modify-comment
	@PutMapping("/modify-comment")
	@ResponseBody
	public Comment modifyComment(@RequestBody Comment comment) {
		return commentService.addComment(comment);
	}



	


}
