package technology.sidereal.bean;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    int lifes = 7;

    @Override
    public String toString() {
        return "Cat [lifes=" + lifes + "]";
    }
}
