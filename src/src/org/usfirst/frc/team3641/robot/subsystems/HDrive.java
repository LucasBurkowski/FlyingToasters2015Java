package org.usfirst.frc.team3641.robot.subsystems;

import org.usfirst.frc.team3641.robot.RobotMap;
import org.usfirst.frc.team3641.robot.commands.HDriveCommand;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HDrive extends Subsystem{
	private Talon H = new Talon(RobotMap.HDriveMotor);
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new HDriveCommand());		
	}
	
	public void setDrive(double stick){
		H.set(stick);
	}
}
