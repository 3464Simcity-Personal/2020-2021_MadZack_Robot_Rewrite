// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
/*
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ConveyerSub;
import frc.robot.subsystems.PneumaticsSub;
import frc.robot.subsystems.ShooterSub;

public class ShootCMD extends CommandBase {
  /** Creates a new ShootCMD. 

  private final ShooterSub shootSub;
  private final ConveyerSub conveyerSub;
  private final PneumaticsSub pneumSub;
// create pneumatics sub as pneumSub

  // Add the pnematicsSub parameter. 
  public ShootCMD(ShooterSub shootSubsystem, ConveyerSub conveyerSubsystem, PneumaticsSub pneumaticsSubsystem) {
//  set pneumSub as the parameter input
    shootSub = shootSubsystem;
    conveyerSub = conveyerSubsystem;
    pneumSub = pneumaticsSubsystem;
    addRequirements(shootSubsystem);
    addRequirements(conveyerSubsystem);
    addRequirements(pneumaticsSubsystem);
    // add requirement for pnemsub. 
  
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    shootSub.shoot(0.9); //Set the speed. 
    conveyerSub.uptake(); //Move the converyer up. 
    pneumSub.setHood(true); //Move shooter solenoid
    pneumSub.extendRetractIndexSolenoid(false); //Close solenoid

    // We want to open the shooter  - remember the method for it!
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // This is what runs when the cmd ends, as a way to wrap it up. 
    // shootSub.shoot(0);
    // conveyerSub.stop();
    // pneumSub.setHood(false);
    // pneumSub.extendRetractIndexSolenoid(true);    

  }
  // When we're done what do we want to do?
  
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
*/