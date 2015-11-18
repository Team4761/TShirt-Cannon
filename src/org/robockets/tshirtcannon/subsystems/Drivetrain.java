package org.robockets.tshirtcannon.subsystems;

import org.robockets.tshirtcannon.RobotMap;
import org.robockets.tshirtcannon.commands.drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
		public static final RobotDrive drivetrain = new RobotDrive(1,2,3,4);
    

    	

    public void initDefaultCommand() {
    	setDefaultCommand(new drive());

    }
    
    
    public void takeJoystickInputs(Joystick left, Joystick right){
    	drivetrain.tankDrive(left, right);
    }
    
    public void stop(){
    	drivetrain.drive(0,0);
    	
    }
    
}

