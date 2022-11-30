/*
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.subsystems.DrivetankSub;

public class DriveTank extends CommandBase {
  

  // First, we'll create driveSub, which has type DrivetankSub
  // Creating an instance of driveSub that has the methods we declared in the DriveTankSub file. 
  private final DrivetankSub driveSub;
  

  public DriveTank(DrivetankSub driveSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    driveSub = driveSubsystem;
    addRequirements(driveSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Drive the tankdrive at 80% speed
    driveSub.tankDrivetrain(OI.leftStick.getY()*0.8, OI.rightStick.getY()*0.8);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
*/