/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4206.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//TALON SRX
	public int leftDriveMaster;
	public int leftDriveSlave;
	public int rightDriveMaster;
	public int rightDriveSlave;
	public int armMaster;
	public int armSlave;

	
	//PDP
	public int pdpleftDriveMaster;
	public int pdpleftDriveSlave;
	public int pdprightDriveMaster;
	public int pdprightDriveSlave;
	public int pdparmMaster;
	public int pdparmSlave;

	
	//MAGIC MOTION VARIABLES
	public double switchangle;
	public double scaleangle;
	public double exchangeangle;
	
	//CONTROLLERS
	public double driver;
	public double operator;
	
	public RobotMap() {
		
		//Talon SRX CAN ID's
		leftDriveMaster = 2;
		leftDriveSlave = 3;
		rightDriveMaster = 4;
		rightDriveSlave = 5;
		
		//PDP Power Slots
		pdpleftDriveMaster = 0;
		pdpleftDriveSlave = 1;
		pdprightDriveMaster = 2;
		pdprightDriveSlave = 3;
	
	
		//Magic Motion
		switchangle = -450;	//needs calibration
		scaleangle = 0;		//needs calibration
		exchangeangle = -1081;//needs calibration
		
		//Controllers
		driver = 1;
		operator = 1;
		
	}
	

			
}
