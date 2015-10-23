package org.robockets.tshirtcannon;

import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import org.robockets.tshirtcannon.subsystems.Cannon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public RobotMap() {
	}
	
	public static final Cannon cannonSubsystem = new Cannon();
	private static final int cannonXAxisMotorControllerPort = 0;
	public static final VictorSP cannonXAxisMotorController = new VictorSP(cannonXAxisMotorControllerPort);
	public static final Encoder cannonZAxisEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
}
