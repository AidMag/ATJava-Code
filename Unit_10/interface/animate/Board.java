package animate;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import sound.SoundClip;


public class Board extends JPanel implements KeyListener, {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private int x = 0;
    private int y = 0;
    private final int DIAMETER = 20;
    private Timer timer;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;
    private int xSpeed = 1, ySpeed = 1;
    private BufferedImage img;
    private double rotateSpeed = 0.25;
    private double rotate = 0;
    private SoundClip blop;


    public Board() {
       // set background color of the board and default size.
       setBackground(Color.CYAN);
       setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));


       blop = new SoundClip("media/blop.wav");
       blop.open();

       this.setFocusable(true);
       this.addKeyListener(this);
    }   


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x - img.getWidth() / 2.0, y - img.getHeight() / 2.0);
        affineTransform.rotate(rotate, img.getWidth() / 2.0, img.getHeight() / 2.0);

        if (img != null) {
            g2d.drawImage(img, affineTransform, null);
        }
    }

    public int getB_WIDTH() {
        return B_WIDTH;
    }

    public int getB_HEIGHT() {
        return B_HEIGHT;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDIAMETER() {
        return DIAMETER;
    }

    public Timer getTimer() {
        return timer;
    }

    public int getINITIAL_DELAY() {
        return INITIAL_DELAY;
    }

    public int getPERIOD_INTERVAL() {
        return PERIOD_INTERVAL;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public BufferedImage getImg() {
        return img;
    }

    public double getRotateSpeed() {
        return rotateSpeed;
    }

    public double getRotate() {
        return rotate;
    }


    public void keyTyped(KeyEvent e) {
        
    }


    public void keyPressed(KeyEvent e) {
        blop.play();
    }


    public void keyReleased(KeyEvent e) {

    }
}