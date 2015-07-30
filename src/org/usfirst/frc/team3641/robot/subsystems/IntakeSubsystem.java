package org.usfirst.frc.team3641.robot.subsystems;

import org.usfirst.frc.team3641.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeSubsystem extends Subsystem{

	private static DoubleSolenoid Intake = new DoubleSolenoid(RobotMap.IntakeChannel1, RobotMap.IntakeChannel2);
	private static Talon IntakeMotor = new Talon(RobotMap.intakeMotor);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub	
	}
	
	public void ClawClosed(){
    	Intake.set(DoubleSolenoid.Value.kForward);
    }
    public void ClawOpened(){
    	Intake.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void Set(double MotorValue){
    	IntakeMotor.set(MotorValue);
    }
}
