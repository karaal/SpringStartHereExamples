package technology.sidereal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import technology.sidereal.processor.CommentProcessor;
import technology.sidereal.model.Comment;

@Service
public class CommentService {

    ApplicationContext c;

    @Autowired
    public CommentService(ApplicationContext c) {
        this.c = c;
        System.out.println("CommentService created");
    }

    public void saveComment(Comment comment) {
        var processor = c.getBean(CommentProcessor.class);

        processor.setComment(comment);
        processor.processComment();
        processor.saveComment();
    }
}
