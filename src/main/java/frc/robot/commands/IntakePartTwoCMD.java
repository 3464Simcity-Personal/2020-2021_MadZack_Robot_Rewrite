package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakePartTwoCMD extends CommandBase {
    /** Creates a new IntakePartTwo. */
    private final IntakePartTwo intakePartTwo;
    public IntakePartTwoCMD(IntakePartTwo intakePartTwo) {
        // Use addRequirements() here to declare subsystem dependencies.
        intakeSubTwo = intakePartTwo;
        addRequirements(intakeSubTwo);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        intakePartTwo.extendIntakeTwo();
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        intakePartTwo.stopActuator();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
