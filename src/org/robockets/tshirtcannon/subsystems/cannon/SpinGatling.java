package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Spin the gatling gun.
 */
public class SpinGatling extends Command {

	double speed;
	
	/**
	 * Returns a SpinGatling command that spins by the specified amount of barrels.
	 * @param barrel The number of barrels to spin by, this can be negative.
	 */
	
    public SpinGatling(double speed) {
    	requires(Robot.cannonSubsystem);
    	this.speed = speed;
    }

    /**
     * Returns a SpinGatling command that spins by the specified distance.
     * @param distanceToSpin The distance to spin the barrel by, this can be negative.
     */
    
    //public SpinGatling(float distanceToSpin) {
    //	requires(Robot.cannonSubsystem);
    //	distance = distanceToSpin;
    //}
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	//if (Robot.cannonSubsystem.PID == false) {
    	//	end(); // If it's unaligned, I will not turn to next barrel!
    	//}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.cannonSubsystem.spinGatling(speed);
    	//Robot.cannonSubsystem.setSetpointRelative(distance); 
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    	//return Robot.cannonSubsystem.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.cannonSubsystem.spinGatling(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    	//Robot.cannonSubsystem.PID = false;
    }
}
