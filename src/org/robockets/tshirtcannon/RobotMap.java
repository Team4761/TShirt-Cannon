package org.robockets.tshirtcannon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
		
	public static RobotDrive robotDrive = new RobotDrive(1, 2, 3, 4);

	private static final int cannonXAxisMotorControllerPort = 5;
	public static final VictorSP cannonXAxisMotorController = new VictorSP(cannonXAxisMotorControllerPort);
	public static final Encoder cannonZAxisEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
	public static int numberOfBarrels;
	public static Solenoid fire = new Solenoid(0);
	public static VictorSP spinMotor = new VictorSP(6);
	public static Encoder spinEncoder = new Encoder(0, 1);
	public static DigitalInput spinMagnet;
	public static final boolean safetyEnabled = true;
	public static final int safetySensorPort = -1; //TODO: update when hardware exists IRL
	//public static final SafetySensor safetySensor = new SafetySensor(new AnalogInput(safetySensorPort));

	public RobotMap() {
		numberOfBarrels = 7;
		spinEncoder.setDistancePerPulse(numberOfBarrels/7) // Assume 7 resolution. Distance is measured in barrels.
	}
}
