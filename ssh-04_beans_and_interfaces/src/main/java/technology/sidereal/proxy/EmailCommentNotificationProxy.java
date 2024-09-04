package technology.sidereal.proxy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import technology.sidereal.model.Comment;

@Component
@Primary
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment to email: " + comment);
    }
}
