package org.robockets.tshirtcannon.subsystems;

import org.robockets.tshirtcannon.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LED extends Subsystem {
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void blink () {
    	RobotMap.arduino.write(1, 0);
    }
    public void rainbow () {
    	RobotMap.arduino.write(2, 0);
    }
    public void wave () {
    	RobotMap.arduino.write(3,  0);
    }
}

