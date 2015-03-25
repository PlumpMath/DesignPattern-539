package design_pattern.adapter_pattern;
import java.util.Random;

/**
 * Created by Nianzu on 3/25/2015.
 * The adaptee class
 */
public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands(){
        int damage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robots Causes " + damage + " Damages with Its Hands.");
    }

    public void walkForward(){
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robots Walks Forward " + movement + " spaces.");
    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy Robots tramps on " + driverName);
    }
}
