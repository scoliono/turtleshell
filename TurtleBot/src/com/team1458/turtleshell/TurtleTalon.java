package com.team1458.turtleshell;

import edu.wpi.first.wpilibj.Talon;

public class TurtleTalon implements TurtleMotor {
	private Talon talon;
	public TurtleTalon(int port) {
		talon=new Talon(port);
	}
	@Override
	public void set(double power) {
		talon.set(power);
		
	}

	@Override
	public double get() {
		return talon.get();
	}
}