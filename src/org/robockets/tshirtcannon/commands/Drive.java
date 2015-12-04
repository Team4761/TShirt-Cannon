package org.robockets.tshirtcannon.commands;

import org.robockets.tshirtcannon.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

    public Drive() {
        
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {

    	Robot.drivetrain.takeJoystickInputs(Robot.oi.joyStick.getRawAxis(0), Robot.oi.joyStick.getRawAxis(1));
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drivetrain.stop();
    }

    protected void interrupted() {
    	end();
    }
}