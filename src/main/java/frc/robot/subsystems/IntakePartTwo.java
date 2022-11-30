package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class IntakePartTwo extends SubsystemBase {
private Spark intakeMotor = new Spark(5);
private Spark Actuator = new Spark(6); 
    public IntakePartTwo() {}

    public void runIntake() {
        intakeMotor.set(0.5);
        
    }
    
    public void stopIntake() {
        intakeMotor.set(0);
    }


    public void extendIntakeTwo() {
        Actuator.set(0.5);
      
    }

    public void stopActuator() {
        Actuator.set(0);
    }

    public void retractIntakeTwo() {
        Actuator.set(-0.5);
       
    }




    @Override
    public void periodic() {

    }
}
