package org.usfirst.frc.team1458.robot;

import com.team1458.turtleshell.TurtleAutonomous;

public class RedTies2016Auto1 implements TurtleAutonomous {
	// 4 Autos, one for each position of obstacle
	// vision tracking for theta
	private double lDp;
	private double rDp;

	private static RedTies2016Auto1 instance;

	private RedTies2016Auto1() {

	}

	public static RedTies2016Auto1 getInstance() {
		if (instance == null) {
			instance = new RedTies2016Auto1();
		}
		return instance;
	}

	@Override
	public double[] getMotors() {
		return new double[]{rDp,lDp};
	}

	@Override
	public void calculate() {
		rDp=0;
		lDp=0;
	}

}
