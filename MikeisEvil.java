package org.usfirst.frc.team4206.robot.commands;

import org.usfirst.frc.team4206.robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4206.robot.Robot;

public class MikeisEvil extends Command{
	private long time = 0;
	private double duration, pwr;
	private double D2; 
	
	public MikeisEvil(double length, double power) {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.DriveTrain);
        requires(Robot.Limelight);
       
        pwr = power;
        duration = length * 800;
        D2 = length * 800;
    
	}

    // Called just before this Command runs the first time
    protected void initialize() {
    	time = System.currentTimeMillis();
    	 this.setTimeout(6); 
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	if (System.currentTimeMillis() < time + duration) Robot.DriveTrain.ArcadeDrive(-.5,0 );
    	else if (System.currentTimeMillis() == time + duration) Robot.DriveTrain.ArcadeDrive(0, 0);
    	else if (System.currentTimeMillis() < time + duration + D2) Robot.DriveTrain.ArcadeDrive(.5,.5);
    	else if (System.currentTimeMillis() == time + duration + D2) Robot.DriveTrain.ArcadeDrive(0, 0);
    	System.out.println("debug 1");
    	
    		Robot.DriveTrain.ArcadeDrive(0, 0);
    

    	}
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	 //if (this.isTimedOut()) return true;
         return false;
        	
        }
    

    // Called once after isFinished returns true
    protected void end() {
   
    	Robot.DriveTrain.ArcadeDrive(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.DriveTrain.ArcadeDrive(0,0);
    }

}