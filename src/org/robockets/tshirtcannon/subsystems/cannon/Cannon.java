package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.RobotMap;
import org.robockets.tshirtcannon.XAxisRelativeDirection;
import org.robockets.tshirtcannon.ZAxisRelativeDirection;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The thing on the top that shoots T-Shirts.
 */
public class Cannon extends Subsystem {
	
	private Solenoid fire = RobotMap.fire; // Firing solenoid.
	
    public void initDefaultCommand() {
    	setDefaultCommand(new FireCannon());
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
}

