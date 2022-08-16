import java.awt.*; // flow layout
import java.awt.event.*;
import javax.swing.*;

public class ActionEventExample
{
    public static void main(String args[])
    {
       JFrame f = new JFrame("ActionListener example");
             f.setSize(400,500);

	//  f.setLayout(new FlowLayout());
	
	JTextField jtf = new JTextField("");       
	jtf.setBounds(50,50,150,20);
	
	JButton b0 = new JButton("Click 0");
	b0.setBounds(80,100,120, 40);
	
	JButton b1= new JButton("Click 1");
	b1.setBounds(80,160,120,40);


	JButton b2= new JButton("Click 2");
	b2.setBounds(80,220,120,40);

	JButton b3= new JButton("Click 3");
	b3.setBounds(220,100,120,40);

	JButton b4= new JButton("Click 4");
	b4.setBounds(220,160,120,40);
	
	JButton b5= new JButton("Click 5");
	b5.setBounds(220,220,120,40);

	JLabel lb= new JLabel("Label lbl");	///
	lb.setBounds(55,7,180,15);

	f.add(jtf);
	f.add(b0);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(lb);

	
	//lb.setText(" Updated");
	     
	b0.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent w)
		{
			b0.setText("Button Clicked");
		}

	});
		
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lb.setText("Label Clicked");
		}

	});   	

	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent y)
		{
			jtf.setText("TextField Clicked");
		}

	});

	b3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent y)
		{
			b0.setText("Click 0");
		}

	});
	
	b4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent y)
		{
			lb.setText("Label lbl");
		}

	});  
		
	b5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent y)
		{
			jtf.setText(null);
		}

	});


       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
       f.setLayout(null);
       f.setVisible(true);
    }
}