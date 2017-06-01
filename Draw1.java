import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Draw1 extends JComponent
{
	Image image;
	Graphics2D graph2D;
	int currentX, currentY, oldX, oldY;

	public Draw1(){
		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				oldX = e.getX();
				oldY = e.getY();
			}
		});

		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseDragged(MouseEvent e)
			{
				currentX = e.getX();
				currentY = e.getY();
				if(graph2D != null)
				graph2D.drawLine(oldX, oldY, currentX, currentY);
				repaint();
				oldX = currentX;
				oldY = currentY;
			}

		});

	}

	public void paintComponent(Graphics g)
	{
		if(image == null)
		{
			image = createImage(getSize().width, getSize().height);
			graph2D = (Graphics2D)image.getGraphics();
			graph2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			start();
		}
		g.drawImage(image, 0, 0, null);
	}

	public void start()
	{
		graph2D.setPaint(Color.white);
		graph2D.fillRect(0, 0, getSize().width, getSize().height);
		graph2D.setPaint(Color.black);
		repaint();
	}
	// public void clear(){
		// graph2D.setPaint(Color.white);
		// graph2D.fillRect(0, 0, getSize().width, getSize().height);
		// graph2D.setPaint(Color.black);
		// repaint();
	// }
	
	public void black()
	{
		graph2D.setPaint(Color.black);
		
	}
	
	public void red()
	{
		graph2D.setPaint(Color.red);
		
	}
	
	public void orange()
	{
		graph2D.setPaint(Color.orange);
		
	}
	
	public void yellow()
	{
		graph2D.setPaint(Color.yellow);
		
	}
	
	public void green()
	{
		graph2D.setPaint(Color.green);
		
	}
	
	public void blue()
	{
		Color myBlue = new Color(30,144,255);
		graph2D.setPaint(myBlue);
		
	}
}
