import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;

public class CollisionAnimation implements ActionListener, MouseListener, MouseMotionListener, KeyListener, ChangeListener{
  // Properties
  public JFrame theframe;
  public JCollisions thepanel;
  public Timer thetimer;
  public JLabel puck1mass;
  public JLabel puck2mass;
  public JLabel puck1velx;
  public JLabel puck1vely;
  public JLabel puck2velx;
  public JLabel puck2vely;
  public JSlider puck1slider;
  public JSlider puck2slider;
  public JTextField puck1text;
  public JTextField puck2text;
  public JTextField puck1vx;
  public JTextField puck1vy;
  public JTextField puck2vx;
  public JTextField puck2vy;
  public JButton playbut;
  public JButton stopbut;
  
  public void actionPerformed(ActionEvent evt){
    if(thepanel.blnrepaint == true){
      if(evt.getSource() == thetimer){
        thepanel.repaint();
      }
    }
    if(evt.getSource() == puck1text){
      puck1slider.setValue(Integer.parseInt(puck1text.getText()));
    }
    if(evt.getSource() == puck1vx){
        thepanel.intVelocityX1 = Integer.parseInt(puck1vx.getText());
        System.out.println(thepanel.intVelocityX1);
    }
    if(evt.getSource() == puck1vy){
      thepanel.intVelocityY1 = Integer.parseInt(puck1vy.getText());
      System.out.println(thepanel.intVelocityY1);
      // System.out.println("total"+thepanel.intVelocity);
    }
    if(evt.getSource() == puck2vx){
      thepanel.intVelocityX2 = Integer.parseInt(puck2vx.getText());
      System.out.println("Entered Value for vy: "+thepanel.intVelocityX2);
    }
    if(evt.getSource() == puck2vy){
      thepanel.intVelocityY2 = Integer.parseInt(puck2vy.getText());
      System.out.println("Entered Value for vy: "+thepanel.intVelocityY2);
    }
    if(evt.getSource() == playbut){
      thepanel.blnplay = true;
    }
    if(evt.getSource() == stopbut){
      thepanel.blnplay = false;
    }
  }
  
  public void mousePressed(MouseEvent evt){
  }
  
  public void mouseReleased(MouseEvent evt){
  }
  
  public void mouseClicked(MouseEvent evt){
    System.out.println("mouse clicked");
  }
  
  public void mouseExited(MouseEvent evt){
  }
  
  public void mouseEntered(MouseEvent evt){
  }
  
  public void mouseDragged(MouseEvent evt){
    // System.out.println("mouse dragged (" + evt.getX() + "," + evt.getY() + ")");
    if(evt.getX() >= thepanel.intPuck1X && evt.getX() <= thepanel.intPuck1X + 50 && evt.getY() >= thepanel.intPuck1Y && evt.getY() <= thepanel.intPuck1Y + 50){
      thepanel.intPuck1X = evt.getX()- 25;
      thepanel.intPuck1Y = evt.getY() - 25;
    }else if(evt.getX() >= thepanel.intPuck2X && evt.getX() <= thepanel.intPuck2X + 50 && evt.getY() >= thepanel.intPuck2Y && evt.getY() <= thepanel.intPuck2Y + 50){
      thepanel.intPuck2X = evt.getX()- 25;
      thepanel.intPuck2Y = evt.getY() - 25;
    }
  }
  
  public void mouseMoved(MouseEvent evt){
  }
  
  public void keyPressed(KeyEvent evt){
  }
  
  public void keyReleased(KeyEvent evt){
  }
  
  public void keyTyped(KeyEvent evt){
  }
  
  public void stateChanged(ChangeEvent evt){
    JSlider source = (JSlider)evt.getSource();
    if((JSlider)evt.getSource() == puck1slider){
      puck1text.setText(Integer.toString(source.getValue()));
      if(!source.getValueIsAdjusting()){
        System.out.println(source.getValue() + " key released");
      }
    }else if((JSlider)evt.getSource() == puck2slider){
      puck2text.setText(Integer.toString(source.getValue()));
      if(!source.getValueIsAdjusting()){
        System.out.println(source.getValue() + " key released");
      }
    }
  }
  
  // Constructor
  public CollisionAnimation(){
    theframe = new JFrame("2DCollisions");
    theframe.setSize(800, 600);
    
    thepanel = new JCollisions();
    thepanel.setLayout(null);
    thepanel.addMouseListener(this);
    thepanel.addMouseMotionListener(this);
    theframe.addKeyListener(this);
    thepanel.setBackground(Color.WHITE);
    theframe.setContentPane(thepanel);
        
    puck1mass = new JLabel("mass 1 (kg)", JLabel.CENTER);
    puck1mass.setSize(100, 50);
    puck1mass.setLocation(400, 25);
    thepanel.add(puck1mass);
    
    puck2mass = new JLabel("mass 2 (kg)");
    puck2mass.setSize(100, 50);
    puck2mass.setLocation(600, 25);
    thepanel.add(puck2mass);
    
    puck1velx = new JLabel("horizontal velocity (m/s)");
    puck1velx.setSize(100, 50);
    puck1velx.setLocation(400, 150);
    thepanel.add(puck1velx);
    
    puck1vely = new JLabel("vertical velocity (m/s)");
    puck1vely.setSize(100, 50);
    puck1vely.setLocation(400, 200);
    thepanel.add(puck1vely);
    
    puck1slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 1);
    puck1slider.addChangeListener(this);
    puck1slider.setMajorTickSpacing(5);
    puck1slider.setMinorTickSpacing(1);
    puck1slider.setPaintTicks(true);
    puck1slider.setPaintLabels(true);
    puck1slider.setSize(100, 50);
    puck1slider.setLocation(400, 60);
    thepanel.add(puck1slider);
        
    puck2slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 1);
    puck2slider.addChangeListener(this);
    puck2slider.setMajorTickSpacing(5);
    puck2slider.setMinorTickSpacing(1);
    puck2slider.setPaintTicks(true);
    puck2slider.setPaintLabels(true);
    puck2slider.setSize(100, 50);
    puck2slider.setLocation(600, 60);
    thepanel.add(puck2slider);
    
    puck1text = new JTextField("1");
    puck1text.setSize(25, 25);
    puck1text.setLocation(500, 45);
    puck1text.addActionListener(this);
    thepanel.add(puck1text);
    
    puck2text = new JTextField("1");
    puck2text.setSize(25, 25);
    puck2text.setLocation(700, 45);
    puck2text.addActionListener(this);
    thepanel.add(puck2text);
    
    puck1vx = new JTextField("0");
    puck1vx.setSize(25, 25);
    puck1vx.setLocation(500, 125);
    puck1vx.addActionListener(this);
    thepanel.add(puck1vx);
    
    puck1vy = new JTextField("0");
    puck1vy.setSize(25, 25);
    puck1vy.setLocation(500, 200);
    puck1vy.addActionListener(this);
    thepanel.add(puck1vy);
    
    puck2vx = new JTextField("0");
    puck2vx.setSize(25, 25);
    puck2vx.setLocation(700, 125);
    puck2vx.addActionListener(this);
    thepanel.add(puck2vx);
    
    puck2vy = new JTextField("0");
    puck2vy.setSize(25, 25);
    puck2vy.setLocation(700, 200);
    puck2vy.addActionListener(this);
    thepanel.add(puck2vy);
    
    playbut = new JButton("Play");
    playbut.setSize(75, 50);
    playbut.setLocation(50, 500);
    playbut.addActionListener(this);
    thepanel.add(playbut);
    
    stopbut = new JButton("Stop");
    stopbut.setSize(75, 50);
    stopbut.setLocation(125, 500);
    stopbut.addActionListener(this);
    thepanel.add(stopbut);
 
    theframe.setVisible(true);
    
    thetimer = new Timer(1000/30, this);
    thetimer.start();
  }
  
  public static void main(String[] args){
    CollisionAnimation proj = new CollisionAnimation();
  }
}