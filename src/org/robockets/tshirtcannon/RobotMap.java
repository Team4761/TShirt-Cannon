package org.robockets.tshirtcannon;

import edu.wpi.first.wpilibj.Solenoid;

import org.robockets.tshirtcannon.subsystems.cannon.Cannon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public RobotMap() {
		Solenoid fire = new Solenoid(1); // Assumes channel for firing solenoid is 1.
	}
	
	public static final Cannon cannonSubsystem = new Cannon();
	
	public static Solenoid fire;
}
