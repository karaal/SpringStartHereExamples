package technology.sidereal.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import technology.sidereal.model.Comment;
import technology.sidereal.repository.CommentRepository;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private Comment comment;
    private final CommentRepository commentRepository;

    @Autowired
    public CommentProcessor(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment() {
        comment.setCommentText(comment.getCommentText() + " (C) Sidereal");
    };

    public void saveComment() {
        commentRepository.saveComment(this.comment);
    }
}
