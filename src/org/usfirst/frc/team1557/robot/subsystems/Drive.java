package org.usfirst.frc.team1557.robot.subsystems;

import static org.usfirst.frc.team1557.robot.RobotMap.frontLeftTalonID;
import static org.usfirst.frc.team1557.robot.RobotMap.frontRightTalonID;
import static org.usfirst.frc.team1557.robot.RobotMap.rearLeftTalonID;
import static org.usfirst.frc.team1557.robot.RobotMap.rearRightTalonID;

import org.usfirst.frc.team1557.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	public static CANTalon frontLeft;
	public static CANTalon rearLeft;
	public static CANTalon frontRight;
	public static CANTalon rearRight;

	public Drive() {
		frontLeft = new CANTalon(frontLeftTalonID);
		rearLeft = new CANTalon(rearLeftTalonID);
		frontRight = new CANTalon(frontRightTalonID);
		rearRight = new CANTalon(rearRightTalonID);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
	}

	/**
	 * This is a bare bones function. It takes the input given and almost
	 * directly gives it to the Talons. Any controller specific or input changing code needs to be
	 * done in the command class
	 * 
	 * @param x
	 *            Lateral translation, strafing left to right.
	 * @param y
	 *            Forward translation, moving forward and backward.
	 * @param r
	 *            Speed of rotation
	 */
	public static void mecanumCartesian(double x, double y, double r) {
		double /**/
		v_FrontLeft = r - y + x, /**/
		v_FrontRight = r + y + x, /**/
		v_BackLeft = r - y - x, /**/
		v_BackRight = r + y - x; /**/

		/*
		 * This segment below gets the largest value or 1 so we can divide by
		 * it, making sure that the values going to the motor never exceed the
		 * -1.0 to 1.0 range the motor controllers expect
		 */
		double f = 1;
		if (Math.abs(v_FrontLeft) > f)
			f = Math.abs(v_FrontLeft);
		if (Math.abs(v_FrontRight) > f)
			f = Math.abs(v_FrontRight);
		if (Math.abs(v_BackLeft) > f)
			f = Math.abs(v_BackLeft);
		if (Math.abs(v_BackRight) > f)
			f = Math.abs(v_BackRight);

		// Set all the motor values
		frontLeft.set(v_FrontLeft / f);
		frontRight.set(v_FrontRight / f);
		rearLeft.set(v_BackLeft / f);
		rearRight.set(v_BackRight / f);
	}

}
