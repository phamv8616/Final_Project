import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Paint
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame("Paint Program");
	
		Container container = frame.getContentPane();
		// content.setLayout(new BorderLayout());
		Draw drawing = new Draw();
		container.add(drawing);
		
		frame.setSize(700,750);
		// frame.setLocation(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		// panel1.setBounds(100, 100, 100, 140);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// JPanel panel2 = new JPanel();
		
		// panel1.setLayout(new FlowLayout());
		// panel2.setLayout(new FlowLayout());
		// panel.setPreferredSize(new Dimension(32,68));
		// panel.setMinimumSize(new Dimension(32,68));
		// panel.setMaximumSize(new Dimension(32,68));
		panel.setBackground(Color.white);
		
		//buttons
		Dimension d = new Dimension(150,200);
		
		JButton buttonOne = new JButton();
		buttonOne.setText("          RED            ");
		buttonOne.setBackground(Color.red);
		buttonOne.setPreferredSize(d);
		
		JButton buttonTwo = new JButton();
		buttonTwo.setText("       YELLOW       ");
		buttonTwo.setBackground(Color.yellow);
		buttonTwo.setPreferredSize(d);
		
		JButton buttonThree = new JButton();
		buttonThree.setText("       ORANGE       ");
		buttonThree.setBackground(Color.orange);
		buttonThree.setPreferredSize(d);
		
		JButton buttonFour = new JButton();
		buttonFour.setText("        GREEN          ");
		buttonFour.setBackground(Color.green);
		buttonFour.setPreferredSize(d);
		
		JButton buttonFive = new JButton();
		buttonFive.setText("          BLUE           ");
		Color myBlue = new Color(30,144,255);
		buttonFive.setBackground(myBlue);
		buttonFive.setPreferredSize(d);
		
		panel.add(buttonOne);
		panel.add(buttonThree);
		panel.add(buttonTwo);
		panel.add(buttonFour);
		panel.add(buttonFive);
		
		// panel2.add(drawing);
		
		// JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, panel2, panel1);
		// splitPane.setDividerLocation(10);
		
		frame.add(panel);
	}
}

