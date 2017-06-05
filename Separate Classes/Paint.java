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
		buttonPanel.setPreferredSize(new Dimension(100,68));
		
		//buttons
		Dimension d = new Dimension(120,70);
		
		JButton buttonOne = new JButton();
		// buttonOne.setText("RED");
		buttonOne.setBackground(Color.red);
		buttonOne.setMaximumSize(d);
		buttonOne.setMinimumSize(d);
		buttonOne.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.red();
			}

		}
		);
		
		JButton buttonTwo = new JButton();
		// buttonTwo.setText("YELLOW");
		buttonTwo.setBackground(Color.yellow);
		buttonTwo.setMinimumSize(d);
		buttonTwo.setMaximumSize(d);
		buttonTwo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.yellow();
			}

		}
		);
		
		JButton buttonThree = new JButton();
		// buttonThree.setText("ORANGE");
		buttonThree.setBackground(Color.orange);
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
		// buttonFour.setText("GREEN");
		buttonFour.setBackground(Color.green);
		buttonFour.setMinimumSize(d);
		buttonFour.setMaximumSize(d);
		buttonFour.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.green();
			}

		}
		);
		
		JButton buttonFive = new JButton();
		// buttonFive.setText("BLUE");
		Color myBlue = new Color(30,144,255);
		buttonFive.setBackground(myBlue);
		buttonFive.setMinimumSize(d);
		buttonFive.setMaximumSize(d);
		buttonFive.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.blue();
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
				drawing.brushSize = 1;
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
	}
	
}

