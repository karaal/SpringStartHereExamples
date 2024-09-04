package technology.sidereal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import technology.sidereal.bean.Parrot;
import technology.sidereal.bean.Person;
import technology.sidereal.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = c.getBean(Parrot.class);
        Person person = c.getBean(Person.class);

        System.out.println("Parrot's name: " + parrot.getName());
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot: " + person.getParrot());
        System.out.println("Person's cat: " + person.getCat());
    }
}