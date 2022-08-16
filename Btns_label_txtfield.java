import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Btns_label_txtfield
{
	public static void main(String args[])
	{
		
	JFrame frm=new JFrame("First GUiiii");
	frm.setSize(650,350); // width , height.
	
	frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
	
	JButton b1=new JButton("One");
	JButton b2=new JButton("Two");
	JButton b3=new JButton("Three");
	JButton b4=new JButton("Four");
	
	b1.setBounds(50,170,70,50);// horizontal , vertical , width, height.
	b2.setBounds(140,170,70,50);
	b3.setBounds(230,170,70,50);
	b4.setBounds(320,170,70,50);
	
	frm.add(b1);
	frm.add(b2);
	frm.add(b3);
	frm.add(b4);
	
	
	//frm.setLayout(null);
	//frm.setVisible(true);
	
	JLabel lbl1 =new JLabel("Open 1");
	lbl1.setBounds(50,100,80,50); //100,30,200,50 size of textfield.
	frm.add(lbl1);
	
	JLabel lbl2 =new JLabel("Open 2");
	lbl2.setBounds(150,100,80,50);
	frm.add(lbl2);
	
	JLabel lbl3 =new JLabel("Open 3");
	lbl3.setBounds(250,100,80,50);
	frm.add(lbl3);
	
	//frm.setLayout(new FlowLayout());
	//frm.setVisible(true);
	//frm.setVisible(true);
	
	
	
	b1.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lbl1.setText("I'm Clicked 1");
		}
		
		
	});
	b2.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent x)
		{
			lbl2.setText("I'm Clicked 2");
		}
		
		
	});
	b3.addActionListener( new ActionListener()
	{
		public void actionPerformed(ActionEvent y)
		{
			lbl3.setText("I'm Clicked 3");
		}
		
		
	});
	
	JTextField  textfield = new JTextField("    "); // First Text Field
        textfield.setBounds(60,30,230,50);
        frm.add(textfield);
	
	b4.addActionListener( new ActionListener ()
	{
		public void actionPerformed(ActionEvent e )
		{
			textfield.setText("I'm Clicked 4");
			
		}
		
	});
	
		
       
		//frm.setSize(550,350); // width , height.
        frm.setLayout(null);
        frm.setVisible(true);
	



	
	
	
	
	}
}









