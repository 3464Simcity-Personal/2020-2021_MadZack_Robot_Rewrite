// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.subsystems.DrivetankSub;

public class ArcadeDriveCMD extends CommandBase {
  private final DrivetankSub driveSub;
  private double speed;
  private double rotation;
  private double trigger;
  /** Creates a new ArcadeDriveCMD. */
  public ArcadeDriveCMD(DrivetankSub driveSubsystem) {
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
    trigger = OI.xboxController.getRawAxis(3)*0.8;
    speed = OI.xboxController.getRawAxis(1)*0.8;
    if (Math.abs(speed) < 0.07) {
      speed = 0;
    }
    if (Math.abs(rotation) < 0.07){
      rotation = 0;  
    }
    /*if(speed > 0){
      speed += trigger;
    }
    else{
    }
    if(speed > 0){
      speed += trigger;
    }
    else{
      speed -= trigger;
    }*/
    driveSub.arcadeDrive(speed, OI.xboxController.getRawAxis(4)*-.8);
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
