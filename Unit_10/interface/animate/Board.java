package animate;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import sound.SoundClip;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Board extends JPanel implements KeyListener, MouseListener {
  private final int B_WIDTH = 350;
  private final int B_HEIGHT = 350;
  public final int SQR_AREA = 20;
  private int x;
  private int y;
  private Graphics2D g2d;
  SoundClip blop = new SoundClip("media/blop.wav");
  SoundClip blip = new SoundClip("media/blip.wav");

  public Board() {
    setBackground(Color.CYAN);
    setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    x = (B_WIDTH / 2) - (SQR_AREA / 2);
    y = (B_HEIGHT / 2) - (SQR_AREA / 2);
    this.setFocusable(true);
    this.addKeyListener(this);
    this.addMouseListener(this);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g2d = (Graphics2D) g;
    Graphics2D g2d = this.g2d;
    g2d.setColor(Color.MAGENTA);
    g2d.fillOval(x, y, this.SQR_AREA, this.SQR_AREA);
  }

  public void center() {
    x = (B_WIDTH / 2) - (SQR_AREA / 2);
    y = (B_HEIGHT / 2) - (SQR_AREA / 2);

    repaint();
  }

  public void mouseCircle(int x, int y) {
    g2d.setColor(Color.CYAN);
    g2d.fillOval(x, y, SQR_AREA, SQR_AREA);
  }

  public void blopSound() {
    blop.open();
    blop.play();
  }

  public void blipSound() {
    blip.open();
    blip.play();
  }

  public void keyPressed(KeyEvent e) {
  }

  public void keyTyped(KeyEvent e) {
    char keyType = e.getKeyChar();
    if (keyType == ' ') {
      blopSound();
      center();
    }
  }

  public void keyReleased(KeyEvent e) {
  }

  public void mousePressed(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {

  }

  public void mouseReleased(MouseEvent e) {

  }

  public void mouseClicked(MouseEvent e) {
    int mouseX = e.getX();
    int mouseY = e.getY();
    x = mouseX;
    y = mouseY;
    repaint();
    blipSound();
  }

  public void mouseExited(MouseEvent e) {

  }
}