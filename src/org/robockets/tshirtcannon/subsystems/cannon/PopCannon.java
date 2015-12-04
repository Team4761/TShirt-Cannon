package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.Robot;
import org.robockets.tshirtcannon.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Open and close the valves in quick succession in order to fire a tshirt.
 */
public class PopCannon extends Command {

	double timeout;
	
    public PopCannon(double time) {
        requires(Robot.cannonSubsystem);
        timeout = time;
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	if (Robot.cannonSubsystem.PID == false) {
    		end(); // If it's unaligned, I will not pop!
    	}
    	
        if (RobotMap.safetySensor.getDistance() < 200 && RobotMap.safetyEnabled == true) {
        	end(); //Something within 2 meters, I will not pop!
        }
        
    	setTimeout(timeout);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.cannonSubsystem.setValve(true);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.cannonSubsystem.setValve(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
