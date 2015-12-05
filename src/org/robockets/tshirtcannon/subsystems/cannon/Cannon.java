package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.RobotMap;
import org.robockets.tshirtcannon.XAxisRelativeDirection; // ¯\_(ツ)_/¯
import org.robockets.tshirtcannon.ZAxisRelativeDirection; // ¯\_(ツ)_/¯

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The thing on the top that shoots T-Shirts.
 */
public class Cannon extends PIDSubsystem {
	
	private Solenoid fire = RobotMap.fire; // Firing solenoid.
	private VictorSP spinMotor = RobotMap.spinMotor;
	
	//private Encoder spinEncoder = RobotMap.spinEncoder;
	//private DigitalInput spinMagnet = RobotMap.spinMagnet;
	
	public float distance; // Must initialize.
	
    final static double ADJUST_SPEED = 0.3; //TODO: update when hardware exists IRL
    final static int MAX_UP_DOWN_DISTANCE = 100; // TODO: Update when hardware exists IRL
	
	/**
	 * A switch for using PID to do encoder-based spin for the gatling part of the Cannon.
	 */
	public boolean PID = false; // Set true when PID is in use, otherwise if you fire, align it first.
	
	public Cannon(){
		super("Cannon", 0.1, 0, 0);
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
     * @deprecated Deprecated until the hardware exists for this
     */
	@Deprecated
    public void rotateBase(XAxisRelativeDirection dir) {
    	if (dir == XAxisRelativeDirection.LEFT) {
    		//TODO: spin left
    	} else if(dir == XAxisRelativeDirection.RIGHT) {
    		//TODO: spin right
    	} else {
    		throw new IllegalArgumentException("Direction is not left or right");
    	}
    }
    
    /**
     * Adjust the angle of the cannon.
     * @param dir Direction to move the cannon. Must be up or down.
     */
    public void adjustAngle(ZAxisRelativeDirection dir) {
        if (dir == ZAxisRelativeDirection.UP) {
            //if (RobotMap.cannonZAxisEncoder.get() <= MAX_UP_DOWN_DISTANCE) {
                RobotMap.cannonXAxisMotorController.set(ADJUST_SPEED);
            //}
        } else if(dir == ZAxisRelativeDirection.DOWN) {
            //if (RobotMap.cannonZAxisEncoder.get() <= -MAX_UP_DOWN_DISTANCE) {
                RobotMap.cannonXAxisMotorController.set(-ADJUST_SPEED);
            //}
        } else {
            throw new IllegalArgumentException("Direction is not up or down (null maybe?)");
        }
    }
    
    public void stopAngleMotor() {
    	RobotMap.cannonXAxisMotorController.set(0);
    }

	@Override
	protected double returnPIDInput() {
		return 0; //spinEncoder.getDistance();
	}

	@Override
	protected void usePIDOutput(double output) {
    	if (PID) {
    		//spinMotor.pidWrite(output);
    	}
	}
	
	/**
	 * Spin the Gatling part of cannon by a set speed.
	 * @param speed The speed to spin the gatling gun portion of the cannon by.
	 */
	public void spinGatling(double speed) {
		spinMotor.set(speed);
	};
	
	/**
	 * Receive status on alignment of first barrel.
	 * @return	True if the DigitalInput is activated, meaning the barrel is matched correctly to the valve.
	 */
	public boolean getAligned() {
		return false; //spinMagnet.get();
	}
	
	/**
	 * Enable and reset the PID so that distance is 0.
	 */
	public void resetPID() {
		//spinEncoder.reset();
		setSetpoint(0);
		PID = true;
	}
}

