import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*; 

class RegistrationPage extends JFrame {
	RegistrationPage() {
		JFrame Rframe = new JFrame();
		JPanel j = new JPanel(new GridLayout(7,2,5,5));
		JLabel l1,l2,l3,l4,l5,l6;
		l1 = new JLabel("Username");
		l1.setBounds(20,50, 100,30); 
		l2 = new JLabel("Password");
		l2.setBounds(20, 100, 100, 30);
		l3 = new JLabel("Gender");
		l3.setBounds(20, 150, 100, 30);
		l4 = new JLabel("Address");
		l4.setBounds(20,250,100,30);
		l5 = new JLabel("About you");
		l5.setBounds(20,300,100,30);
		l6 = new JLabel("Language Preference");
		l6.setBounds(20,600,250,30);
		
        JTextField t1,t2; 
        t1=new JTextField("Type your username");  
        t2=new JTextField("Fill your address");
        t1.setBounds(95,50, 200,30); 
        t2.setBounds(95,250, 200, 30);
        
        JPasswordField value = new JPasswordField();  
        value.setBounds(100,100,100,30);      
        
        JComboBox jcb1 = new JComboBox(new String[]{"Male", "Female"});

        JButton b1=new JButton("Submit");  
        b1.setBounds(50,700,95,30); 
        JDialog DSuccess = new JDialog(Rframe, "Confirmation", true); 
        JDialog DCancel = new JDialog(Rframe, "Cancellation", true);
        DSuccess.setLayout( new GridLayout() );  
        DCancel.setLayout(new FlowLayout());
        b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e1){  
				DSuccess.setVisible(true); 
				}  
			});  
        JButton b2=new JButton("Cancel");  
        b2.setBounds(200,700,95,30); 
        b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				DCancel.setVisible(true);
				}
			});
      
        JButton b3=new JButton("Exit");  
        b3.setBounds(350,700,95,30);
        b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				System.exit(0);
				}
			});
       
        DSuccess.add( new JLabel ("You have registered successfully!!!"));  
        DSuccess.setSize(300,300); 
        DCancel.add(new JLabel("Registration Cancelled"));
        DCancel.setSize(400,400);
        
        JTextArea area=new JTextArea("Type about yourself");  
        area.setBounds(100,310, 200,200);  
    
        JComboBox jcb2 = new JComboBox(new String[]{"Hindi", "English","French","Malayalam"});
        
        j.add(l1);
        j.add(t1);
		j.add(l2);
		j.add(value); 
		j.add(l3);
		j.add(jcb1);
		j.add(l4);
		j.add(t2);
		j.add(l5);
		j.add(area); 
		j.add(l6);
		j.add(jcb2);
		j.add(b1); 
        j.add(b2);
        
        JPanel p5 = new JPanel(new BorderLayout());
        p5.add(j, BorderLayout.CENTER);
        p5.add(b3, BorderLayout.SOUTH);  
         
        Rframe.add(p5, BorderLayout.CENTER);
        
        Rframe.setTitle("Registration Page");
        Rframe.setLocationRelativeTo(null); 
    	Rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Rframe.setSize(500,500);  
        Rframe.setVisible(true);       
	}
}
