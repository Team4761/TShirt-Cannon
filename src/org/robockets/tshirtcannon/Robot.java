package org.robockets.tshirtcannon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.robockets.buttonmanager.ButtonThread;
import org.robockets.tshirtcannon.commands.Drive;
import org.robockets.tshirtcannon.commands.UpdateDashboard;
import org.robockets.tshirtcannon.subsystems.DriveTrain;
import org.robockets.tshirtcannon.subsystems.cannon.Cannon;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static DriveTrain drivetrain = new DriveTrain();
	public static Cannon cannonSubsystem = new Cannon();
	
	public static OI oi;
	public static RobotMap robotMap;
	public static Thread buttonThread = new Thread(new ButtonThread());

    Command autonomousCommand;
    Drive drive = new Drive();

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	robotMap = new RobotMap();
		oi = new OI();
    	buttonThread.start();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    	(new UpdateDashboard()).start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        drive.start();
    	(new UpdateDashboard()).start();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
