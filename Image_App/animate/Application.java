package animate;
import javax.swing.JFrame;
import java.awt.EventQueue;

public class Application extends JFrame {
    private static int FRAME_WIDTH = 1080;
    private static int FRAME_HEIGHT = 720;

    // constructor
    public Application(String title) {
        // Use the inherited setTitle() method
        // to set the title for our frame.
        this.setTitle(title);

        // Use the inherited setSize() method
        // to set the size of our frame.
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // tell Java what you want our window to do
        // when the window is closed by the user.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // specify where to place our window
        // (is it relative to another window?).
        this.setLocationRelativeTo(null);

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
        // to set the size of our frame.
        // this.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // add a Board to our JFrame.
        Board board = new Board();
        this.add(board);
   
        // set the size based on the board size
        // and also account for the border width and the bar height.
        int application_height = (int) board.getPreferredSize().getHeight() + bar_height + border_width;
        int application_width = (int) board.getPreferredSize().getWidth() + 2 * border_width;
        this.setSize(application_width, application_height);


        //int application_width = FRAME_WIDTH + 2 * border_width;
        //int application_height = FRAME_HEIGHT + bar_height + border_width;

        // set the size based on the board size
        // and also account for the width border and height of the bar.
        this.setSize(application_width, application_height);
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

    public static void main(String[] args) {
        // create an instance of an Applicaiton window.
        //Application app = new Application("My first graphics app");
        //app.setVisible(true);

        /*
         * In Java, GUI related actions should be
         * performed in the AWT event thread
         * or it could cause severe problems with the GUI.
         * EventQueue.invokeLater() posts your GUI-related
         * actions in the AWT event queue to avoid causing
         * any problems with other GUI-related actions.
         */
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("My first graphics app (Image)");
            myApp.setVisible(true);
        });

    }
}
   


