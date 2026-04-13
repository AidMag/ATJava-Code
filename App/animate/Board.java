package animate;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Board extends JPanel{
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private final int SIDE_LEN = 150;

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    }

    // override the pointComponent method
    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;

        // set color.
        g2d.setColor(Color.MAGENTA);

        // draw a shape.
        g2d.fillRect(0, 0, SIDE_LEN, SIDE_LEN);
    }
}
