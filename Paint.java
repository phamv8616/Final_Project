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
		container.add(drawing);
	
		
		frame.setSize(700,750);
		frame.setLocation(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel buttonPanel = new JPanel();
		// panel1.setBounds(100, 100, 100, 140);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		buttonPanel.setPreferredSize(new Dimension(500,500));
		
		// panel1.setLayout(new FlowLayout());
		// panel2.setLayout(new FlowLayout());
		// panel.setPreferredSize(new Dimension(32,68));
		// panel.setMinimumSize(new Dimension(32,68));
		// panel.setMaximumSize(new Dimension(32,68));
		// panel1.setBackground(Color.white);
		
		//buttons
		Dimension d = new Dimension(250,500);
		
		JButton buttonOne = new JButton();
		// buttonOne.setText("RED");
		buttonOne.setBackground(Color.red);
		buttonOne.setPreferredSize(d);
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
		buttonTwo.setPreferredSize(d);
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
		buttonThree.setPreferredSize(d);
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
		buttonFour.setPreferredSize(d);
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
		buttonFive.setPreferredSize(d);
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
		buttonSix.setPreferredSize(d);
		buttonSix.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.black();
			}

		}
		);
		
		JButton buttonSeven = new JButton();
		JLabel clear = new JLabel("Clear");
		buttonSeven.add(clear);
		buttonSeven.setBackground(Color.white);
		buttonSeven.setPreferredSize(d);
		buttonSeven.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				drawing.start();
			}

		}
		);
		
		buttonPanel.add(buttonOne);
		buttonPanel.add(buttonThree);
		buttonPanel.add(buttonTwo);
		buttonPanel.add(buttonFour);
		buttonPanel.add(buttonFive);
		buttonPanel.add(buttonSix);
		buttonPanel.add(buttonSeven);
		
		container.setLayout(new GridLayout(1,2));
		container.add(buttonPanel);
	}
	
}

