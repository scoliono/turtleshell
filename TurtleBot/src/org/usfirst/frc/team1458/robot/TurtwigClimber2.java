package org.usfirst.frc.team1458.robot;

import com.team1458.turtleshell.component.TurtleRobotComponent;
import com.team1458.turtleshell.movement.TurtleMotor;
import com.team1458.turtleshell.physical.Turtle4PinEncoder;
import com.team1458.turtleshell.physical.TurtleTalon;
import com.team1458.turtleshell.physical.TurtleVictor;
import com.team1458.turtleshell.sensor.TurtleEncoder;
import com.team1458.turtleshell.util.Input;
import com.team1458.turtleshell.util.Input.POV;
import com.team1458.turtleshell.util.Input.XboxAxis;
import com.team1458.turtleshell.util.MotorValue;
import com.team1458.turtleshell.util.Output;

public class TurtwigClimber2 implements TurtleRobotComponent {

    private static TurtwigClimber2 instance;

    public static TurtwigClimber2 getInstance() {
	if (instance == null) {
	    instance = new TurtwigClimber2();
	}
	return instance;
    }

    @Override
    public void teleUpdate() {
	Output.outputNumber("Hook encoder", hookEncoder.getTicks());
	if (Input.getXBoxPOV() == POV.N) {
	    /*
	     * if (hookEncoder.getTicks() >
	     * TurtwigConstants.hookLiftEncoderTicks) {
	     * TurtleLogger.warning("Trying to put arm beyond limit"); } else {
	     */
	    hookWinch.set(MotorValue.fullBackward);
	    // }
	} else if (Input.getXBoxPOV() == POV.S) {
	    hookWinch.set(new MotorValue(0.3));
	} else {
	    hookWinch.set(MotorValue.zero);
	}
    }

    private TurtleMotor powerWinch = new TurtleVictor(TurtwigConstants.POWERWINCHVICTORPORT, false);
    private TurtleMotor hookWinch = new TurtleTalon(TurtwigConstants.HOOKWINCHTALONPORT, false);

    private TurtleEncoder hookEncoder = new Turtle4PinEncoder(TurtwigConstants.HOOKWINCHENCODERPORT1, TurtwigConstants.HOOKWINCHENCODERPORT2, false);

    @Override
    public void init() {

    }

    @Override
    public void stop() {
	powerWinch.stop();
	hookWinch.stop();
    }
}