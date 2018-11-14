package org.usfirst.frc.team4206.robot.subsystems;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance; 
/**
 * This class is the subsystem controlling the Limelight vision processor and camera
 */

/**
 * @author Driver Station, it is very important that we have @SuppressWarnings("deprecation") or else we 
 * will have syntax issues and it be very difficult to resolve
 */
@SuppressWarnings("deprecation")

public class Limelight extends Subsystem {
	
	edu.wpi.first.networktables.NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
	NetworkTableEntry tx = table.getEntry("tx");
	NetworkTableEntry ty = table.getEntry("ty");
	NetworkTableEntry ta = table.getEntry("ta");
	double x = tx.getDouble(0);
	double y = ty.getDouble(0);
	double area = ta.getDouble(0);


	NetworkTable table1;
	double targetOffsetAngle_Horizontal;
	double targetOffsetAngle_Vertical;
	double targetArea;
	double targetSkew;
	double targetValidity;
	
    public Limelight() {
    }		

    public double getTargetOffsetX() {
    	NetworkTable table = NetworkTable.getTable("limelight");
    	return table.getNumber("tx", 0);
    }
    
    public double getTargetOffsetY() {
    	NetworkTable table = NetworkTable.getTable("limelight");
    	return table.getNumber("ty", 0);
    }
    
    public double getTargetArea() {
    	NetworkTable table = NetworkTable.getTable("limelight");
    	return table.getNumber("ta", 0);
    }
    
    public double hasValidTarget() {
    	NetworkTable table = NetworkTable.getTable("limelight");
    	return table.getNumber("tv", 0);
    }
    
    /**
     * Sets the camera mode of the Limelight.
     * 
     * @param mode : true is vision, false is driver cam
     */
    public void setMode(boolean mode) {
    	NetworkTable table = NetworkTable.getTable("limelight");
    	table.putNumber("camMode", mode ? 0 : 1);
    }
    
    /**
     * Sets the LED mode of the Limelight.
     * 
     * @param mode : 0 is on, 1 is off, 2 is blinking
     */
    public void setLEDMode(int mode) {
    	NetworkTable table = NetworkTable.getTable("limelight");
    	table.putNumber("ledMode", mode);
    }
    
    public void initDefaultCommand() {
    }

	public String requestDiagnostic() {
		System.out.println("\n----STARTING LIMELIGHT DIAGNOSTIC----\n\n");
		System.out.println("Limelight will blink LEDs for 3 seconds, use the web interface to confirm functionality.\n");
		setLEDMode(2);
		Timer.delay(3);
		setLEDMode(0);
		
		return "";
	}
}

