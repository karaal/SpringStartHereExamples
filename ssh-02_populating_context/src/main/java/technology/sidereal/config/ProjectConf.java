package technology.sidereal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import technology.sidereal.beans.Car;
import technology.sidereal.beans.Vehicle;

@Configuration
public class ProjectConf {

    @Bean(name = "regular")
    @Primary
    Vehicle car() {
        var c = new Car();
        c.setBrand("VW");
        return c;
    }

    @Bean(name = "premium")
    Vehicle carPremium() {
        var c = new Car();
        c.setBrand("BMW");
        return c;
    }
}
