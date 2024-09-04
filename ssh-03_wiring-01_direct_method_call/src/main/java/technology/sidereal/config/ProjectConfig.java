package technology.sidereal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import technology.sidereal.bean.Cat;
import technology.sidereal.bean.Parrot;
import technology.sidereal.bean.Person;

@Configuration
@ComponentScan(basePackages = "technology.sidereal.bean")
public class ProjectConfig {

    @Bean
    public Person person(Cat cat) {
        var person = new Person();
        person.setName("Mike");
        person.setParrot(parrot());
        person.setCat(cat);
        return person;
    }

    @Bean
    public Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("Yobaba");
        return parrot;
    }
}
