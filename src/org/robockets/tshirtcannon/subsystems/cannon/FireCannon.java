package org.robockets.tshirtcannon.subsystems.cannon;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Fire one tshirt.
 */
public class FireCannon extends CommandGroup {
    
    public  FireCannon() {
    	addSequential(new SpinGatling(1));
    	addSequential(new PopCannon(0.5));
    }
}
