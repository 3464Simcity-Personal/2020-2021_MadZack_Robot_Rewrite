// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.math.filter.Debouncer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSub extends SubsystemBase {
  /** Creates a new ElevatorSub. */
  private final CANSparkMax elevator = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
  public static DigitalInput bottomLimitSwitch = new DigitalInput(0);
  public static DigitalInput topLimitSwitch = new DigitalInput(1);
  
  public static Debouncer debouncer = new Debouncer(0.15, Debouncer.DebounceType.kBoth);

  public ElevatorSub() {
  }


  public void elevatorUp(){
    //  if (debouncer.calculate(!this.bottomLimitSwitch.get())){
    if (!this.bottomLimitSwitch.get()){
      elevator.set(0.0);
    }
    else{
      elevator.set(-0.8);
    }
  }


  public void elevatorDown(){
    elevator.set(0.6);
    // if (!this.topLimitSwitch.get()){
    //   elevator.set(0.0);
    // }
    // else{
    //   elevator.set(0.2);
    // }
  }

  public boolean getUpLimitSwitch(){
    // return(debouncer.calculate(topLimitSwitch.get()));
    return(topLimitSwitch.get());
  }



  public void stopElevator(){
    elevator.set(0.0);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
