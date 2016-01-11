package org.usfirst.frc.team1458.robot;

import com.team1458.turtleshell.TurtleAutonomous;
import com.team1458.turtleshell.TurtleChassis;

public class RedTies2016Auto1 implements TurtleAutonomous{
//4 Autos, one for each position of obstacle
	//vision tracking for theta
	
	private static RedTies2016Auto1 instance;
	private TurtleChassis chassis;
	

	
	private RedTies2016Auto1(TurtleChassis chassis) {
		this.chassis=chassis;
	}
	
	public static RedTies2016Auto1 getInstance(TurtleChassis chassis) {
		if (instance == null) {
			instance = new RedTies2016Auto1(chassis);
		}
		return instance;
	}

	@Override
	public void doAuto() {
		
		chassis.straightDrive(1);
		
	}
	
}