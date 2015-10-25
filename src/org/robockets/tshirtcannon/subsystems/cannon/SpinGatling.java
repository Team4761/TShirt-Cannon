package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpinGatling extends Command {

	Cannon cannon = RobotMap.cannonSubsystem;
	float distance;
	
    public SpinGatling(int barrel) {
    	requires(cannon);
    }

    public SpinGatling(double dis) {
    	requires(cannon);
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
