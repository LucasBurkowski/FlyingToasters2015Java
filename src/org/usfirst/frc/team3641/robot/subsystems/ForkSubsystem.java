package org.usfirst.frc.team3641.robot.subsystems;

import org.usfirst.frc.team3641.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ForkSubsystem extends Subsystem{

	private static DoubleSolenoid ForkSolenoid = new DoubleSolenoid(RobotMap.ForkChannel1, RobotMap.ForkChannel2);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub	
	}
	
	public void ForkClosed(){
    	ForkSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    public void ForkOpened(){
    	ForkSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
}
