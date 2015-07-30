package org.usfirst.frc.team3641.robot.subsystems;


import org.usfirst.frc.team3641.robot.RobotMap;
import org.usfirst.frc.team3641.robot.commands.JoystickDriveCommand;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrainSubsystem extends Subsystem {
	private Talon leftDrive = new Talon(RobotMap.leftMotorChannel);
    private Talon rightDrive = new Talon(RobotMap.rightMotorChannel);
    
    private RobotDrive robotDrive = new RobotDrive(leftDrive, rightDrive);
    
    public void initDefaultCommand() {
        setDefaultCommand(new JoystickDriveCommand());
        
    }
    
    public void drive(double left, double right) {
        robotDrive.arcadeDrive(-left, -right);
    }  
    
}
