import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*; 

class UserLoginPage extends JFrame {
	UserLoginPage() {
		JFrame Lframe = new JFrame();
    	Lframe.setSize(300, 200);
    	Lframe.setLocationRelativeTo(null); 
    	Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    	Lframe.setVisible(true);
		
		JPanel p3 = new JPanel(new GridLayout(3,3,5,5));
		JLabel LUname, LPassword;
		LUname = new JLabel("Enter Username: "); 
		LPassword = new JLabel("Enter Password: ");
		JTextField FUname = new JTextField("Type your username");
		JPasswordField FPassword = new JPasswordField();
		
		
		JButton BSubmit = new JButton("Submit");
		JButton BLogin = new JButton("Don't have an account?");
		BSubmit.setSize(50,50);
		BLogin.setSize(50,50);
		
		p3.add(LUname);
		p3.add(FUname);
		p3.add(LPassword);
		p3.add(FPassword);
		p3.add(BSubmit);
		p3.add(BLogin);	
		
		JPanel p4 = new JPanel(new BorderLayout());
		p4.add(new JLabel("Login Page"), BorderLayout.NORTH);
		p4.add(p3, BorderLayout.CENTER); 
		Lframe.add(p4, BorderLayout.CENTER);
		
		BLogin.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e1){ 
		  	RegistrationPage r = new RegistrationPage();
		  	Lframe.setVisible(false);
			}  
		});
		
		BSubmit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e1){ 
            UserFunctions ufp = new UserFunctions();
		  	Lframe.setVisible(false);
			}  
		});		
	}
}
