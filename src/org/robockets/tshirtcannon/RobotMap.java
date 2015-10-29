package org.robockets.tshirtcannon;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

import org.robockets.tshirtcannon.sensors.SafetySensor;
import org.robockets.tshirtcannon.subsystems.cannon.Cannon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public RobotMap() {
		fire = new Solenoid(1); // Assumes channel for firing solenoid is 1.
		numberOfBarrels = 7;
		spinMotor = new VictorSP(1); // Assume port 1 for spin.
		spinEncoder = new Encoder(0, 1); // Assume digital ports of 0 and 1 for encoder.
		spinEncoder.setDistancePerPulse(numberOfBarrels/3000); // Assume 3000 resolution. Distance is measured in barrels.
	}
	
	public static final Cannon cannonSubsystem = new Cannon();
	private static final int cannonXAxisMotorControllerPort = 0;
	public static final VictorSP cannonXAxisMotorController = new VictorSP(cannonXAxisMotorControllerPort);
	public static final Encoder cannonZAxisEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
	public static int numberOfBarrels;
	public static Solenoid fire;
	public static SpeedController spinMotor;
	public static Encoder spinEncoder;
	public static DigitalInput spinMagnet;
	public static final boolean safetyEnabled = true;
	public static final int safetySensorPort = -1; //TODO: update when hardware exists IRL
	public static final SafetySensor safetySensor = new SafetySensor(new AnalogInput(safetySensorPort));
}
