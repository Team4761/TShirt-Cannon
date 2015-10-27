package org.robockets.tshirtcannon.subsystems.cannon;

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

    final static double adjustSpeed = 0.5; //TODO: update when hardware exists IRL
    final static int maxUpDownDistance = 100; // TODO: Update when hardware exists IRL
    /**
     * Adjust the angle of the cannon.
     * @param dir Direction to move the cannon. Must be up or down.
     */
    public static void adjustAngle(ZAxisRelativeDirection dir) {
        if(dir == ZAxisRelativeDirection.UP) {
            if (RobotMap.cannonZAxisEncoder.get() <= maxUpDownDistance) {
                RobotMap.cannonXAxisMotorController.set(adjustSpeed);
            }
        }
        else if(dir == ZAxisRelativeDirection.DOWN) {
            if (RobotMap.cannonZAxisEncoder.get() <= -maxUpDownDistance) {
                RobotMap.cannonXAxisMotorController.set(adjustSpeed);
            }
        }
        else {
            throw new IllegalArgumentException("Direction is not up or down (null maybe?)");
        }
    }
}

