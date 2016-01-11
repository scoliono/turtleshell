package com.team1458.turtleshell;

public interface TurtleSmartTankChassisInterface extends TurtleTankChassisInterface {
	/**
	 * Drive forward (or backwards) a certain distance.
	 * @param distance Signed distance in decimal inches to drive forward.
	 */
	public void driveForward(double distance);
	
	/**
	 * Turn a specified amount of degrees clockwise
	 * @param degrees Signed amount of degrees to rotate to clockwise
	 */
	public void turn(double degrees);
}
