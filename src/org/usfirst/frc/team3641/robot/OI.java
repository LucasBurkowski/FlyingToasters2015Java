package org.usfirst.frc.team3641.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3641.robot.commands.ContainerHolderCloseCommand;
import org.usfirst.frc.team3641.robot.commands.ElevatorDeadDropCommand;
import org.usfirst.frc.team3641.robot.commands.ElevatorGroundContactCommand;
import org.usfirst.frc.team3641.robot.commands.ElevatorLandFillCommand;
import org.usfirst.frc.team3641.robot.commands.ElevatorToteLoadCommand;
import org.usfirst.frc.team3641.robot.commands.ExampleCommand;
import org.usfirst.frc.team3641.robot.commands.ForkOpen;
import org.usfirst.frc.team3641.robot.commands.HDriveCommand;
import org.usfirst.frc.team3641.robot.commands.IntakeInCommand;
import org.usfirst.frc.team3641.robot.commands.IntakeOutCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	//Define each driver/operator controller
	  public Joystick gamepad;
	  public Joystick manipulator;
	  
	//Define Joystick values to be used
	  public OI() {
			
			//Instantiate the driver/operator controllers
		  	gamepad = new Joystick(RobotMap.driveControllerChannel);
		    manipulator = new Joystick(RobotMap.operatorControllerChannel);
		    
		    //Instantiate and define the buttons on the operator controller
		    new JoystickButton(manipulator, RobotMap.fork).whileHeld(new ForkOpen());
		    new JoystickButton(manipulator, RobotMap.elevatorLoad).whileHeld(new ElevatorToteLoadCommand());
		    new JoystickButton(manipulator, RobotMap.elevatorLandFill).whileHeld(new ElevatorLandFillCommand());
		    new JoystickButton(manipulator, RobotMap.elevatorLowerLim).whileHeld(new ElevatorGroundContactCommand());
		    new JoystickButton(manipulator, RobotMap.elevatorDeadDrop).whileHeld(new ElevatorDeadDropCommand());
		    new JoystickButton(manipulator, RobotMap.clawIntake).whileHeld(new IntakeInCommand());
		    new JoystickButton(manipulator, RobotMap.clawOuttake).whileHeld(new IntakeOutCommand());
		    new JoystickButton(gamepad, RobotMap.HDriveButton).whileHeld(new HDriveCommand());
		    new JoystickButton(gamepad, RobotMap.containerHolder).whileHeld(new ContainerHolderCloseCommand());
	  }
	  
	  public double getLeftGamePadAxis(){
		  double AxisValue = gamepad.getRawAxis(1);
		  return AxisValue;
	  }
	  
	  public double getRightGamePadAxis(){
		  double AxisValue = gamepad.getRawAxis(3);
		  return AxisValue;
	  }
	  
	  public double getLeftGamePadXAxis(){
		  double AxisValue = gamepad.getRawAxis(0);
		  return AxisValue;
	  }
	  
	  public double getManipulatorAxis(){
		  double AxisValue = manipulator.getRawAxis(1);
		  return AxisValue;
	  }
			
}

