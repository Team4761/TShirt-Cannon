package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.RobotMap;
import org.robockets.tshirtcannon.XAxisRelativeDirection;
import org.robockets.tshirtcannon.ZAxisRelativeDirection;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The thing on the top that shoots T-Shirts.
 */
public class Cannon extends PIDSubsystem {
	
	private Solenoid fire = RobotMap.fire; // Firing solenoid.
	private SpeedController spinMotor = RobotMap.spinMotor;
	
	private Encoder spinEncoder = RobotMap.spinEncoder;
	private DigitalInput spinMagnet = RobotMap.spinMagnet;
	
	public float distance; // Must initialize.
	public int numberBarrels = 7;
	
	public Cannon(){
		super("Cannon", 1.0, 0, 0);
		setAbsoluteTolerance(0.2);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator("Cannon", "Cannon PIDSubsystem", getPIDController());
	}
	
    public void initDefaultCommand() {
    }
    
    /**
     * Open or close the fire solenoid to fire air.
     * @param output Output of solenoid, open is true, closed is false.
     */
    public void setValve(boolean output) {
    	fire.set(output); // Opens solenoid.
    }
    
    /**
     * Rotate the base of the cannon.
     * @param dir Direction to rotate in. Must be left or right.
     */
    public void rotateBase(XAxisRelativeDirection dir) {
    	if(dir == XAxisRelativeDirection.LEFT) {
    		//TODO: spin left
    	}
    	else if(dir == XAxisRelativeDirection.RIGHT) {
    		//TODO: spin right
    	}
    	else {
    		throw new IllegalArgumentException("Direction is not left or right");
    	}
    }
    
    /**
     * Adjust the angle of the cannon.
     * @param dir Direction to move the cannon. Must be up or down.
     */
    public void adjustAngle(ZAxisRelativeDirection dir) {
    	if(dir == ZAxisRelativeDirection.UP) {
    		//TODO: move cannon up
    	}
    	else if(dir == ZAxisRelativeDirection.DOWN) {
    		//TODO: move cannon down
    	}
    	else {
    		throw new IllegalArgumentException("Direction is not up or down!");
    	}
    }

	@Override
	protected double returnPIDInput() {
		return spinEncoder.getDistance();
	}

	@Override
	protected void usePIDOutput(double output) {
		spinMotor.pidWrite(output);
	}
	
	/**
	 * Receive status on alignment of first barrel.
	 * @return	True if the DigitalInput is activated, meaning the barrel is matched correctly to the valve.
	 */
	public boolean getAligned() {
		return spinMagnet.get();
	}
	
}

