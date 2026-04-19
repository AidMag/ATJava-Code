import animate.*;
import java.awt.EventQueue;

public class Demo {

    public static void main(String[] args) {
        // create an instance of an Applicaiton window.
        //Application app = new Application("My first graphics app");
        //app.setVisible(true);
        
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("My first graphics app (Image)");
            myApp.setVisible(true);
        });

    }
}
