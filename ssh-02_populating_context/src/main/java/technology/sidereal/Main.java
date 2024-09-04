package technology.sidereal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import technology.sidereal.beans.Vehicle;
import technology.sidereal.config.ProjectConf;
import technology.sidereal.pojo.Player;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConf.class);

        Vehicle regularCar = c.getBean(Vehicle.class);
        System.out.println(regularCar.getBrand());

        Vehicle premiumCar = c.getBean( "premium", Vehicle.class);
        System.out.println(premiumCar.getBrand());

        var p = new Player();
        p.setNpc(false);

        Supplier<Player> supplier = () -> p;

        c.registerBean("player", Player.class, supplier, bc -> bc.setPrimary(true));

        Player supplied = c.getBean(Player.class);
        System.out.println("NPC: " + supplied.isNpc());
    }
}