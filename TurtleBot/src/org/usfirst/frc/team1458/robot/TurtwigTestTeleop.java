package org.usfirst.frc.team1458.robot;

import com.team1458.turtleshell.core.TurtlePhysicalRobot;
import com.team1458.turtleshell.core.TurtleTeleop;

public class TurtwigTestTeleop implements TurtleTeleop {
	TurtlePhysicalRobot physicalRobot;
	@Override
	public void tick() {
		physicalRobot.teleUpdateAll();
	}

	@Override
	public void giveRobot(TurtlePhysicalRobot physicalRobot) {
		this.physicalRobot=physicalRobot;
		
	}

}
