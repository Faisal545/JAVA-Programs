import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Gui
{
	
		public static void main(String args[])
		{
			 String Firstno;
			 String Secondno;
			 String op;
			 
			
			JFrame frm= new JFrame("Calculator");
			//frm.setSize(800,800);
			//frm.setVisible(true);
		
			frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
			
			JTextField textfield= new JTextField("");
			textfield.setBounds(10,20,400,50);
			frm.add(textfield);
			
			
	
			JButton b1= new JButton("7");
			JButton b2= new JButton("8");
			JButton b3= new JButton("9");
			JButton b4= new JButton("/");
			JButton b5= new JButton("4");
			JButton b6= new JButton("5");
			JButton b7= new JButton("6");
			JButton b8= new JButton("*");
			JButton b9= new JButton("1");
			JButton b10= new JButton("2");
			JButton b11= new JButton("3");
			JButton b12= new JButton("-");
			JButton b13= new JButton(".");
			JButton b14= new JButton("=");
			JButton b15= new JButton("0");
			JButton b16= new JButton("+");//16

			
			JButton b17= new JButton("Clear");
			JButton b18= new JButton("AllClear");

			
		
		
			b1.setBounds(80,90,50,40); // 20 spaces for btn 1.& 10 spaces textfield horizontal & 50 Height ,, Total ## 90 spaces . 
			b2.setBounds(140,90,50,40);
			b3.setBounds(200,90,50,40);
			b4.setBounds(260,90,50,40); //
			
			b5.setBounds(80,150,50,40);	//
			b6.setBounds(140,150,50,40);
			b7.setBounds(200,150,50,40);
			b8.setBounds(260,150,50,40);

			b9.setBounds(80,210,50,40);	//
			b10.setBounds(140,210,50,40);
			b11.setBounds(200,210,50,40);
			b12.setBounds(260,210,50,40);

			b13.setBounds(80,270,50,40);	//
			b14.setBounds(140,270,50,40);
			b15.setBounds(200,270,50,40);
			b16.setBounds(260,270,50,40);

			b17.setBounds(80,350,105,40);
			b18.setBounds(200,350,105,40);

			frm.add(b1);
			frm.add(b2);
			frm.add(b3);
			frm.add(b4);
			
			frm.add(b5);
			frm.add(b6);
			frm.add(b7);
			frm.add(b8);
		
			frm.add(b9);
			frm.add(b10);
			frm.add(b11);
			frm.add(b12);
	
			frm.add(b13);
			frm.add(b14);
			frm.add(b15);
			frm.add(b16);

			frm.add(b17);
			frm.add(b18);
			
			frm.setLayout(null);
			frm.setSize(440, 500);
			frm.setVisible(true);
			
			
			
			b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 7);
			}
			});
			
			b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 8);
			}
			});
			
			b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 9);
			}
			});
			
			
			b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + "/");
			}
			});
			
			b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 4);
			}
			});
			
			b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 5);
			}
			});
			
			b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 6);
			}
			});
			
			b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + "*");
			}
			});
			
			b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 1);
			}
			});
			
			b10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 2);
			}
			});
			
			b11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 3);
			}
			});
			
			b12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + "-");
			}
			});
			
			b13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + ".");
			}
			});
			
			b14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + "=");
			}
			});
			
			b15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + 0);
			}
			});
			
			
			b16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textfield.setText(textfield.getText() + "+");
				
			//	Firstno=textfield.getText();
				//op="+";
				
				
			}
			});
			
			b17.addActionListener(new ActionListener(){			// b17 for Clear button.
			public void actionPerformed(ActionEvent e){
				String s = textfield.getText();
				if(s.length() > 0)
				{
					//int lengths = s.length()-1;
					textfield.setText(s.substring(0,s.length()-1));
				}
			}
			});
			b18.addActionListener(new ActionListener(){ 		// b18 to ALLclear textfield.   
			public void actionPerformed(ActionEvent e){
				textfield.setText("");   //  textfield.setText(null);
			}
			});
			
			
			/* JButton b = new JButton("Clear");
			b18. addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			textfield. setText("");
			//textfield.setText(null); //or use this.	
			}
			});  */
			
			
			
			//frm.setSize(600, 400);
		
		
		
		}


}								
											////////////////*

			//      Below code is just for Eclipse Calculator   operands code and operator code.
			




		/*	\
		
				For ArithmeticOperators       "+" 
				
				String FirstNo;
				String SecondNo;
				String Operator;
				
										FirstNo=textField.getText();
										Operator="";
										textField.setText("");


									SecondNo=textField.getText();
										if( Operator.equals("+") )
										{
											Double res= Double.parseDouble(FirstNo) + Double.parseDouble(SecondNo);
											textField.setText(res.toString);
										
										}
											



















