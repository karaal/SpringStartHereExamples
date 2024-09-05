package technology.sidereal.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class UserService {
    public UserService() {
        System.out.println("UserService: instantiated.");
    }
}
