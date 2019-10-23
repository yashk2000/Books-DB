import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RemoveUser {
	

	RemoveUser(){
		JFrame Lframe = new JFrame();
	      Lframe.setSize(500, 400);
	      Lframe.setLocationRelativeTo(null); 
	      Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	      Lframe.setVisible(true);
	      JPanel p3 = new JPanel(new GridLayout(5,5,5,5));
	      JLabel Bname;
	      JTextField Tname;
	      
	      Bname = new JLabel("Enter username to delete");
	      Tname = new JTextField();
	      JButton BSubmit = new JButton("Submit");
	      JButton BCancel = new JButton("Cancel");
	      BSubmit.setSize(10,10);
	      BCancel.setSize(10,10);
	      
	      
	      p3.add(Bname);
	      p3.add(Tname);
	      p3.add(BSubmit);
	      p3.add(BCancel);
	      JPanel p4 = new JPanel(new BorderLayout());
	      p4.add(p3, BorderLayout.CENTER);
	      Lframe.add(p4, BorderLayout.CENTER);
	      
	      BSubmit.addActionListener(new ActionListener(){  
	          public void actionPerformed(ActionEvent e1){ 
	        	  Connection connection = DatabaseConnector.getConnection();
	        	  String sql = "DELETE FROM user WHERE username = \""+Tname.getText()+"\"";
	        	  Statement statement;
				try {
					statement = connection.createStatement();
					statement.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				   AdminFunctions a1 = new AdminFunctions();
			          Lframe.setVisible(false);
	        	  	          }  
	        });
	      BCancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				AdminFunctions a1 = new AdminFunctions();
		          Lframe.setVisible(false);
			}
	    	  
	      });
	      }

}
