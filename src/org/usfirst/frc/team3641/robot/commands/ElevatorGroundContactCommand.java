package org.usfirst.frc.team3641.robot.commands;

import org.usfirst.frc.team3641.robot.Robot;
import org.usfirst.frc.team3641.robot.RobotMap;
import org.usfirst.frc.team3641.robot.PID.PID;

import edu.wpi.first.wpilibj.command.Command;

public class ElevatorGroundContactCommand extends Command{
	public ElevatorGroundContactCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.Elevator);
        requires(Robot.Forks);
    }

	// Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double divider = 7.0;
    	Robot.Elevator.setDrive((PID.P(RobotMap.LowerLimitSetPoint, Robot.Elevator.getPot()))/divider);
    	if (Robot.Elevator.getPot() >= RobotMap.ToteContatctSetPoint){
    		Robot.Forks.ForkOpened();
    	}
    	if (Robot.Elevator.LimitSwitch() == true){
    		Robot.Forks.ForkClosed();
    	}
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
    	Robot.Forks.ForkClosed();
    	Robot.Elevator.setDrive(0);
    }
}
