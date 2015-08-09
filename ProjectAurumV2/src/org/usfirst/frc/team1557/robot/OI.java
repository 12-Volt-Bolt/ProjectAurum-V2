package org.usfirst.frc.team1557.robot;

import org.usfirst.frc.team1557.robot.input.CustomJoystick;
import org.usfirst.frc.team1557.robot.input.MadCatz;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public CustomJoystick customMainJoy;
	public Joystick altJoy;
	
	
	
	
	
	
	
	
	
	public void initCustomJoystick(){
		switch(Robot.type){
		case MAD_CATZ:
			customMainJoy = new MadCatz();
			break;
		case MOUSE_3D:
			break;
		case MOUSE_KEYBOARD:
			break;
		case XBOX:
			break;
		default:
			break;
			
		}
   }
}

