package technology.sidereal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import technology.sidereal.config.ProjectConfig;
import technology.sidereal.repository.CommentRepository;
import technology.sidereal.service.CommentService;
import technology.sidereal.service.UserService;

public class Main {
    public static void main(String[] args) {
        //Example: Eager and lazy instatiations of singleton beans
        //Creating context instantiate eager singletons
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //Lazy singletons are not instantiated until refered to
        var userService = context.getBean(UserService.class);

        //Example: Singleton bean scope with @Bean
        var r1 = context.getBean(CommentRepository.class);
        var r2 = context.getBean(CommentRepository.class);
        System.out.println("r1 and r2 are the same object: "  + (r1 == r2));

        //Example: Singleton bean scope with @Component
        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(CommentService.class);
        System.out.println("s1 and s2 are the same object: "  + (s1 == s2));

    }
}