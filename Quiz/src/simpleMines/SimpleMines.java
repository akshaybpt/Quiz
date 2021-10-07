package simpleMines;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMines extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField t1;
	SimpleMines()
	{
		 setBounds(400, 200, 1200, 500); // dleft, //dup // length, height ///////
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg"));
	        JLabel l0 = new JLabel(i1);
	        l0.setBounds(0, 0, 600, 500);
	        add(l0);
	        
		JLabel l1=new JLabel("Simple Mines");
		l1.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
		l1.setForeground(new Color(30,144,254));
		l1.setBounds(750, 60, 300, 45);
		add(l1);
		
		JLabel l2=new JLabel("Enter your name");
		l2.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
		l2.setForeground(new Color(30,144,254));
		l2.setBounds(810, 150, 300, 20);
		add(l2);
		
		t1=new JTextField();
		t1.setBounds(735, 200, 300, 25);
		t1.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(t1);
		
		b1=new JButton("Next");
		b1.setFont(new Font("Times New Roman",Font.BOLD,15));
		b1.setBounds(735, 270, 120, 25);
		b1.setBackground(new Color(30,144,254));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Exit");
		b2.setFont(new Font("Times New Roman",Font.BOLD,15));
		b2.setBounds(915, 270, 120, 25);
		b2.setBackground(new Color(30,144,254));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2); 
	
	setVisible(true);
	

}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==b1) {
			String name= t1.getText();
			this.setVisible(false);
			new Rules(name);
		}
		else 
			System.exit(0);
	}
public static void main(String [] agrs)
{
	new SimpleMines();
	}
}
