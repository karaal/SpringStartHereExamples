package technology.sidereal.repository;

import org.springframework.stereotype.Repository;
import technology.sidereal.model.Comment;

@Repository
public class CommentRepository {
    public CommentRepository() {
        System.out.println("CommentRepository created.");
    }

    public void saveComment(Comment comment) {
        System.out.println("Comment saved: " + comment.getCommentText());
    }
}
