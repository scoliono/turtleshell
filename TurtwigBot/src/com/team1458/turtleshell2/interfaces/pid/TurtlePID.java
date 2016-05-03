package com.team1458.turtleshell2.interfaces.pid;

import com.team1458.turtleshell2.util.types.MotorValue;

public interface TurtlePID {
	/**
	 * Checks whether or not the target has been reached.
	 * @return Whether the pid has been reached and ready to exit
	 */
	public boolean atTarget();
	
	/**
	 * Calculate and return new value for pid
	 * @param inputs array of sensor values to input
	 * @return array storing motor values to use
	 */
	public MotorValue newValue(double[] inputs);
}
