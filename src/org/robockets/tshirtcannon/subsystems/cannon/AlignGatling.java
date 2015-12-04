package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A command used to calibrate the PID so that it begins exactly on the first barrel.
 */
public class AlignGatling extends Command {
	
    public AlignGatling() {
    	requires(Robot.cannonSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.cannonSubsystem.PID = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.cannonSubsystem.spinGatling(0.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.cannonSubsystem.getAligned();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.cannonSubsystem.spinGatling(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.cannonSubsystem.spinGatling(0);
    }
}
