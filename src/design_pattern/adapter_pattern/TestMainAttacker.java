package design_pattern.adapter_pattern;

/**
 * Created by Nianzu on 3/25/2015.
 */
public class TestMainAttacker {

    //the client here
    public static void main(String[] args) {

        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("------The Robot-------");
        fredTheRobot.reactToHuman("fred");
        fredTheRobot.smashWithHands();
        fredTheRobot.walkForward();
        System.out.println();

        System.out.println("------The Enemy Tank------");
        rx7Tank.assignDriver("Paul");
        rx7Tank.fireWeapon();
        rx7Tank.driveForward();
        System.out.println();

        // The client uses the adaptee without concerning about the specific method name
        // The client could use the same interface to use lots of other classes, as long as
        // the corresponding adapter is well written
        System.out.println("------Robot with Adapter-----");
        robotAdapter.assignDriver("fred");
        robotAdapter.fireWeapon();
        robotAdapter.driveForward();
    }
}
