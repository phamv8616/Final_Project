import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Paint 
{
	Graphics2D graph2D;
	
	public static void main(String[]args)
	{
		JFrame frame = new JFrame("Paint Program");
	
		Container container = frame.getContentPane();
		container.setLayout(new BorderLayout());
		Draw1 drawing = new Draw1();
	
		frame.setResizable(true);
		frame.setSize(900,800);
		frame.setLocation(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		buttonPanel.setPreferredSize(new Dimension(100,100));
		
		JPanel panel2 = new JPanel();
		
		//buttons
		Dimension d = new Dimension(120,70);
		
		JButton buttonOne = new JButton();
		Color myPurple = new Color(229,204,255); 
		buttonOne.setBackground(myPurple);
		buttonOne.setMaximumSize(d);
		buttonOne.setMinimumSize(d);
		buttonOne.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.purple();
			}

		}
		);
		
		JButton buttonTwo = new JButton();
		Color myBlue = new Color(204,230,255);
		buttonTwo.setBackground(myBlue);
		buttonTwo.setMinimumSize(d);
		buttonTwo.setMaximumSize(d);
		buttonTwo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.blue();
			}

		}
		);
		
		JButton buttonThree = new JButton();
		Color myOrange = new Color(255,230,204);
		buttonThree.setBackground(myOrange);
		buttonThree.setMinimumSize(d);
		buttonThree.setMaximumSize(d);
		buttonThree.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.orange();
			}

		}
		);
		
		JButton buttonFour = new JButton();
		Color myPink = new Color(255,204,230);
		buttonFour.setBackground(myPink);
		buttonFour.setMinimumSize(d);
		buttonFour.setMaximumSize(d);
		buttonFour.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.pink();
			}

		}
		);
		
		JButton buttonFive = new JButton();
		Color myYellow = new Color(255,255,204);
		buttonFive.setBackground(myYellow);
		buttonFive.setMinimumSize(d);
		buttonFive.setMaximumSize(d);
		buttonFive.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.yellow();
			}

		}
		);
		
		JButton buttonSix = new JButton();
		buttonSix.setBackground(Color.black);
		buttonSix.setMinimumSize(d);
		buttonSix.setMaximumSize(d);
		buttonSix.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.black();
			}

		}
		);
		
		JButton buttonSeven = new JButton("Clear");
		buttonSeven.setBackground(Color.white);
		buttonSeven.setMinimumSize(d);
		buttonSeven.setMaximumSize(d);
		buttonSeven.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.start();
			}

		}
		);
		
		JButton eraser = new JButton("Eraser");
		eraser.setBackground(Color.white);
		eraser.setMinimumSize(d);
		eraser.setMaximumSize(d);
		eraser.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.eraser();
			}

		}
		);
		
		
		ImageIcon one = new ImageIcon("brush1.jpg");
		JButton brushOne = new JButton(one);
		brushOne.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.brushSize = 2;
			}

		}
		);
		
		ImageIcon two = new ImageIcon("brush2.jpg");
		JButton brushTwo = new JButton(two);
		brushTwo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.brushSize = 5;
			}

		}
		);
		
		ImageIcon three = new ImageIcon("brush3.jpg");
		JButton brushThree = new JButton(three);
		brushThree.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.brushSize = 10;
			}

		}
		);
		
		buttonPanel.add(buttonOne);
		buttonPanel.add(buttonThree);
		buttonPanel.add(buttonTwo);
		buttonPanel.add(buttonFour);
		buttonPanel.add(buttonFive);
		buttonPanel.add(buttonSix);
		buttonPanel.add(eraser);
		buttonPanel.add(buttonSeven);
		buttonPanel.add(brushOne);
		buttonPanel.add(brushTwo);
		buttonPanel.add(brushThree);
		
		container.add(buttonPanel, BorderLayout.WEST);
		container.add(drawing, BorderLayout.CENTER);
		container.add(panel2, BorderLayout.EAST);
	}
	
}

