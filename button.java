import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class button{
	public static void main(String[] args){
		JFrame frame = new JFrame("Button");
		frame.setSize(800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());	
		panel.setBackground(Color.white);
		
		frame.add(panel);	
		
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
		
		Color myPink = new Color(255,204,230);
		JButton pink = new JButton();
		pink.setText("PINK");
		pink.setBackground(myPink);
		pink.setPreferredSize(d);
		
		Color myYellow = new Color(255,255,204);
		JButton yellow = new JButton();
		yellow.setText("YELLOW");
		yellow.setBackground(myYellow);
		yellow.setPreferredSize(d);		
		
		panel.add(purple);
		panel.add(blue);
		panel.add(orange);
		panel.add(pink);
		panel.add(yellow);
		
		
		
	}
}
