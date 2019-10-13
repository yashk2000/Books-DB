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

public class EditBooks extends JFrame{
	EditBooks(){
		JFrame Lframe = new JFrame();
	      Lframe.setSize(500, 400);
	      Lframe.setLocationRelativeTo(null); 
	      Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	      Lframe.setVisible(true);
	      JPanel p3 = new JPanel(new GridLayout(5,5,5,5));
	      
	      JLabel Lbooks,Lcategory,Lstock;
	      JTextField Tfbooks;
	      JComboBox CBbooks;
	      JTextField Tfstock;
	      
	      Lbooks = new JLabel("Enter book name to edit");
	      Lcategory = new JLabel("Select new Category");
	      Lstock = new JLabel("Enter new Stock");
	      
	      Tfbooks = new JTextField();
	      CBbooks =  new JComboBox(new String[]{"Science Fiction", "Mystery","Fiction","Non-Fiction","Fantasy","Romance"});
	      Tfstock = new JTextField();
	      
	      
	      JButton BSubmit = new JButton("Submit");
	      JButton BCancel = new JButton("Cancel");
	      BSubmit.setSize(10,10);
	      BCancel.setSize(10,10);
	      
	      p3.add(Lbooks);
	      p3.add(Tfbooks);
	      p3.add(Lcategory);
	      p3.add(CBbooks);
	      p3.add(Lstock);
	      p3.add(Tfstock);
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
			             String sql = "update books set category = \""+CBbooks.getSelectedItem()+"\" , stock = \""+Tfstock.getText()+"\" WHERE name=\""+Tfbooks.getText()+"\";\n" + 
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
