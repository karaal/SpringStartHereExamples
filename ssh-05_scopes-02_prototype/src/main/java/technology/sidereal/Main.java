package technology.sidereal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import technology.sidereal.config.ProjectConfig;
import technology.sidereal.model.Comment;
import technology.sidereal.service.CommentService;
import technology.sidereal.service.UserService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Requesting a prototype-scoped bean
        var us1 = c.getBean(UserService.class);
        var us2 = c.getBean(UserService.class);

        System.out.println("us1 == us2: " + (us1 == us2));

        //Prototype-scoped bean use case:
        //  singleton CommentService on every call of saveComment()
        //  creates a prototype-scoped bean
        var cs1 = c.getBean(CommentService.class);
        cs1.saveComment(new Comment("Lorem ipsum."));
    }
}
