package org.robockets.tshirtcannon.subsystems.cannon;

import edu.wpi.first.wpilibj.command.Command;
import org.robockets.tshirtcannon.Robot;
import org.robockets.tshirtcannon.ZAxisRelativeDirection;

/**
 * Move the cannon up or down
 */
public class AdjustCannon extends Command {
    ZAxisRelativeDirection dir;
    
    public AdjustCannon(ZAxisRelativeDirection dir) {
        requires(Robot.cannonSubsystem);
        this.dir = dir;
    }
    
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.cannonSubsystem.adjustAngle(dir);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; //TODO: get a real value here
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.cannonSubsystem.stopAngleMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
