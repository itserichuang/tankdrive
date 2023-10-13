package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
    PWMSparkMax m_motorLeft = new PWMSparkMax(Constants.kLeftMotorPort);
    PWMSparkMax m_motorRight = new PWMSparkMax(Constants.kRightMotorPort);
    DifferentialDrive m_drive = new DifferentialDrive(m_motorLeft, m_motorRight);

    public Drivetrain() {
        m_motorRight.setInverted(true);
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        m_drive.tankDrive(leftSpeed, rightSpeed);
    }
}