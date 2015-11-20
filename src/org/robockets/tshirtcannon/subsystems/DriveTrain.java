package org.robockets.tshirtcannon.subsystems;

import org.robockets.tshirtcannon.RobotMap;
import org.robockets.tshirtcannon.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveTrain extends Subsystem {
	
		public static final RobotDrive drivetrain = new RobotDrive(RobotMap.frontLeftMotor,RobotMap.backLeftMotor,RobotMap.frontRightMotor,RobotMap.backRightMotor);

    public void initDefaultCommand() {
    	setDefaultCommand(new Drive());

    }
    
    
    public void takeJoystickInputs(double left, double right){
    	drivetrain.tankDrive(left, right);
    }
    
    public void stop(){
    	drivetrain.drive(0,0);
    }
}

