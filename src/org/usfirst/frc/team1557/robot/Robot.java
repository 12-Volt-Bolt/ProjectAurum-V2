package org.usfirst.frc.team1557.robot;

import org.usfirst.frc.team1557.robot.input.JoystickType;
import org.usfirst.frc.team1557.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.IterativeRobot;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

	public static OI oi;
	public static Subsystem drive;
	public static JoystickType type = JoystickType.MAD_CATZ;

	public void robotInit() {
		oi = new OI();
		oi.initCustomJoystick();
		drive = new Drive();
	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {

	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {

	}

	public void disabledInit() {

	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
		LiveWindow.run();
	}
}
