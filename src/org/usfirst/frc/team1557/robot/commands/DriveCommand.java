package org.usfirst.frc.team1557.robot.commands;

import org.usfirst.frc.team1557.robot.Robot;

import org.usfirst.frc.team1557.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command {

	public DriveCommand() {
		requires(Robot.drive);
	}

	protected void initialize() {

	}

	protected void execute() {
		Drive.mecanumCartesian(
		/**//**/Robot.oi.customMainJoy.getX(), /**/
				Robot.oi.customMainJoy.getY(), /**/
				Robot.oi.customMainJoy.getR()); /**/

	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Drive.mecanumCartesian(0, 0, 0);

	}

	protected void interrupted() {
		end();
	}
}
