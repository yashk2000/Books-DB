import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import pojo.User;

class ULoginPage extends JFrame {
  ULoginPage() {
    JFrame Lframe = new JFrame();
      Lframe.setSize(300, 200);
      Lframe.setLocationRelativeTo(null); 
      Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      Lframe.setVisible(true);
    
    JPanel p3 = new JPanel(new GridLayout(3,3,5,5));
    JLabel LUname, LPassword;
    LUname = new JLabel("Enter Username: "); 
    LPassword = new JLabel("Enter Password: ");
    JTextField FUname = new JTextField();
    JPasswordField FPassword = new JPasswordField();
    
    
    JButton BSubmit = new JButton("Submit");
    JButton BExit = new JButton("Exit");
    BSubmit.setSize(50,50);
    BExit.setSize(50,50);
    
    p3.add(LUname);
    p3.add(FUname);
    p3.add(LPassword);
    p3.add(FPassword);
    p3.add(BSubmit);
    p3.add(BExit);  
    
    JPanel p4 = new JPanel(new BorderLayout());
    p4.add(new JLabel("Login Page"), BorderLayout.NORTH);
    p4.add(p3, BorderLayout.CENTER); 
    Lframe.add(p4, BorderLayout.CENTER);
    
    BExit.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e1){ 
         MainWindow mw = new MainWindow();
         Lframe.setVisible(false);
      }  
    });
    
    BSubmit.addActionListener(new ActionListener(){  
    	boolean flag=false;
      public void actionPerformed(ActionEvent e1){ 
    	  ArrayList<User> myList = new ArrayList<User>();
  		try {
  			Connection connection = DatabaseConnector.getConnection();
  			ResultSet re = connection.createStatement().executeQuery("select * from user");
  			while(re.next()) {
  				myList.add(new User(re.getString("username"),re.getString("password")));
  			}
  		}
  		catch(SQLException e) {
  			e.printStackTrace();
  		}
  		for(int i=0;i<myList.size();i++) {
  			if(myList.get(i).getUsername().equals(FUname.getText())&&myList.get(i).getPassword().equals(FPassword.getText())) {flag = true;}
  		}
  		if(flag==true) {
        UserFunctions user = new UserFunctions();
        Lframe.setVisible(false);
  		}
  		else {
  			JOptionPane.showMessageDialog(Lframe, "Wrong Credentials Contact Admin");
  		}
      }  
    });
  }
}
