package technology.sidereal.proxy;

import technology.sidereal.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
