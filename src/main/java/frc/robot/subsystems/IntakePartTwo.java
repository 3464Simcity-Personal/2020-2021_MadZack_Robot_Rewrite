package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

private final Spark intakeMotor = new Spark(0);
private final Spark Actuator = new Spark(1)

public class IntakePartTwo extends SubsystemBase {
    
    public IntakePartTwo() {}

    public void runIntake() {
        intakeMotor.set(0.5);
    }
    
    public void stopIntake() {
        intakeMotor.set(0);
    }


    public void extendIntake() {
        Actuator.set(0.5);
    }

    public void stopActuator() {
        Actuator.set(0);
    }

    public void retractIntake() {
        Actuator.set(-0.5);
    }




    @Override
    public void periodic() {

    }
}