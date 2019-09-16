import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*; 

public class UserFunctions {
	UserFunctions() {
		JFrame Mframe = new JFrame();
		Mframe.setTitle("Welcome");
		Mframe.setSize(300, 200);
    	Mframe.setLocationRelativeTo(null); 
    	Mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Mframe.setVisible(true);
		
		JLabel l1 = new JLabel("Choose:");
		JButton BAdmin,BUser, BExit;
		BAdmin = new JButton("Buy");
		BUser = new JButton("Book Details");
		BExit = new JButton("Exit");

		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,2,20,50)) ;
		p1.setBounds(30,30,30,30);
		p1.add(BAdmin);
		p1.add(BUser);
		

		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.setBounds(30,30,30,30);
		p2.add(l1, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		p2.add(BExit, BorderLayout.SOUTH);
		Mframe.add(p2, BorderLayout.CENTER);
    }
} 
 
