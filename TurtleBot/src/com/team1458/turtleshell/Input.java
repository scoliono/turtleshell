package com.team1458.turtleshell;

import org.usfirst.frc.team1458.robot.Constants;

import edu.wpi.first.wpilibj.Joystick;

public class Input {
	private static Joystick rJoystick = new Joystick(Constants.RJOYSTICKPORT);
	private static Joystick lJoystick = new Joystick(Constants.LJOYSTICKPORT);
	private static Joystick buttonPanel = new Joystick(Constants.BUTTONPANELPORT);
	
	/**
	 * Get the power for the right joystick.
	 * @return The right joystick power, measured on y axis. n.b. this is negative from the raw axis.
	 */
	public static double getRPower() {
		return -rJoystick.getAxis(Joystick.AxisType.kY);
	}
	
	/**
	 * Get the power for the left joystick.
	 * @return The left joystick power, measured on y axis. n.b. this is negative from the raw axis.
	 */
	public static double getLPower() {
		return -lJoystick.getAxis(Joystick.AxisType.kY);
	}
	
	/**
	 * Gets whether a button on the buttonPanel is pressed.
	 * @param whichButton Which button you want, note that this starts at 1.
	 * @return Whether or not the button is pressed.
	 */
	public static boolean isPanelButtonPressed(int whichButton) {
		return buttonPanel.getRawButton(whichButton);
	}
	
	public static double getRTheta() {
		return 180*Math.atan2(-rJoystick.getAxis(Joystick.AxisType.kY), rJoystick.getAxis(Joystick.AxisType.kX))/Math.PI;
	}
}