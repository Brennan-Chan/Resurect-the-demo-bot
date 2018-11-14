/*----------------------------------------------------------------------------*/
 /* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team4206.robot;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;


import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.RobotBase.main;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4206.robot.commands.ExampleCommand;
import org.usfirst.frc.team4206.robot.commands.Limelightcomand2;
import org.usfirst.frc.team4206.robot.commands.CommandClass.Grouping;
import org.usfirst.frc.team4206.robot.commands.CommandClass.StraightandTurn;
import org.usfirst.frc.team4206.robot.commands.MikeisEvil;
import org.usfirst.frc.team4206.robot.commands.TimedDrive;
import org.usfirst.frc.team4206.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team4206.robot.subsystems.PDP;
import org.usfirst.frc.team4206.robot.subsystems.Limelight; 
import org.usfirst.frc.team4206.robot.subsystems.DriveTrain;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
	@SuppressWarnings("unused")
	public class Robot extends TimedRobot {
	public static final RobotMap rm = new RobotMap();	

	public static final PDP pdp = new PDP();
	public static final ExampleSubsystem kExampleSubsystem = new ExampleSubsystem();
	public static final DriveTrain DriveTrain = new DriveTrain();
	public static final Limelight Limelight = new Limelight();
	
	Command Limelightcomand2;
	Command TimedDrive;
	Command MikeisEvil;
	CommandGroup Grouping;
	CommandGroup StraightandTurn;
	public TimedDrive timedDrive = new TimedDrive(2,1);
	public Limelightcomand2 limelightComand2 = new Limelightcomand2();
	public MikeisEvil mikeisevil = new MikeisEvil(1,1);
	public StraightandTurn straightandturn = new StraightandTurn();
	public Grouping grouping = new Grouping();
	@SuppressWarnings("rawtypes")
	SendableChooser autoChooser;

	
	
	
	public static final OI oi = new OI();	

		//public static final 
/**
 * the SuppressWarnings just cover up the orange; me no like orange 
 */
	//@SuppressWarnings({ "unchecked", "rawtypes", })
	public void robotInit() {
		
	
	}

	
	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	
	public void disabledInit() {

	}

	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */

	
	public void autonomousInit() {
		//autonomousCommand = chooser.getSelected(); 
		//Limelightcomand2 = (Command) autoChooser.getSelected();
	
		if (OI.autoController.getRawButton(4)){ 
			  limelightComand2.start();
		} else if  (OI.autoController.getRawButton(1)) {
		     timedDrive.start();
		} else if (OI.autoController.getRawButton(2)) {
		     mikeisevil.start();
		} else if (OI.autoController.getRawButton(3)) {
			 straightandturn.start();	
		} else if (OI.autoController.getRawButton(5)) {
			 grouping.start();
		} else  {
		    //Command Limelightcomand2 ;
			 limelightComand2.start();
		}	
		
	}
	/**
	 * This function is called periodically during autonomous.
	 */
	
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.

		}
	
	/**
	 * This function is called periodically during operator control.
	 */
	
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */

	public void testPeriodic() {
	
	}
}
