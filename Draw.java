import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class draw{
	public static void main(String[] args){	
		JFrame frame = new JFrame("Paint It");	
		Container content = frame.getContentPane();		
		content.setLayout(new BorderLayout());		
		final PadDraw drawPad = new PadDraw();		
		content.add(drawPad, BorderLayout.CENTER);					
		
		frame.setSize(800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());	
		panel.setBackground(Color.white);
		panel.setPreferredSize(new Dimension(32, 68));
		panel.setMinimumSize(new Dimension(32, 68));
		panel.setMaximumSize(new Dimension(32, 68));
		
		frame.add(panel);	
		panel.setPreferredSize(new Dimension(32, 68));
		panel.setMinimumSize(new Dimension(32, 68));
		panel.setMaximumSize(new Dimension(32, 68));	
		
	}
}

class PadDraw extends JComponent{
	Image image;
	Graphics2D graphics2D;
	int currentX, currentY, oldX, oldY;

	public PadDraw(){
		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				oldX = e.getX();
				oldY = e.getY();
			}
		});

		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				currentX = e.getX();
				currentY = e.getY();
				if(graphics2D != null)
				graphics2D.drawLine(oldX, oldY, currentX, currentY);
				repaint();
				oldX = currentX;
				oldY = currentY;
			}

		});

	}

	public void paintComponent(Graphics g){
		if(image == null){
			image = createImage(getSize().width, getSize().height);
			graphics2D = (Graphics2D)image.getGraphics();
			graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			clear();
		}
		g.drawImage(image, 0, 0, null);
	}

	public void clear(){
		graphics2D.setPaint(Color.white);
		graphics2D.fillRect(0, 0, getSize().width, getSize().height);
		graphics2D.setPaint(Color.black);
		repaint();
	}

}
