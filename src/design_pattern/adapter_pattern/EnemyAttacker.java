package design_pattern.adapter_pattern;

/**
 * Created by Nianzu on 3/25/2015.
 */
public interface EnemyAttacker {

    public void fireWeapon();
    public void driveForward();
    public void assignDriver(String driverName);
}
