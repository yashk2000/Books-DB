import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*; 

class AdminLoginPage extends JFrame {
	AdminLoginPage() {
		JFrame Lframe = new JFrame();
    	Lframe.setSize(300, 200);
    	Lframe.setLocationRelativeTo(null); 
    	Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    	Lframe.setVisible(true);
		
		JPanel p3 = new JPanel(new GridLayout(2,2,5,5));
		JLabel LUname, LPassword;
		LUname = new JLabel("Enter Username: "); 
		LPassword = new JLabel("Enter Password: ");
		JTextField FUname = new JTextField("Type your username");
		JPasswordField FPassword = new JPasswordField();
		p3.add(LUname);
		p3.add(FUname);
		p3.add(LPassword);
		p3.add(FPassword);
		
		JButton BSubmit = new JButton("Login");
		BSubmit.setSize(50,50);
		
		JPanel p4 = new JPanel(new BorderLayout());
		p4.add(new JLabel("Login Page"), BorderLayout.NORTH);
		p4.add(p3, BorderLayout.CENTER);
		p4.add(BSubmit,BorderLayout.SOUTH); 
		Lframe.add(p4, BorderLayout.CENTER);	
		
		BSubmit.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e1){ 
		  	AdminFunctions admin = new AdminFunctions();
		  	Lframe.setVisible(false);
			}  
		});
				
	}
} 
