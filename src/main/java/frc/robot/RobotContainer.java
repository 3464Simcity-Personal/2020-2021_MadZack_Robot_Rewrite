// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ArcadeDriveCMD;
import frc.robot.commands.CloseAllCMD;
import frc.robot.commands.DriveTank;
import frc.robot.commands.ElevatorDown;
import frc.robot.commands.ElevatorUp;
import frc.robot.commands.IntakeCMD;
import frc.robot.commands.ShootCMD;
import frc.robot.subsystems.ConveyerSub;
import frc.robot.subsystems.DrivetankSub;
import frc.robot.subsystems.ElevatorSub;
import frc.robot.subsystems.IntakeSub;
import frc.robot.subsystems.PneumaticsSub;
import frc.robot.subsystems.ShooterSub;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.InstantCommand;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DrivetankSub driveTankSub = new DrivetankSub();
  private final ShooterSub shooterSub = new ShooterSub();
  private final ConveyerSub conveyerSub = new ConveyerSub();
  private final PneumaticsSub pneumSub = new PneumaticsSub();
  private final IntakeSub intakeSub = new IntakeSub();
  private final ElevatorSub elevatorSub = new ElevatorSub();
  private final IntakePartTwo intakeTwoSub = new IntakePartTwo();

  // Here's the command that uses it. 
  private final DriveTank move = new DriveTank(driveTankSub);
  private final ShootCMD shoot = new ShootCMD(shooterSub, conveyerSub, pneumSub);
  private final IntakeCMD intakeBalls = new IntakeCMD(intakeSub, pneumSub, conveyerSub);
  private final CloseAllCMD closeStuff = new CloseAllCMD(pneumSub);
  private final ElevatorDown downElevator = new ElevatorDown(elevatorSub, pneumSub);
  private final ElevatorUp upElevator = new ElevatorUp(elevatorSub,pneumSub);
  private final ArcadeDriveCMD arcadeDrive = new ArcadeDriveCMD(driveTankSub);
  private final ExtendIntakeTwo extendIntake = new ExtendIntakeTwo(intakeTwoSub);
  private final RetractIntakeTwo retractIntake = new RetractIntakeTwo(intakeTwoSub);
  private final RunIntake runIntake = new RunIntake(intakeTwoSub);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    
    //sets Drive Train as a default command, which makes it run forever, never stopping
    CommandScheduler.getInstance().setDefaultCommand(driveTankSub, arcadeDrive);
    // CommandScheduler.getInstance().setDefaultCommand(driveTankSub, move);
    CommandScheduler.getInstance().setDefaultCommand(pneumSub, closeStuff);
    // CommandScheduler.getInstance().setDefaultCommand(pneumSub, closeAll);

    //starts the shooting command when right trigger is pressed, and stops shooter and conveyer when released
    OI.rightTrigger.whileHeld(shoot);
    OI.rightTrigger.whenReleased(new InstantCommand(shooterSub::stopShooter, shooterSub));
    OI.rightTrigger.whenReleased(new InstantCommand(conveyerSub::stop, conveyerSub));
    // OI.rightTrigger.whenReleased(new InstantCommand(pneumSub::closeAll,pneumSub));

    OI.povButtonUp.whileHeld(upElevator);
    OI.povButtonDown.whileHeld(downElevator);
    //sucks balls in when button 3 is pressed using intake, retracts intake when released
    OI.button3.whenHeld(intakeBalls);

    //bem stuff
    OI.button8.whileHeld(extendIntake);
    OI.button6.whileHeld(runIntake);
    OI.button7.whileHeld(retractIntake);
    
    // OI.button3.whenReleased(new InstantCommand(intakeSub::retractIntake, intakeSub));
    // OI.button3.whenReleased(new InstantCommand(pneumSub::closeAll, pneumSub));
    // OI.button3.whenReleased(new InstantCommand(conveyerSub::stop, conveyerSub));

    // runs the conveyer when 4 is pressed, stops when button 4 is released
    // OI.button4.whenHeld(new InstantCommand(conveyerSub::uptake, conveyerSub));
    // OI.button4.whenReleased(new InstantCommand(conveyerSub::stop, conveyerSub));


    //runs downtake when button 2 is pressed, stops when released
    OI.button2.whenHeld(new InstantCommand(conveyerSub::downtake, conveyerSub));
    OI.button2.whenReleased(new InstantCommand(conveyerSub::stop, conveyerSub));

    

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    // We're returning nothing for now
    return null;      
  }
}
