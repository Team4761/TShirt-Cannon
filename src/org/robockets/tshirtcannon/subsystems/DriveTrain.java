package org.robockets.tshirtcannon.subsystems;

import org.robockets.tshirtcannon.RobotMap;
import org.robockets.tshirtcannon.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The drive train for the robot.
 */
public class DriveTrain extends Subsystem {

    public void initDefaultCommand() {
    }
    
    
    public void takeJoystickInputs(double left, double right) {
    	RobotMap.robotDrive.tankDrive(left, right);
    }
    
    public void stop() {
    	RobotMap.robotDrive.drive(0, 0);
    }
}

