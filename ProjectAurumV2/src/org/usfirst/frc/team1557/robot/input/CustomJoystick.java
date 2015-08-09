package org.usfirst.frc.team1557.robot.input;

public abstract class CustomJoystick {
	//I wonder if Jacob can figure out how to use this. I'm quite happy with it.
	public JoystickType type;
	/**
	 * @return a double between -1 and 1 that represents the X-Axis
	 */
	public abstract double getX();

	/**
	 * @return a double between -1 and 1 that represents the Y-Axis
	 */
	public abstract double getY();
	
	/**
	 * @return a double between -1 and 1 that represents the Rotation-Axis
	 */
	public abstract double getR();
	
	/**
	 * @return a double between -1 and 1 that represents the Z-Axis
	 */
	public abstract double getZ();
	/**
	 * Set the joystick type of this custom joystick. Note, should be set in the constructor.
	 */
	public void setJoystickType(JoystickType type){
		this.type = type;
	};
	
	/**
	 * Get the joystick type of this custom joystick
	 */
	public JoystickType getJoystickType(){
		return type;
	};
}
