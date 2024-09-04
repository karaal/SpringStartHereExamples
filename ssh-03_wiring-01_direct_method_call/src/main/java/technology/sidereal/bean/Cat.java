package technology.sidereal.bean;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private int lifes = 7;
    private String name = "Felix";

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat [lifes=" + lifes + ", name=" + name + "]";
    }
}
