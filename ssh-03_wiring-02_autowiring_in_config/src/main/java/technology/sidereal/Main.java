package technology.sidereal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import technology.sidereal.bean.Parrot;
import technology.sidereal.bean.Person;
import technology.sidereal.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var person = c.getBean(Person.class);

        System.out.println(person.getName());
        System.out.println(person.getParrot());
        System.out.println(person.getCat());
        System.out.println(person.getDog());
    }
}