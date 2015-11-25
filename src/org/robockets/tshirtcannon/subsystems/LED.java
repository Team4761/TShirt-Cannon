package org.robockets.tshirtcannon.subsystems;

import org.robockets.tshirtcannon.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LED extends Subsystem {
	     
    public void initDefaultCommand() {

    }
    
    public void cylon () {
    	RobotMap.arduino.write(50, 0);
    }
}

