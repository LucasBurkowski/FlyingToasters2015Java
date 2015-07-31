package org.usfirst.frc.team3641.robot.PID;

public class PID {
	public static double Proportion = 1.22;
	public static double I = 0.1;
	
	public static double P(double setpoint, double sensor){
		double MotorOut;
		double Offset = setpoint - sensor;
		MotorOut = Proportion * Offset;
		return MotorOut;
	}
	
	public static double PI(double setpoint, double sensor){
		double MotorOut;
		double Offset = setpoint - sensor;
		double ErrorRefresh = 0.005*Offset;
		double IError = 0;
		IError += ErrorRefresh;
		MotorOut = (Proportion * Offset) + (IError * I);
		return MotorOut;
	}
}
