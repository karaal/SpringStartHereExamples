package technology.sidereal.repository;

import technology.sidereal.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
