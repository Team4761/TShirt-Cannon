package org.robockets.tshirtcannon.subsystems;

import org.robockets.tshirtcannon.RobotMap;
import org.robockets.tshirtcannon.commands.FireCannon;
import org.robockets.tshirtcannon.XAxisRelativeDirection; // ¯\_(ツ)_/¯
import org.robockets.tshirtcannon.ZAxisRelativeDirection; // ¯\_(ツ)_/¯

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
	 * @deprecated Deprecated until the hardware exists for this
     */
	@Deprecated
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
		org.robockets.tshirtcannon.Cannon.adjustAngle(dir); // ¯\_(ツ)_/¯
    }
}

