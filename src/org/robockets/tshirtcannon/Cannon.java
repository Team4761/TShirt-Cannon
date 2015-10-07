package org.robockets.tshirtcannon;

import org.robockets.tshirtcannon.cannons.FireCannon;

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
     * @param dir Direction to rotate in. Must be 'l' (left) or 'r' (right)
     */
    public void rotateBase(char dir) {
    	if(dir == 'l') {
    		//TODO: spin left
    	}
    	else if(dir == 'r') {
    		//TODO: spin right
    	}
    	else {
    		throw new IllegalArgumentException("Direction is not left ('l') or right ('r')!");
    	}
    }
    
    /**
     * Adjust the angle of the cannon.
     * @param degrees Degrees to adjust the cannon
     * @param dir Direction to move the cannon. Must be 'u' (up) or 'd' (down)
     */
    public void adjustAngle(int degrees, char dir) {
    	if(dir == 'u') {
    		//TODO: move cannon up
    	}
    	else if(dir == 'd') {
    		//TODO: move cannon down
    	}
    	else {
    		throw new IllegalArgumentException("Direction is not up ('u') or down ('d')!");
    	}
    }
}

