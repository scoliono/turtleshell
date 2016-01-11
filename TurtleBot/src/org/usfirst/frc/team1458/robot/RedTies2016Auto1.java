package org.usfirst.frc.team1458.robot;

import com.team1458.turtleshell.TurtleAutonomousInterface;
import com.team1458.turtleshell.TurtleChassisInterface;

public class RedTies2016Auto1 implements TurtleAutonomousInterface{
//4 Autos, one for each position of obstacle
	//vision tracking for theta
	
	private static RedTies2016Auto1 instance;
	private TurtleChassisInterface chassis;
	

	
	private RedTies2016Auto1(TurtleChassisInterface chassis) {
		this.chassis=chassis;
	}
	
	public static RedTies2016Auto1 getInstance(TurtleChassisInterface chassis) {
		if (instance == null) {
			instance = new RedTies2016Auto1(chassis);
		}
		return instance;
	}

	@Override
	public void doAuto() {
		while() {
			
		}
		chassis.straightDrive(1);
		
	}
	
}
