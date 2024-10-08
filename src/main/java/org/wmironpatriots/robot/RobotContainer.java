// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wmironpatriots.robot;

import org.wmironpatriots.robot.Constants.ControllerConstantsK;
import org.wmironpatriots.robot.Util.CommandController;
import org.wmironpatriots.robot.commands.OperateDrive;
import org.wmironpatriots.robot.subsystems.drive.Drive;

public class RobotContainer {
  // * ------ SUBSYSTEMS ------
  public final Drive drive;

  // * ------ COMMAND GROUPS ------
  private final OperateDrive driveJoystick;

  // * ------ AUTO (womp womp) ------

  // * ------ CONTROLLERS ------
  public static CommandController driverController = new CommandController(
    0, 
    ControllerConstantsK.kDriveControllerJoystickDeadband, 
    ControllerConstantsK.kDrivecontrollerTriggerDeadband
  );
  public static CommandController operatorController = new CommandController(
    1, 
    ControllerConstantsK.kDriveControllerJoystickDeadband, 
    ControllerConstantsK.kDrivecontrollerTriggerDeadband
  );
  
  public RobotContainer() {
    drive = new Drive();
    driveJoystick = new OperateDrive(drive, driverController);

    //* init subsystems here
    configureDefaultCommands();
    configureBindings();
  }

  public void configureDefaultCommands() {

    drive.setDefaultCommand(
      driveJoystick.driveRobot()
    );

  }

  private void configureBindings() {
    // ---- TRIGGERS ----


    // ---- DRIVER BINDS ----
    // * Left Trigger Axis is used for slow mode

    // ---- OPERATOR BINDS ----
  }
}
