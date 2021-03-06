/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4206.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//set up button map
	public static Joystick driver = new Joystick(0);

	public static Joystick autoController = new Joystick(1);
	
	static Button A = new JoystickButton(autoController, 1);
	static Button B = new JoystickButton(autoController, 2);
	static Button X = new JoystickButton(driver, 3);
	static Button Y = new JoystickButton(autoController, 4);
	static Button LB = new JoystickButton(driver, 5);
	static Button RB = new JoystickButton(driver, 6);
	static Button Start = new JoystickButton(driver, 7);
	static Button Select = new JoystickButton(driver, 8);
	

	

		
	public static int leftX = 0;
	public static int rightX = 4;
	public static int leftY = 1;
	public static int rightY = 5;


	public OI() {
		


	}	
}