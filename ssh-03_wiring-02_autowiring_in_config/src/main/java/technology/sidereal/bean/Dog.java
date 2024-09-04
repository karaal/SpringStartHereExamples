package technology.sidereal.bean;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private final String name = "Barky";
    private boolean hasTail;

    @Override
    public String toString() {
        return "Dog [name=" + name + ", hasTail=" + hasTail + "]";
    }
}
