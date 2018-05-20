import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class JCollisions extends JPanel{
  public int intwidth = 10;
  public int intheight = 10;
  public int intstartx;
  public int intstarty;
  public int intendx;
  public int intendy;
  public int intPuck1X = 25;
  public int intPuck1Y = 25;
  public int intPuck2X = 50;
  public int intPuck2Y = 50;
  public int intCount;
  public int intVelocityX1;
  public int intVelocityY1;
  public int intVelocityX2;
  public int intVelocityY2;
  public double dblVelocity1;
  public double dblVelocity2;
  public double dblRoundVel1;
  public double dblRoundVel2;
  public boolean blnrepaint = true;
  public boolean blnplay = false;
  // Constructor
  public void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D)g;
    // g2d.setColor(Color.WHITE);
    g2d.clearRect(0, 0, 800, 600);
    g2d.setColor(Color.BLACK);
    intstartx = 0;
    intstarty = 0;
    intendx = 320;
    intendy = 0;
    for(intCount = 0; intCount < 32; intCount++){
      g2d.drawLine(intstartx, intstarty, intendx, intendy);
      intstarty = intstarty + intheight;
      intendy = intendy + intheight;
    }
    intstartx = 0;
    intstarty = 0;
    intendx = 0;
    intendy = 320;
    for(intCount = 0; intCount < 32; intCount ++){
      g2d.drawLine(intstartx, intstarty, intendx, intendy);
      intstartx = intstartx + intheight;
      intendx = intendx + intheight;
    }
    // Draw Pucks
    g2d.setColor(Color.RED);
    g2d.fillOval(intPuck1X, intPuck1Y, 50, 50);
    g2d.setColor(Color.BLUE);
    g2d.fillOval(intPuck2X, intPuck2Y, 50, 50);
    // Calculations - puck 1 initial velocity
    g2d.setColor(Color.RED);
    dblVelocity1 = Math.sqrt(Math.pow(intVelocityX1, 2)+Math.pow(intVelocityY1, 2));
    dblRoundVel1 = Math.round(dblVelocity1*100.0)/100.0;
    g2d.drawString(Double.toString(dblRoundVel1)+" m/s", intPuck1X - 5, intPuck1Y - 5);
    // Calculations - puck 2 initial velocity
    g2d.setColor(Color.BLUE);
    dblVelocity2 = Math.sqrt(Math.pow(intVelocityX2, 2)+Math.pow(intVelocityY2, 2));
    dblRoundVel2 = Math.round(dblVelocity2*100.0)/100.0;
    g2d.drawString(Double.toString(dblRoundVel2)+" m/s", intPuck2X - 5, intPuck2Y - 5);
    if(blnplay == true){
      g2d.setColor(Color.RED);
      intPuck1X = intPuck1X + intVelocityX1;
      intPuck1Y = intPuck1Y - intVelocityY1;
      g2d.fillOval(intPuck1X, intPuck1Y, 50, 50);
      g2d.setColor(Color.BLUE);
      intPuck2X = intPuck2X + intVelocityX2;
      intPuck2Y = intPuck2Y - intVelocityY2;
      g2d.fillOval(intPuck2X, intPuck2Y, 50, 50);
    }
  }
  public JCollisions(){
    super();
  }
}
  