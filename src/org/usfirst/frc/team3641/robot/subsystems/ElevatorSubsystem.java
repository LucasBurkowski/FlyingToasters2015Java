package org.usfirst.frc.team3641.robot.subsystems;

import org.usfirst.frc.team3641.robot.RobotMap;
import org.usfirst.frc.team3641.robot.commands.JoystickElevatorCommand;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ElevatorSubsystem extends Subsystem{
	private Talon Elevator1 = new Talon(RobotMap.leftLiftMotor);
	private Talon Elevator2 = new Talon(RobotMap.RightLiftMotor);
	private DigitalInput BottomLimit = new DigitalInput(RobotMap.bottomLimitSwitchChannel);
	private AnalogInput Pot = new AnalogInput(RobotMap.PotentiometerChannel);
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new JoystickElevatorCommand());		
	}
	
	public void setDrive(double stick){
		if (BottomLimit.equals(true) && stick <= 0){
			Elevator1.set(0);
			Elevator2.set(0);
		}
		else{
			Elevator1.set(-stick);
			Elevator2.set(stick);
		}
	}
	
	public double getPot(){
		double Potentiometer = Pot.getVoltage();
		return Potentiometer;
	}
}
