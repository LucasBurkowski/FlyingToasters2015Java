package org.usfirst.frc.team3641.robot.subsystems;

import org.usfirst.frc.team3641.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ContainerHolderSubsystem extends Subsystem{

	private static DoubleSolenoid ContainerHolder = new DoubleSolenoid(RobotMap.ContainerGrabberChannel1, RobotMap.ContainerGrabberChannel2);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub	
	}
	
	public void ClawClosed(){
    	ContainerHolder.set(DoubleSolenoid.Value.kForward);
    }
    public void ClawOpened(){
    	ContainerHolder.set(DoubleSolenoid.Value.kReverse);
    }
    
}
