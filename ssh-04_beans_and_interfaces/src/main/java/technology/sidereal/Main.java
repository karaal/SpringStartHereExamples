package technology.sidereal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import technology.sidereal.config.ProjectConfig;
import technology.sidereal.model.Comment;
import technology.sidereal.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("Sidereal");
        comment.setText("Lorem ipsum dolor sit amet.");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}