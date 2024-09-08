package technology.sidereal.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import technology.sidereal.repository.CommentRepository;

@Configuration
@ComponentScan(basePackages = {
        "technology.sidereal.repository",
        "technology.sidereal.service",
        "technology.sidereal.processor"
})
public class ProjectConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    CommentRepository commentRepository() {
        return new CommentRepository();
    }
}
