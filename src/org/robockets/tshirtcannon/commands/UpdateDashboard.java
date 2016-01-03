package org.robockets.tshirtcannon.commands;

import org.robockets.tshirtcannon.subsystems.cannon.UpdateCannonDashboard;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Update SmartDashboard with relevant information from all the subsystems.
 */
public class UpdateDashboard extends CommandGroup {
    
    public  UpdateDashboard() {
    	addParallel(new UpdateCannonDashboard());
    }
}
