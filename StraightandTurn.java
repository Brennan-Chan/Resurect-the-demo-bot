package org.usfirst.frc.team4206.robot.commands.CommandClass;

import org.usfirst.frc.team4206.robot.commands.Limelightcomand2;
import org.usfirst.frc.team4206.robot.commands.MikeisEvil;
import org.usfirst.frc.team4206.robot.commands.TimedDrive;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class StraightandTurn extends CommandGroup{
	
	public StraightandTurn() {
		addSequential(new TimedDrive(2,.5));
		addSequential(new MikeisEvil(1,  0.5));
		addSequential(new Limelightcomand2());
		
		
	}
}
