import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Draw extends JComponent
{
	Graphics2D graph2D;
	Image i;
	int firstX, firstY, secondX, secondY;
	
	public Draw()
	{
		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent a)
			{
				secondX = a.getX();
				secondX = a.getY();
			}
		});
		
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseDragged(MouseEvent a)
			{
				firstX = a.getX();
				firstY = a.getY();
				if(graph2D != null)
				{
					graph2D.drawLine(secondX, secondY, firstX, firstY);
					
					
				}
				repaint();
				secondX = firstX;
				secondY = firstY;
			
				
				// secondX = firstY;
				// secondY = firstX;
				// firstX= secondX;
				// firstY=secondY;
			}
		});
	}
	
	public void paintComponent(Graphics a)
	{
		if(i == null)
		{
			i = createImage(getSize().width, getSize().height);
			graph2D = (Graphics2D)i.getGraphics();
			graph2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			clear();
		}
		a.drawImage(i, 0, 0, null);
	}
	
	public void clear()
	{
		graph2D.setPaint(Color.white);
		graph2D.fillRect(0, 0, getSize().width, getSize().height);
		graph2D.setPaint(Color.black);
		repaint();
	}
}