package technology.sidereal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import technology.sidereal.repository.CommentRepository;

@Configuration
@ComponentScan(basePackages = "technology.sidereal.service")
public class ProjectConfig {
    @Bean
    CommentRepository commentRepository() {
        return new CommentRepository();
    }
}
