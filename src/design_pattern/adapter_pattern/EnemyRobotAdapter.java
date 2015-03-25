package design_pattern.adapter_pattern;

/**
 * Created by Nianzu on 3/25/2015.
 * The adapter for client to use the adaptee
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot;  //use composition concept here

    public EnemyRobotAdapter (EnemyRobot newRobot){
        this.enemyRobot = newRobot;
    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        enemyRobot.reactToHuman(driverName);
    }
}
