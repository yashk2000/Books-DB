import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import pojo.Book;

public class BuyBook extends JFrame {
	BuyBook() {
		    JFrame USPframe = new JFrame();
		    USPframe.setTitle("Buy");
		      USPframe.setSize(300,200);
		      USPframe.setLocationRelativeTo(null); 
		      USPframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    USPframe.setVisible(true);

		    JPanel p9 = new JPanel(new GridLayout(1,1,10,10));
		    JPanel p10 = new JPanel(new GridLayout(1,2,10,10));
		    JTextField LSearch = new JTextField();
		    JButton BUSearch, BUExit;
		    BUSearch = new JButton("Buy");
		    BUExit = new JButton("Exit");

		    p9.add(LSearch);
		    p10.add(BUSearch);
		    p10.add(BUExit);

		    BUExit.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e3) {
		        USPframe.setVisible(false);
		        UserFunctions user = new UserFunctions();
		      }
		    });
		    BUSearch.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e3) {
		            USPframe.setVisible(false);
		            try {
		            	 
		    			Connection connection = DatabaseConnector.getConnection();
		    			Statement statement = connection.createStatement();
		    			ResultSet re = connection.createStatement().executeQuery("select * from books");
		    			while(re.next()) {
		    				if(re.getString("name").equals(LSearch.getText())) {
		    				int stock = Integer.parseInt(re.getString("stock"));
		    				if(stock>0) {
		    					 stock--;
		    					 System.out.println(stock);
		    					String sql= "UPDATE books SET stock = "+stock+" WHERE name = \""+LSearch.getText()+"\";\n" + 
		    					 "";
		    					statement.execute(sql);
		    					JOptionPane.showMessageDialog(USPframe,"Purchase Succesfull");  
		    				}
		    				else {
		    					JOptionPane.showMessageDialog(USPframe,"Book Out Of Stock");  
		    				}
		    			}
		    			}
		    		}
		    		catch(SQLException e) {
		    			e.printStackTrace();
		    		}
		          }
		        });

		    USPframe.add(new JLabel("Enter a Book Name"),BorderLayout.NORTH);
		    USPframe.add(p9,BorderLayout.CENTER);
		    USPframe.add(p10,BorderLayout.SOUTH);
		  }
}