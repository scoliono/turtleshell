
package org.usfirst.frc.team1458.robot;

import com.team1458.turtleshell.TurtleRobot;

public class Robot extends TurtleRobot {

	public Robot() {

	}

	public void robotInit() {
		chassis = RedTies2016Chassis.getInstance();
		auto = RedTies2016Auto1.getInstance(chassis);
	}

	public void autonomous() {

	}

	public void operatorControl() {
		// Put the code to initialise operator control here.

		while (isOperatorControl() && isEnabled()) {
			// This is the main loop for operator control.

		}
	}

	public void test() {

	}
}
