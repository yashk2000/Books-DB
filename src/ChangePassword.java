import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ChangePassword {
	ChangePassword(){
		JFrame Lframe = new JFrame();
	      Lframe.setSize(500, 400);
	      Lframe.setLocationRelativeTo(null); 
	      Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	      Lframe.setVisible(true);
	      JPanel p3 = new JPanel(new GridLayout(5,5,5,5));
	      
	      JLabel Lusername;
	      JTextField Tfusername;
	      JLabel Lpassword;
	      JPasswordField Tfpassword;
	      
	      Lusername = new JLabel("Enter username");
	      Lpassword = new JLabel("Enter new Password");
	      
	      Tfusername = new JTextField();
	      Tfpassword = new JPasswordField();
	      
	      
	      JButton BSubmit = new JButton("Submit");
	      JButton BCancel = new JButton("Cancel");
	      BSubmit.setSize(10,10);
	      BCancel.setSize(10,10);
	      
	      p3.add(Lusername);
	      p3.add(Tfusername);
	      p3.add(Lpassword);
	      p3.add(Tfpassword);
	      p3.add(BSubmit);
	      p3.add(BCancel);
	      
	      
	      JPanel p4 = new JPanel(new BorderLayout());
	      p4.add(new JLabel("Add Book"), BorderLayout.NORTH);
	      p4.add(p3, BorderLayout.CENTER);
	      Lframe.add(p4, BorderLayout.CENTER);
	     
	      BSubmit.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					AdminFunctions a1 = new AdminFunctions();
			          Lframe.setVisible(false);
			          Connection connection = DatabaseConnector.getConnection();
			             String sql = "update user set password = \""+Tfpassword.getText()+"\" WHERE username = \""+Tfusername.getText()+"\";\n" + 
			             		"";
			             Statement statement;
						try {
							statement = connection.createStatement();
							statement.executeUpdate(sql);
						} catch (SQLException b) {
							b.printStackTrace();
						}
						  AdminFunctions a2 = new AdminFunctions();
			        	  Lframe.setVisible(false);
			             
			          }  
				});
     BCancel.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			AdminFunctions a1 = new AdminFunctions();
	          Lframe.setVisible(false);
		}
    	 
     });
	}

	
}
