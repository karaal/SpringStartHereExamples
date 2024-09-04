package technology.sidereal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import technology.sidereal.bean.Parrot;

@Configuration
@ComponentScan(basePackages = "technology.sidereal.bean")
public class ProjectConfig {

    @Bean("parrot")
    public Parrot parrot1() {
        var p = new Parrot();
        p.setName("Helio");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        var p = new Parrot();
        p.setName("Murro");
        return p;
    }

    @Bean
    @Primary
    public Parrot parrot3() {
        var p = new Parrot();
        p.setName("Jaq");
        return p;
    }

}
