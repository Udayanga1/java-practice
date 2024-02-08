// package myjavaapp;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener
{
	int x, y;
	String msg = " ";

	public MyFrame()
	{
		addMouseListener(this);
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString(msg, x, y);
		g.drawRect(100, 100, 100, 100);
		g.drawOval(100, 100, 100, 100);
		g.setColor(Color.blue);
		g.fillRect(150, 200, 100, 100);
	}

	// Event Handling methods
	@Override
	public void mouseClicked(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		msg = "Mouse Clicked at " + x + ", " + y;
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		msg = "Mouse pressed at " + x + ", " + y;
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		msg = "Mouse released at " + x + ", " + y;
		repaint();
	}

}
public class GUIDemo
{
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(() -> {
			MyFrame f1 = new MyFrame();
			
			f1.setSize(500, 500);
			f1.setTitle("My Frame");
			f1.setVisible(true);	
		});
	}
}