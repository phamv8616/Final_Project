import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Paint
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame("Paint Program");
		//drawing
		Container content = frame.getContentPane();
		content.setLayout(new BorderLayout());
		Draw drawPad = new Draw();
		content.add(drawPad);
		
		frame.setSize(800,500);
		// frame.setLocation(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		// panel.setPreferredSize(new Dimension(32,68));
		// panel.setMinimumSize(new Dimension(32,68));
		// panel.setMaximumSize(new Dimension(32,68));
		panel.setBackground(Color.white);
		
		//buttons
		Dimension d = new Dimension(100,80);
		
		JButton buttonOne = new JButton();
		buttonOne.setText("RED");
		buttonOne.setBackground(Color.red);
		buttonOne.setPreferredSize(d);
		
		JButton buttonTwo = new JButton();
		buttonTwo.setText("YELLOW");
		buttonTwo.setBackground(Color.yellow);
		buttonTwo.setPreferredSize(d);
		
		JButton buttonThree = new JButton();
		buttonThree.setText("ORANGE");
		buttonThree.setBackground(Color.orange);
		buttonThree.setPreferredSize(d);
		
		JButton buttonFour = new JButton();
		buttonFour.setText("GREEN");
		buttonFour.setBackground(Color.green);
		buttonFour.setPreferredSize(d);
		
		JButton buttonFive = new JButton();
		buttonFive.setText("BLUE");
		Color myBlue = new Color(30,144,255);
		buttonFive.setBackground(myBlue);
		buttonFive.setPreferredSize(d);
		
		panel.add(buttonOne);
		panel.add(buttonThree);
		panel.add(buttonTwo);
		panel.add(buttonFour);
		panel.add(buttonFive);
		frame.add(panel);
	}
}

