package technology.sidereal.proxy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import technology.sidereal.model.Comment;

@Component
@Qualifier("PUSH")
public class PushCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment through push notification: " + comment);
    }
}
