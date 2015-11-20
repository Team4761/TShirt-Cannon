package org.robockets.tshirtcannon.subsystems;

import org.robockets.tshirtcannon.RobotMap;
import org.robockets.tshirtcannon.commands.drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Drivetrain extends Subsystem {
	
		public static final RobotDrive drivetrain = new RobotDrive(RobotMap.frontLeftMotor,RobotMap.backLeftMotor,RobotMap.frontRightMotor,RobotMap.backRightMotor);

    public void initDefaultCommand() {
    	setDefaultCommand(new drive());
    }
    
    
    public void takeJoystickInputs(double xAxis, double yAxis){
    	drivetrain.tankDrive(xAxis, yAxis);
    }
    
    public void stop(){
    	drivetrain.drive(0,0);
    	
    }
    
}

