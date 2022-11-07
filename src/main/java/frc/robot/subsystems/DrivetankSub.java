// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetankSub extends SubsystemBase {
  /** Creates a new driveTankSub. */
// Defining Motors
  private final Spark leftFront = new Spark(1);
  private final Spark rightFront = new Spark(3);
  private final Spark leftBack = new Spark(2);
  private final Spark rightBack = new Spark(4);
// Defining the Differential drive that we will set. 
  public DifferentialDrive drive = new DifferentialDrive(leftFront, rightFront);

// We are defining what the motors can do
// Specifically, we want to define the ability to tank drive
public void tankDrivetrain(double leftSpeed,double rightSpeed){
// Basically when we don't move the joystick, there's some extra drift
    if(Math.abs(leftSpeed) < 0.07){
      leftSpeed = 0;
    }
    if(Math.abs(rightSpeed) < 0.07){
      rightSpeed = 0; 
    }
    
    drive.tankDrive(leftSpeed, rightSpeed); //set the front two motors to spin. 
    leftBack.set(leftFront.get()); //Set the back to follow the speed of the front. 
    rightBack.set(rightFront.get()); //Same as above
    
  }

  public DrivetankSub() {
    // We'll make sure that the left side of the drive train is inversed every instance of DrivetankSub
    leftFront.setInverted(true);
    leftBack.setInverted(true);
  }

  public void stopDrive(){
    // Don't move
    tankDrivetrain(0,0);
    arcadeDrive(0,0);
  }

  public double getLeft(){
  // Return encoder value for left
    return leftFront.get();
  }

  public double getRight(){
  // Return encoder value for right
    return rightFront.get();
  }

  public void arcadeDrive(double speed, double rotation){
    
    //ramp.applyAsDouble(right);

    drive.arcadeDrive(speed, rotation);
    //set back motors the same as front motors, because only front motors are set with arcadeDrive method
    leftBack.set(leftFront.get());
    rightBack.set(rightFront.get());
  }
    

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    System.out.print(getLeft());
    System.out.print(getRight());
    
  }
}
