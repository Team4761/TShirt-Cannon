package org.robockets.tshirtcannon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.robockets.tshirtcannon.commands.drive;
import org.robockets.tshirtcannon.subsystems.Drivetrain;

public class Robot extends IterativeRobot {

	
	public static Drivetrain drivetrain = new Drivetrain();
	public static drive driveObj = new drive();
	
	public static OI oi;

    Command autonomousCommand;

    public void robotInit() {
		oi = new OI();

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
        driveObj.start();
    }

    public void disabledInit(){

    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
