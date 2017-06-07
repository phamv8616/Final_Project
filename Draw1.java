import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Draw1 extends JComponent
{
	Image image;
	Graphics2D graph2D;
	int currentX, currentY, oldX, oldY;
	static int brushSize=2;

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
				graph2D.setStroke(new BasicStroke(brushSize));
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
	
	public void rectangle()
	{
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseDragged(MouseEvent e)
			{
				graph2D.setStroke(new BasicStroke(brushSize));
				currentX = e.getX();
				currentY = e.getY();
				if(graph2D != null)
				repaint();
				// oldX = currentX;
				// oldY = currentY;
			}

		});
	}

	public void black()
	{
		graph2D.setPaint(Color.black);
		
	}
	
	public void purple()
	{
		Color myPurple = new Color(229,204,255);
		graph2D.setPaint(myPurple);
		
	}
	
	public void blue()
	{
		Color myBlue = new Color(204,230,255);
		graph2D.setPaint(myBlue);
		
	}
	
	public void orange()
	{
		Color myOrange = new Color(255,230,204);
		graph2D.setPaint(myOrange);
		
	}
	
	public void pink()
	{
		Color myPink = new Color(255,204,230);
		graph2D.setPaint(myPink);
		
	}
	
	public void yellow()
	{
		Color myYellow = new Color(255,255,204);
		graph2D.setPaint(myYellow);
		
	}
	
	public void eraser()
	{
		graph2D.setPaint(Color.white);
	}
}
