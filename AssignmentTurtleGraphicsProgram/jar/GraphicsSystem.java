package jar;
import javax.imageio.ImageIO;
import javax.swing.*;
import uk.ac.leedsbeckett.oop.OOPGraphics;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class GraphicsSystem extends OOPGraphics
{
    private ArrayList<String> commandslist = new ArrayList<String>();

    public GraphicsSystem()
    {
            JFrame screen = new JFrame();
            screen.setLayout(new FlowLayout());
            screen.add(this);
            screen.pack();
            screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            screen.setVisible(true);
            penDown();
            //about();

    }
    public void processCommand(String command){

        System.out.println("the command printed was "+command);

        if (command.equals("penup"))
        {
            penUp();
            commandslist.add(command);
        }

        else if (command.equals("about"))
        {
            about();
            displayMessage("turtle graphics by fifi");
            commandslist.add(command);
        }

        else if (command.equals("pendown"))
        {
            penDown();
            commandslist.add(command);
        }

        else if (command.equals("black"))
        {
            setPenColour(Color.black);
            commandslist.add(command);
        }

        else if (command.equals("green"))
        {
            setPenColour(Color.green);
            commandslist.add(command);
        }

        else if (command.equals("red"))
        {
            setPenColour(Color.red);
            commandslist.add(command);
        }

        else if (command.equals("white"))
        {
            setPenColour(Color.white);
            commandslist.add(command);
        }

        else if (command.equals("clear"))
        {
            clear();
            commandslist.add(command);
        }

        else if (command.equals("reset"))
        {
            reset();
            commandslist.add(command);
        }

        else if (command.startsWith("forward"))
        {
            String[] spaces = command.split(" ");
            if (spaces.length == 2)
            {
                try
                {
                    int distance = Integer.parseInt(spaces[1]);
                    if (distance <= 0 || distance > 402)
                    {
                        JOptionPane.showMessageDialog(null, "enter an appropriate value");
                    }
                    else
                    {
                        forward(distance);
                        commandslist.add(command);
                    }
                }
                catch (NumberFormatException forward)
                {
                    JOptionPane.showMessageDialog(null, "enter a number");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "enter a parameter");
            }
        }

        else if (command.startsWith("backward"))
        {
            String[] spaces = command.split(" ");
            if (spaces.length == 2)
            {
                try
                {
                    int distance = Integer.parseInt(spaces[1]);
                    if (distance <= 0 || distance > 402)
                    {
                        JOptionPane.showMessageDialog(null, "enter an appropriate value");
                    }
                    else
                    {
                        forward(-distance);
                        commandslist.add(command);
                    }
                }
                catch (NumberFormatException forward)
                {
                    JOptionPane.showMessageDialog(null, "enter a number");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "enter a parameter");
            }

        }

        else if (command.startsWith("turnleft"))
        {
            String[] spaces = command.split(" ");
            if (spaces.length == 2)
            {
                try
                {
                    int degrees = Integer.parseInt(spaces[1]);
                    if (degrees <0 || degrees > 359)
                    {
                        JOptionPane.showMessageDialog(null, "enter an appropriate value");
                    }
                    else
                    {
                        turnLeft(degrees);
                        commandslist.add(command);
                    }
                }
                catch (NumberFormatException left)
                {
                    JOptionPane.showMessageDialog(null, "enter a number");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "enter a parameter");
            }
        }
        else if (command.startsWith("turnright"))
        {
            String[] spaces = command.split(" ");
            if (spaces.length == 2)
            {
                try
                {
                    int degrees = Integer.parseInt(spaces[1]);
                    if (degrees <0 || degrees > 359)
                    {
                        JOptionPane.showMessageDialog(null, "enter an appropriate value");
                    }
                    else
                    {
                        turnRight(degrees);
                        commandslist.add(command);
                    }
                }
                catch (NumberFormatException left)
                {
                    JOptionPane.showMessageDialog(null, "enter a number");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "enter a parameter");
            }
        }

        else if (command.equals("save"))
        {
            BufferedImage mybufferedImage = getBufferedImage();
            try
            {
                String format = String.format("%02d", new Random().nextInt(100));
                File fileout = new File("graphicssystemimg_"+format+".png");
                ImageIO.write(mybufferedImage, "png", fileout);

                File commandsout = new File("commands_"+format+".txt");
                FileWriter commandswriter = new FileWriter(commandsout, true);
                for (String cmd : commandslist)
                {
                    commandswriter.write(cmd + "\n");
                }
                commandswriter.close();
            }
            catch (IOException saving)
            {
                JOptionPane.showMessageDialog(null, "unable to save file");
            }
        }
        else if (command.equals("load"))
        {
            JFileChooser choosefile = new JFileChooser();
            int output = choosefile.showOpenDialog(null);

            if (output == JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    File input = choosefile.getSelectedFile();
                    BufferedImage mybufferedImage = ImageIO.read((input));
                    setBufferedImage(mybufferedImage);
                }
                catch (IOException loading)
                {
                    JOptionPane.showMessageDialog(null,"unable to load file");
                }
            }
        }




    }


}
