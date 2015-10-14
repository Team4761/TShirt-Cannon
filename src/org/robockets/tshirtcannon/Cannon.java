package org.robockets.tshirtcannon;

import org.robockets.tshirtcannon.commands.FireCannon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The thing on the top that shoots T-Shirts.
 */
public class Cannon extends Subsystem {
    public void initDefaultCommand() {
    	setDefaultCommand(new FireCannon());
    }
    public void fire() {
    	//TODO: Fire the cannon
    }
    
    /**
     * Rotate the base of the cannon.
     * @param dir Direction to rotate in. Must be left or right.
     * @param degrees Degrees to rotate
     */
    public void rotateBase(XAxisRelativeDirection dir, int degrees) {
    	if(dir == XAxisRelativeDirection.LEFT) {
    		//TODO: spin left
    	}
    	else if(dir == XAxisRelativeDirection.RIGHT) {
    		//TODO: spin right
    	}
    	else {
    		throw new IllegalArgumentException("Direction is not left or right (null maybe?)");
    	}
    }
    
    final static double adjustSpeed = 0.5; //TODO: update when hardware exists IRL
    /**
     * Adjust the angle of the cannon.
     * @param dir Direction to move the cannon. Must be up or down.
     * @param degrees Degrees to adjust
     */
    public void adjustAngle(ZAxisRelativeDirection dir, int degrees) {
    	if(dir == ZAxisRelativeDirection.UP) {
    		RobotMap.cannonXAxisMotorController.set(adjustSpeed);
    		//TODO: do this until encoder says "No more! I can't take it anymore!"
    	}
    	else if(dir == ZAxisRelativeDirection.DOWN) {
    		RobotMap.cannonXAxisMotorController.set(-adjustSpeed);
    		//TODO: do this until encoder says "No more! I can't take it anymore!"
    	}
    	else {
    		throw new IllegalArgumentException("Direction is not up or down (null maybe?)");
    	}
    }
}

