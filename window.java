import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class window
{
	
	public static void main(String[]args)
	{
		JFrame window = new JFrame("JFrame");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		panel.setBackground(Color.white);
		
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
		buttonFive.setBackground(Color.blue);
		buttonFive.setPreferredSize(d);
	
		
		JButton buttonSix = new JButton();
		buttonSix.setText("PURPLE");
		Color myPurple = new Color(200,0,255);
		buttonSix.setBackground(myPurple);
		buttonSix.setPreferredSize(d);
		
		panel.add(buttonOne);
		panel.add(buttonThree);
		panel.add(buttonTwo);
		panel.add(buttonFour);
		panel.add(buttonFive);
		panel.add(buttonSix);
		
		
		
		window.add(panel);
		window.setSize(700,800);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}