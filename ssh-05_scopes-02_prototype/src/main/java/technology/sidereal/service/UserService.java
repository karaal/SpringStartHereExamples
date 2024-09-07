package technology.sidereal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import technology.sidereal.repository.CommentRepository;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserService {

    private final CommentRepository commentRepository;

    @Autowired
    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
        System.out.println("UserService created");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
