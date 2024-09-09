package technology.sidereal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {
        "technology.sidereal.service",
        "technology.sidereal.aspect"
})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
