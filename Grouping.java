package org.usfirst.frc.team4206.robot.commands.CommandClass;

import org.usfirst.frc.team4206.robot.commands.Limelightcomand2;
import org.usfirst.frc.team4206.robot.commands.MikeisEvil;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Grouping extends CommandGroup {
	
	public Grouping() {
	addSequential(new MikeisEvil(4, 3));
	addSequential(new Limelightcomand2());
	
	}
}

