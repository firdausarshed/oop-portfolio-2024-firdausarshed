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

public class GraphicsSystem extends OOPGraphics
{
    private final ArrayList<String> commandslist = new ArrayList<>();

    public GraphicsSystem()
    {
            JFrame screen = new JFrame();
            screen.setLayout(new FlowLayout());
            screen.add(this);
            screen.pack();
            screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            screen.setVisible(true);
            penDown();
           // about();

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
            penDown();
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
            catch (IOException save)
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
                catch (IOException load)
                {
                    JOptionPane.showMessageDialog(null,"unable to load file");
                }
            }
        }

        else if (command.startsWith("square"))
        {
            String[] spaces = command.split(" ");
            if (spaces.length == 2)
            {
                try
                {
                    int length;
                    length = Integer.parseInt(spaces[1]);
                    if (length <= 0 || length > 402)
                    {
                        JOptionPane.showMessageDialog(null, "enter an appropriate value");
                    }
                    else
                    {
                        square(length);
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

        else if (command.startsWith("pencolour"))
        {
            String[] spaces = command.split(" ");
            if (spaces.length == 2)
            {
                String[] colours = spaces[1].split(",");
                if (colours.length == 3)
                {
                    try
                    {
                        int red = Integer.parseInt(colours[0]);
                        int green = Integer.parseInt(colours[1]);
                        int blue = Integer.parseInt(colours[2]);
                        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255)
                        {
                            JOptionPane.showMessageDialog(null, "insert valid values");
                        }

                        else
                        {
                            setPenColour(new Color(red, green, blue));
                            commandslist.add(command);
                        }
                    }
                    catch (NumberFormatException pencolour)
                    {
                        JOptionPane.showMessageDialog(null, "insert rgb values");
                    }
                }

            }
        }

        else if (command.startsWith("penwidth"))
        {
            String[] spaces = command.split(" ");
            if (spaces.length == 2)
            {
                try
                {
                    int width = Integer.parseInt(spaces[1]);
                    if (width <0 || width > 30)
                    {
                        JOptionPane.showMessageDialog(null, "enter an appropriate value");
                    }

                    else
                    {
                        setStroke(width);
                        commandslist.add(command);
                    }

                }
                catch (NumberFormatException penwidth)
                {
                    JOptionPane.showMessageDialog(null, "enter a number");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, " enter a parameter");
            }
        }

        else if (command.startsWith("triangle"))
        {
            String[] spaces = command.split(" ");
            if (spaces.length == 2)
            {
                try
                {
                    int length;
                    length = Integer.parseInt(spaces[1]);
                    if (length < 0 || length > 300)
                    {
                        JOptionPane.showMessageDialog(null,"enter an appropriate value");
                    }
                    else
                    {
                        triangle(length);
                        commandslist.add(command);
                    }
                }
                catch (NumberFormatException triangle)
                {
                    JOptionPane.showMessageDialog(null, "enter a number");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "enter a parameter ");
            }
        }

        else
        {
            JOptionPane.showMessageDialog(null, "enter a valid command");
        }


    }

    public void about()
    {
        super.about();
        displayMessage("turtle graphics by fifi");
    }

    public void square(int len)
    {
        for (int i=0; i<4; i++)
        {
            forward(len);
            turnRight(90);
        }
        reset();
        penDown();
    }

    public void triangle(int len)
    {
        for (int i=0; i<3; i++)
        {
            forward(len);
            turnRight(120);
        }
        reset();
        penDown();
    }


}
