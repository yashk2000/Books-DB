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
import javax.swing.JTextField;

public class AddBook extends JFrame {
	
	AddBook(){
		  JFrame Lframe = new JFrame();
	      Lframe.setSize(500, 400);
	      Lframe.setLocationRelativeTo(null); 
	      Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	      Lframe.setVisible(true);
	      JPanel p3 = new JPanel(new GridLayout(5,5,5,5));
	      JLabel LBookName, LCategory, LStock;
	      LBookName = new JLabel("Enter Name of The Book");
	      LCategory = new JLabel("Select Category of The Book");
	      LStock = new JLabel("Enter Stock");
	      JTextField Tname = new JTextField();
	      JTextField TStock = new JTextField();
	      JComboBox Ccategory =  new JComboBox(new String[]{"Science Fiction", "Mystery","Fiction","Non-Fiction","Fantasy","Romance"});
	      JButton BSubmit = new JButton("Submit");
	      JButton BCancel = new JButton("Cancel");
	      BSubmit.setSize(10,10);
	      BCancel.setSize(10,10);
	      p3.add(LBookName);
	      p3.add(Tname);
	      p3.add(LCategory);
	      p3.add(Ccategory);
	      p3.add(LStock);
	      p3.add(TStock);
	      p3.add(BSubmit);
	      p3.add(BCancel);
	      
	      
	      JPanel p4 = new JPanel(new BorderLayout());
	      p4.add(new JLabel("Add Book"), BorderLayout.NORTH);
	      p4.add(p3, BorderLayout.CENTER);
	      Lframe.add(p4, BorderLayout.CENTER);

	      BSubmit.addActionListener(new ActionListener(){  
	          public void actionPerformed(ActionEvent e1){ 
	             Connection connection = DatabaseConnector.getConnection();
	             String sql =  "INSERT INTO `books` (`name`,`category`,`stock`) VALUES (\""+Tname.getText()+"\",\""+Ccategory.getSelectedItem()+"\","+TStock.getText()+")";
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
	          public void actionPerformed(ActionEvent e1){ 
	        	  AdminFunctions a1 = new AdminFunctions();
	        	  Lframe.setVisible(false);
	          }  
	        });
	      
	      
	      
	}


}
