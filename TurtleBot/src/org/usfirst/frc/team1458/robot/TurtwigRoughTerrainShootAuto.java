package org.usfirst.frc.team1458.robot;

import com.team1458.turtleshell.base.TurtleAutonomous;
import com.team1458.turtleshell.base.TurtlePhysicalRobot;
import com.team1458.turtleshell.util.Output;
import com.team1458.turtleshell.util.TurtleSafeDriverStation;

public class TurtwigRoughTerrainShootAuto implements TurtleAutonomous {
	TurtlePhysicalRobot physicalRobot;
	TurtwigSmartTankChassis chassis;

	@Override
	public void doAuto() {
		chassis = (TurtwigSmartTankChassis) physicalRobot
				.getComponent("Chassis");
		
		

		Output.syso("Turtwig did it!");
	}

	@Override
	public void giveRobot(TurtlePhysicalRobot physicalRobot) {
		this.physicalRobot = physicalRobot;

	}

	private void safeDo() {
		while (TurtleSafeDriverStation.canAuto() && !chassis.atTarget()) {
			chassis.autoUpdate();
		}
		chassis.stop();
	}

}