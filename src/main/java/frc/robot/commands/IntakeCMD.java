/*// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ConveyerSub;
import frc.robot.subsystems.IntakeSub;
import frc.robot.subsystems.PneumaticsSub;

public class IntakeCMD extends CommandBase {
  /** Creates a new IntakeCMD. *
  private final IntakeSub intakeSub;
  private final PneumaticsSub pneumSub;
  private final ConveyerSub conveyerSub;
  public IntakeCMD(IntakeSub intakeSubsystem, PneumaticsSub pneumSubsystem, ConveyerSub conveyerSubsystem) {
    intakeSub = intakeSubsystem;
    pneumSub = pneumSubsystem;
    conveyerSub = conveyerSubsystem;
    addRequirements(pneumSub);
    addRequirements(intakeSub);
    addRequirements(conveyerSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intakeSub.extendIntake();
    pneumSub.extendRetractIntakeSolenoid(true);
    conveyerSub.uptake();
  //  ///// // ..pneumSub.extendRetractIndexSolenoid(true);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // pneumSub.extendRetractIntakeSolenoid(false);
    conveyerSub.stop();
    intakeSub.retractIntake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
*/