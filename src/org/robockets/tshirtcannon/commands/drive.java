package org.robockets.tshirtcannon.commands;

import org.robockets.tshirtcannon.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class drive extends Command {

    public drive() {
        
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("drive.execute");
    	Robot.drivetrain.takeJoystickInputs(Robot.oi.leftStick.getRawAxis(0), Robot.oi.leftStick.getRawAxis(1));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}