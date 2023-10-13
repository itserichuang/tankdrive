// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.TankDrive;

public class RobotContainer {
  private final Drivetrain m_robotDrive = new Drivetrain();

  private final CommandXboxController m_driverController = new CommandXboxController(Constants.kDriverControllerPort);

  public RobotContainer() {
    m_robotDrive.setDefaultCommand(new TankDrive(
      m_robotDrive,
      () -> m_driverController.getLeftY(),
      () -> m_driverController.getRightY()));
  }
}
