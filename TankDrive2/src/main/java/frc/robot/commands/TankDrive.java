package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import java.util.function.DoubleSupplier;
import frc.robot.subsystems.Drivetrain;

public class TankDrive extends CommandBase {
    private final Drivetrain m_robotDrive;
    private final DoubleSupplier m_leftStick;
    private final DoubleSupplier m_rightStick;

    public TankDrive(Drivetrain robotDrive, DoubleSupplier leftStick, DoubleSupplier rightStick) {
        m_robotDrive = robotDrive;
        m_leftStick = leftStick;
        m_rightStick = rightStick;
        addRequirements(m_robotDrive);
    }

    @Override
    public void execute() {
        m_robotDrive.tankDrive(m_leftStick.getAsDouble(), m_rightStick.getAsDouble());
    }

}
