package animate;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.awt.image.BufferedImage;


public class Board extends JPanel {
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private BufferedImage img;

    public Board() {
        // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // attempt to load the image.
        try {
            File imageFile = new File("media/instrument-124.png");
            img = ImageIO.read(imageFile);
            setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        double scale = 0.5;

        Graphics2D g2d = (Graphics2D) g;
        AffineTransform affineTransform = new AffineTransform();

        if (img != null) {
            if (img != null) {
                affineTransform.translate((this.getWidth() - (img.getWidth() * scale)), (this.getHeight() - (img.getHeight() * scale)));
                affineTransform.scale(scale, scale);

                g2d.drawImage(img, affineTransform, null);
            } else {
                g2d.setColor(Color.BLUE);
                g2d.drawString("Unable to load image!", 25, 25);
            }
        }
    }
}