/*// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSub extends SubsystemBase {

// leftFront = new CANSparkMax(leftFrontInt, CANSparkMaxLowLevel.MotorType.kBrushless), 

  private final CANSparkMax shooter = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
// Stop Shooter. 
  public void stopShooter(){
    shooter.set(0);
  }

  // take in a speed argument - shoot(double speed), and set the motor to that speed. 
  public void shoot(double speed){
    shooter.set(speed); //Right now, its' so we can pass a postive verialbe for no-reverse -might be off. 
  }
 //returns speed as a double
  public double returnSpeed(){
    return shooter.get();
  }


  public void reverseShooter(){
    shooter.set(0.6); //Set shooter to reverse at 60% speed. 
  }

  public ShooterSub() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
*/