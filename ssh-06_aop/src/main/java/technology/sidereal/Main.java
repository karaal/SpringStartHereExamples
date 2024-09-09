package technology.sidereal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import technology.sidereal.config.ProjectConfig;
import technology.sidereal.model.Comment;
import technology.sidereal.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setText("This is a comment");
        comment.setAuthor("Sleeping dog");

        var commentService = c.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}