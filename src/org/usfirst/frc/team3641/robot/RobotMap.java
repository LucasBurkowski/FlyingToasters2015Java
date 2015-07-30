package org.usfirst.frc.team3641.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	// Joysticks
    static int driveControllerChannel = 0;
    static int operatorControllerChannel = 1;
    
    //Buttons
    public static int HDriveButton = 6;
    public static int containerHolder = 5;
    public static int clawOuttake = 7;
    public static int clawIntake = 6;
    public static int elevatorLoad = 5;
    public static int elevatorLowerLim = 4;
    public static int elevatorLandFill = 3;
    public static int elevatorDeadDrop = 2;
    public static int fork = 1;
    
    // Drive Motors
    public static int leftMotorChannel = 0;
    public static int rightMotorChannel = 1;
    
    // Elevator Motors
    public static int leftLiftMotor = 7;
    public static int RightLiftMotor = 8;
    
    // Intake Motors
    public static int intakeMotor = 3;
    public static int HDriveMotor = 2;
    
    //Solenoids
    public static int ForkChannel1 = 0;
    public static int ForkChannel2 = 1;
    public static int IntakeChannel1 = 2;
    public static int IntakeChannel2 = 3;
    public static int ContainerGrabberChannel1 = 4;
    public static int ContainerGrabberChannel2 = 5;
    public static int CanStealerChannel1 = 6;
    public static int CanStealerChannel2 = 7;
    
    //Limit Switches
    public static int bottomLimitSwitchChannel = 1;
    
    //Potentiometers
    public static int PotentiometerChannel = 1;
    
    //SetPoints
    public static double LoadingSetPoint = 1.95;
    public static double LandFillSetPoint = 2.65;
    public static double ToteContatctSetPoint = 3.4;
    public static double LowerLimitSetPoint = 4.54;
    
}
