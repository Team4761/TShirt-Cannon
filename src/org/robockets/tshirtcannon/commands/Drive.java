package org.robockets.tshirtcannon.commands;

import org.robockets.buttonmanager.ButtonManager;
import org.robockets.tshirtcannon.Robot;
import org.robockets.tshirtcannon.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

    public Drive() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.takeJoystickInputs(ButtonManager.getJoystick(0).getRawAxis(1), ButtonManager.getJoystick(0).getRawAxis(5));
    	System.out.println(RobotMap.spinEncoder.getRaw());
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