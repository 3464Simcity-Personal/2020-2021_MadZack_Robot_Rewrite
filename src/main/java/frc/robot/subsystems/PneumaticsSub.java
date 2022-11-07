// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;
// import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

public class PneumaticsSub extends SubsystemBase {
  
  private final Compressor comp = new Compressor(0, PneumaticsModuleType.CTREPCM);
  // private final Solenoid solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 0);
  public static Solenoid 
    intakeSolenoid1 = new Solenoid(PneumaticsModuleType.CTREPCM, 2),
    indexSolenoid1 = new Solenoid(PneumaticsModuleType.CTREPCM,1),
    shootingSolenoid1 = new Solenoid(PneumaticsModuleType.CTREPCM,3),
    climbingSolenoid1 = new Solenoid(PneumaticsModuleType.CTREPCM,0);
  

  // to set, we use 
  // shootingSolenoid.set(True);
  /** Creates a new PneumaticsAub. */
  public PneumaticsSub() {
    comp.enableDigital();

  }

  public void extendRetractIntakeSolenoid(boolean on){
    intakeSolenoid1.set(on); 
  }    
  
  public void extendRetractIndexSolenoid(boolean on){
    indexSolenoid1.set(on); 
  }    

  public void setHood(boolean on){
    shootingSolenoid1.set(on);
  }
  
  public void climbLockChange(boolean lock){
    climbingSolenoid1.set(lock);
  }

  public boolean getLockState(){
    return(climbingSolenoid1.get());
  }

  public void closeAll(){
    shootingSolenoid1.set(false);
    indexSolenoid1.set(true);
    intakeSolenoid1.set(false);

    // shootingSolenoid1.set(true);
    // shootingSolenoid1.set(true);
    
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    }
 
}
