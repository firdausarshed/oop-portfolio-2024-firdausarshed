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
            case "penup" -> penUp();
            case "about" -> about();
            case "pendown" -> penDown();
            case "forward" -> forward(100);
            case "backward" -> forward(-100);
            case "turnleft" -> turnLeft();
            case "turnright" -> turnRight();
            case "black" -> setPenColour(Color.black);
            case "green" -> setPenColour(Color.green);
            case "red" -> setPenColour(Color.red);
            case "white" -> setPenColour(Color.white);
            case "clear" -> clear();
            case "reset" -> reset();
            default -> {
                showMessageDialog(null, "Invalid Command!");
                System.out.println("Invalid Command!");
            }

        }

        }

    }