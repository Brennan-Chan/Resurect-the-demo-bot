/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4206.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4206.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class Limelightcomand2 extends Command {
	private static final double kP = 0.0025;
	private double offsetX;
	public Limelightcomand2() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.DriveTrain);
        requires(Robot.Limelight);
	}

    // Called just before this Command runs the first time
    protected void initialize() {
    	offsetX = Robot.Limelight.getTargetOffsetX();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println(Robot.Limelight.getTargetOffsetX());
    	if (Robot.Limelight.hasValidTarget() == 1) {
    		offsetX = Robot.Limelight.getTargetOffsetX();
    		System.out.println("Chasing!");
    		Robot.DriveTrain.ArcadeDrive(- .5, (offsetX * kP)*(offsetX * kP));
    	} else { 
    		Robot.DriveTrain.ArcadeDrive(-.2, (Math.signum(offsetX) * 0.5)*(Math.signum(offsetX) * 0.5)); // If the target leaves our FOV or becomes undetected, 
    					  // the robot will continue turning in the last direction 
    					  // it was moving at a reduced speed, "intelligently" hunting for the target
    		System.out.println("Hunting!");
    		//System.out.println();
    	
    	
    	
    }
    	Robot.DriveTrain.ArcadeDrive(-.5, offsetX * kP);
    	System.out.println(offsetX * kP + ", " + Robot.Limelight.getTargetOffsetX());
    	Timer.delay(0.005);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (offsetX < .05 & offsetX > -.05 & Robot.Limelight.hasValidTarget()==1) {
        	System.out.println("Natural ending");
        	return true;
        }
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println(Robot.Limelight.getTargetOffsetX());
    	Robot.DriveTrain.ArcadeDrive(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	System.out.println(Robot.Limelight.getTargetOffsetX());
    	Robot.DriveTrain.ArcadeDrive(0,0);
    }

}
