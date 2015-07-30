package org.usfirst.frc.team3641.robot.commands;

import org.usfirst.frc.team3641.robot.Robot;
import org.usfirst.frc.team3641.robot.RobotMap;
import org.usfirst.frc.team3641.robot.PID.PID;

import edu.wpi.first.wpilibj.command.Command;

public class ElevatorGroundContactCommand extends Command{
	public ElevatorGroundContactCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.Elevator);
    }

	// Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Elevator.setDrive(PID.P(RobotMap.ToteContatctSetPoint, Robot.Elevator.getPot()));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}
