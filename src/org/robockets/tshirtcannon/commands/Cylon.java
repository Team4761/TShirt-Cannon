package org.robockets.tshirtcannon.commands;

import org.robockets.tshirtcannon.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Cylon extends Command {

    public Cylon() {
           	requires(Robot.ledSubsystem);
    }

   
    protected void initialize() {
    	Robot.ledSubsystem.cylon();
    }

  
    protected void execute() {
    	
    }

     protected boolean isFinished() {
    	 return true;
    }

   
    protected void end() {
    }

    protected void interrupted() {
    }
}
