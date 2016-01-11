package com.team1458.turtleshell;

public abstract class TurtleRobot extends TurtleAdvancedRobot {
	protected TurtleChassisInterface chassis;
	protected TurtleAutonomousInterface auto;
	
	@Override
	public abstract void robotInit();
	
	@Override
	public void autonomous() {
		auto.doAuto();
	}
	
	@Override
	public abstract void operatorControl();
}
