package technology.sidereal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import technology.sidereal.bean.Person;
import technology.sidereal.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var p = context.getBean(Person.class);

        System.out.println(p.getName());
        System.out.println(p.getParrot());
    }
}