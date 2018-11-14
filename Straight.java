/*package org.usfirst.frc.team4206.robot.commands;

import org.usfirst.frc.team4206.robot.Robot;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Straight extends Command {
	
	public Straight () {
		requires(Robot.DriveTrain);
	}
	 String plateConfig = "";
	    long startTime = 0;
	    boolean complete = false;
	    
	    // Called just before this Command runs the first time
	    protected void initialize() {
	    	plateConfig = DriverStation.getInstance().getGameSpecificMessage();
	    	startTime = System.currentTimeMillis();
	    	this.setTimeout(6);
	}
	    protected void execute() {
	    	if (plateConfig.charAt(0) == 'L') {
	    		// do left switch
	    		if (System.currentTimeMillis() < startTime + 2000) {
	    			//Robot.drivetrain.velocityDrive(.5, (-35-Robot.navx.getGyro())/35); // try this in position mode
	    			} 
	    		}
	    	else new TimedDrive(3, .5);
    	Timer.delay(0.005);

    }

}
**/