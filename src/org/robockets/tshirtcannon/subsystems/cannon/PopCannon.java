package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PopCannon extends Command {

	Cannon cannon = RobotMap.cannonSubsystem;
	double timeout;
	
    public PopCannon(double time) {
        requires(cannon);
        timeout = time;
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	if(!cannon.PID) end(); // If it's unaligned, I will not pop!
    	setTimeout(timeout);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	cannon.setValve(true);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	cannon.setValve(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	cannon.setValve(false);
    }
}
