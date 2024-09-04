package technology.sidereal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"technology.sidereal.proxy", "technology.sidereal.repository", "technology.sidereal.service"}
)
public class ProjectConfig {
}
