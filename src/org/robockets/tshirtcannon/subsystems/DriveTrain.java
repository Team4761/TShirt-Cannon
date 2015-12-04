package org.robockets.tshirtcannon.subsystems;

import org.robockets.tshirtcannon.RobotMap;
import org.robockets.tshirtcannon.commands.Drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	public static final RobotDrive drivetrain = new RobotDrive(1,2,3,4);

    public void initDefaultCommand() {
    	setDefaultCommand(new Drive());

    }
    
    
    public void takeJoystickInputs(double left, double right){
    	System.out.println(left + " .. " + right);
    	drivetrain.tankDrive(left, right);
    }
    
    public void stop(){
    	drivetrain.drive(0,0);
    }
}

