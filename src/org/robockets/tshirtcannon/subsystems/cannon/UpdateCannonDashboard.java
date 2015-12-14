package org.robockets.tshirtcannon.subsystems.cannon;

import org.robockets.tshirtcannon.Robot;
import org.robockets.tshirtcannon.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Update SmartDashboard with information regarding the Cannon subsystem.
 */
public class UpdateCannonDashboard extends Command {

    public UpdateCannonDashboard() {
    	// Keep this blank so we don't kill Cannon commands.
    }

    protected void initialize() {
    	
    }

    protected void execute() {
    	Cannon cannon = Robot.cannonSubsystem;
    	
    	SmartDashboard.putNumber("Cannon Encoder Distance", RobotMap.spinEncoder.getDistance());
    	// PID
    	SmartDashboard.putNumber("Cannon PID Spin Setpoint", cannon.getSetpoint());
    	SmartDashboard.putNumber("Cannon PID Spin Position", cannon.getPosition());
    	SmartDashboard.putBoolean("Cannon PID", cannon.PID);
    	// Safety
    	SmartDashboard.putNumber("Cannon Safety Distance Sensor Value", RobotMap.safetySensor.getDistance());
    	SmartDashboard.putBoolean("Cannon Aligned", cannon.getAligned());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
