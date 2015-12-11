package org.robockets.tshirtcannon;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

import org.robockets.distancesensorlib.maxbotix.LvMaxSonarEz;
import org.robockets.tshirtcannon.subsystems.cannon.Cannon;

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
	public static VictorSP spinMotor = new VictorSP(6);;
	public static Encoder spinEncoder = new Encoder(0, 1);;
	public static DigitalInput spinMagnet;
	public static final boolean safetyEnabled = true;
	public static final int safetySensorPort = 7;
	public static final LvMaxSonarEz safetySensor = new LvMaxSonarEz(new AnalogInput(safetySensorPort), 5.0); //TODO: Check voltage

	public RobotMap() {
		numberOfBarrels = 7;
		spinEncoder.setDistancePerPulse(numberOfBarrels/3000); // Assume 3000 resolution. Distance is measured in barrels.
	}
}
