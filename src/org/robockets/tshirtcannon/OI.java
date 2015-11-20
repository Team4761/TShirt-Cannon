package org.robockets.tshirtcannon;

import org.robockets.buttonmanager.ButtonManager;
import org.robockets.buttonmanager.buttons.ActionButton;
import org.robockets.tshirtcannon.subsystems.cannon.AlignGatling;
import org.robockets.tshirtcannon.subsystems.cannon.FireCannon;
import org.robockets.tshirtcannon.subsystems.cannon.PopCannon;
import org.robockets.tshirtcannon.subsystems.cannon.SpinGatling;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public Joystick leftStick = new Joystick(1);
	public Joystick rightStick = new Joystick(2);
	
	public OI() {
		ButtonManager.addButton(new ActionButton(0, 0, new FireCannon(), false));
		ButtonManager.addButton(new ActionButton(0, 1, new AlignGatling(), false));
		ButtonManager.addButton(new ActionButton(0, 2, new SpinGatling(1), false)); // Spin the gatling gun by one barrel.
		ButtonManager.addButton(new ActionButton(0, 3, new PopCannon(0.5), false));
	}
}

