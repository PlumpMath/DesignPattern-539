package design_pattern.adapter_pattern;
import java.util.Random;

/**
 * Created by Nianzu on 3/25/2015.
 * EnemyTank is a concrete class implement EnemyAttacker interface
 */
public class EnemyTank implements EnemyAttacker {

    Random generator = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tanks Does " + attackDamage + " Damage.");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tanks moves " + movement + " spaces.");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank.");
    }
}
