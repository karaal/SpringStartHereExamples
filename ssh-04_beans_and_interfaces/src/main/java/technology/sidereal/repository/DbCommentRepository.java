package technology.sidereal.repository;

import org.springframework.stereotype.Repository;
import technology.sidereal.model.Comment;

@Repository
public class DbCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment);
    }
}
