// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.subsystems;

// import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// import edu.wpi.first.wpilibj.motorcontrol.Spark;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;

// public class DriveSub extends SubsystemBase {
//   private final Spark leftFront = new Spark(1);
//   private final Spark rightFront = new Spark(3);
//   private final Spark leftBack = new Spark(2);
//   private final Spark rightBack = new Spark(4);
// // Defining the Differential drive that we will set. 
//   public DifferentialDrive drive = new DifferentialDrive(leftFront, rightFront);

//   /** Creates a new DriveSub. */
//   public DriveSub() {}


//   public void arcadeDrive(double speed, double rotation){
    
//     //ramp.applyAsDouble(right);

//     drive.arcadeDrive(speed, rotation);
//     //set back motors the same as front motors, because only front motors are set with arcadeDrive method
//     leftBack.set(leftFront.get());
//     rightBack.set(rightFront.get());
//     }
//     public void stopDrive(){
//       arcadeDrive(0, 0);
//     }
  
//     public double getLeft(){
//       return leftFront.get();
//     }
//     public double getRight(){
  
//       return rightFront.get();
//     }
//   @Override
//   public void periodic() {
//     // This method will be called once per scheduler run
//   }
// }
