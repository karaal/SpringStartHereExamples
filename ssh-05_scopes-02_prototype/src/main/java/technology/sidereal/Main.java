package technology.sidereal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import technology.sidereal.config.ProjectConfig;
import technology.sidereal.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = c.getBean(CommentService.class);
        var cs2 = c.getBean(CommentService.class);

        System.out.println("cs1 == cs2: " + (cs1 == cs2));

        var cs3 = c.getBean(CommentService.class);
        var cr1 = cs3.getCommentRepository();
        var cs4 = c.getBean(CommentService.class);
        var cr2 = cs4.getCommentRepository();

        System.out.println("cr1 == cr2: " + (cr1 == cr2));
    }
}
