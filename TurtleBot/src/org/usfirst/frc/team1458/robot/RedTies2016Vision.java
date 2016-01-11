package org.usfirst.frc.team1458.robot;

import com.team1458.turtleshell.TurtleVisionInterface;

public class RedTies2016Vision implements TurtleVisionInterface {

	private static RedTies2016Vision instance;

	private RedTies2016Vision() {

	}

	public static RedTies2016Vision getInstance() {
		if (instance == null) {
			instance = new RedTies2016Vision();
		}
		return instance;
	}

}
