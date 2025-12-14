import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PartC {
    /*
    Draw a picture of the “four-leaved rose” whose equation in polar coordinates is r = cos(2ᐧθ). Let θ go from 0 to 2π in 1000 steps. 
    For each step, compute r and then compute the (x, y) coordinates from the polar coordinates by using the formulas
    
    x = r · cos(θ)
    y = r · sin(θ)
    
    Important tips:
    When you want to plot the data in the content area of your JFrame window, you will need to also scale the x and y coordinate values.  
    If you don't scale (make larger) the coordinate values, the plot will not be visible on your window because the magnitude of the radius r is never greater than 1. 
    I used a scale factor of 150 so that the values of x and y are large enough to be visible when they are plotted on the content area of my window (scale = 150.0):
    x = scale · r · cos(θ)
    y = scale · r · sin(θ)
    
    When I calculated x and y, I used double values, then cast them into integer values:
    
    plotX = (int)x;
    plotY = (int)y;
    
    The origin for the Java graphics content area coincides with the upper left hand corner of the content area.  
    However, for this problem you probably want to transform your origin from the upper left corner of the content area to the center of the content area.  
    You can do this with a simple geometric transformation (translation).
    Increasing the number of steps (for example from 1000 to 10000) should increase the resolution or detail of your drawing.  
    For my program, I made the number of steps variable so that I can change the resolution of my drawing.
    
     */
    public static void draw(Graphics g) {
        // by default, this method draws a blue square.
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 100, 100);
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }

        return val;
    }

    // Do not modify the code in the main method.
    // Your code will go into the draw method above.
    public static void main(String[] args) {
        // this is the desired dimensions of the content area
        // of our JFrame window.
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set title
        frame.setTitle("Graphics Template");

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };

        frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }

}
