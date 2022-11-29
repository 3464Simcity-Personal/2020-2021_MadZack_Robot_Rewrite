package frc.robot;
// package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.simulation.JoystickSim;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
//import frc.robot.Commands.ElevatorCommand;
// import edu.wpi.first.wpilibj2.command.button.POVButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;

/* OI instantiates the joysticks and controllers used by drivers to operate the robot
      The buttons on these controllers are also instantiated in order to run commands when they are pressed */



public class OI {
    public static JoystickButton
    button8,
    button5,
    button4,
    button3,
    button2,
    rightTrigger;

    public static Joystick
    leftStick,
    rightStick,
    auxStick,
    xboxController;

    public static POVButton
        povButtonUp,
        povButtonDown;

    public OI(){
        //assign joysticks and their buttons
        leftStick = new Joystick(0);
        rightStick = new Joystick(1);
        auxStick = new Joystick(2);
        xboxController = new Joystick(3);
        rightTrigger = new JoystickButton(rightStick, 1);
        button2 = new JoystickButton(rightStick, 2);
        button3 = new JoystickButton(rightStick, 3);
        button4 = new JoystickButton(rightStick, 4);
        button5 = new JoystickButton(rightStick, 5);
        button8 = new JoystickButton(rightStick, 8);
        povButtonUp = new POVButton(rightStick, 0);
        povButtonDown = new POVButton(rightStick, 180);
    }

}