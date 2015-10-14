package org.robockets.tshirtcannon.subsystems;

import org.robockets.tshirtcannon.XAxisRelativeDirection;
import org.robockets.tshirtcannon.ZAxisRelativeDirection;
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

