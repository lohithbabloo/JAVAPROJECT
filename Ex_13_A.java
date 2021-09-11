/*
Write a java program to paint like a paint brush in applet 
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Ex_13_A extends Applet implements MouseMotionListener{
    public void init(){
        addMouseMotionListener(this);
        setBackground(Color.BLACK);
    }
    public void mouseDragged(MouseEvent me)
    {
        Graphics g = getGraphics();
        g.setColor(Color.WHITE);
        g.fillOval(me.getX(),me.getY(), 10, 5);
    }
    public void mouseMoved(MouseEvent me)
    {

    }
}
