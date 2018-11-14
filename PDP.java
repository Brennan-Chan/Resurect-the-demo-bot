package org.usfirst.frc.team4206.robot.subsystems;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * this is basic don't mess with it
 */
public class PDP extends Subsystem {

	static PowerDistributionPanel PDP;
	
	public PDP() {
		PDP = new PowerDistributionPanel(0);
	}
	
	public double portCurrent(int port) {
		return PDP.getCurrent(port);
	}
	/**
	 *  this is for default auto if you want it just slap it in here
	 */
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

