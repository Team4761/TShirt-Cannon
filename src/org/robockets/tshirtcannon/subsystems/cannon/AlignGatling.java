package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A command used to calibrate the PID so that it begins exactly on the first barrel.
 */
public class AlignGatling extends Command {

	Cannon cannon = RobotMap.cannonSubsystem;
	
    public AlignGatling() {
    	requires(cannon);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	cannon.PID = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	cannon.spinGatling(0.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return cannon.getAligned();
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.cannonSubsystem.spinGatling(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.cannonSubsystem.spinGatling(0);
    }
}
