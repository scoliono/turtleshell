package com.team1458.turtleshell;

public interface TurtleMotor {
	/**
	 * Sets the motor power.
	 * @param power double from -1 to 1, with 1 being full forward and -1 full backward.
	 */
	public void set(double power);
	/**
	 * Gets the most recently set motor power.
	 * @return The most recently set motor power, from -1 to 1.
	 */
	public double get();
}