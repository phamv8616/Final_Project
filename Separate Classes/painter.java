import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class painter{
	public static void main(String[] args){	
		JFrame frame = new JFrame("Paint It");	
		Container content = frame.getContentPane();		
		content.setLayout(new BorderLayout());		
		final PadDraw drawPad = new PadDraw();		
		content.add(drawPad, BorderLayout.CENTER);					
		
		
		frame.setSize(200,200);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLocation(150,150);
		buttonPanel.setLayout(new FlowLayout());
		panel.setLayout(new FlowLayout());	
		panel.setBackground(Color.white);
		buttonPanel.setLocation(500,500);
		
		frame.add(panel);
		frame.add(buttonPanel);
		
		Dimension d = new Dimension(100,80);
		
		Color myPurple = new Color(229,204,255);			
		JButton purple = new JButton();
		purple.setText("PURPLE");
		purple.setBackground(myPurple);
		purple.setPreferredSize(d);
		
		Color myBlue = new Color(204,230,255);
		JButton blue = new JButton();
		blue.setText("BLUE");
		blue.setBackground(myBlue);
		blue.setPreferredSize(d);
		
		Color myOrange = new Color(255,230,204);
		JButton orange = new JButton();
		orange.setText("ORANGE");
		orange.setBackground(myOrange);
		orange.setPreferredSize(d);
		
		buttonPanel.add(purple);
		buttonPanel.add(blue);
		buttonPanel.add(orange);
		
		
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
