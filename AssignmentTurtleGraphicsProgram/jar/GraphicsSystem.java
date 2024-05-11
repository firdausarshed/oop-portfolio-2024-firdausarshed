package jar;
import javax.swing.*;
import uk.ac.leedsbeckett.oop.OOPGraphics;
import java.awt.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class GraphicsSystem extends OOPGraphics
{

    public GraphicsSystem()
    {
            JFrame screen = new JFrame();
            screen.setLayout(new FlowLayout());
            screen.add(this);
            screen.pack();
            screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            screen.setVisible(true);
            displayMessage("TURTLE GRAPHICS BY FIFI");
            penDown();

    }

    public void processCommand(String command)
    {

        switch (command) {
            case "penup":
                penUp();
                break;

            case "about":
                about();
                break;

            case "pendown":
                penDown();
                break;

            case "forward":
                forward(100);
                break;

            case "backward":
                forward(-100);
                break;

            case "turnleft":
                turnLeft();
                break;

            case "turnright":
                turnRight();
                break;

            case "black":
                setPenColour(Color.black);
                break;

            case "green":
                setPenColour(Color.green);
                break;

            case "red":
                setPenColour(Color.red);
                break;

            case "white":
                setPenColour(Color.white);
                break;

            case "clear":
                clear();
                break;

            case "reset":
                reset();
                break;

            default:
                showMessageDialog(null, "Invalid Command!");
                System.out.println("Invalid Command!");

            }

        }

    }