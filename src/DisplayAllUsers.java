import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import pojo.Book;
import pojo.User;

public class DisplayAllUsers extends JFrame {
	DisplayAllUsers(){
		
		JFrame displayall = new JFrame();
		ArrayList myList = getUsers();
		UserTableModel tablemodel = new UserTableModel(myList);
	

		final JTable jt=new JTable(tablemodel);   
	
		jt.setCellSelectionEnabled(true);  
		JScrollPane sp=new JScrollPane(jt);    
		this.add(sp);  
		this.setSize(900, 500);  
		this.setVisible(true);  
	}

	public ArrayList<User> getUsers(){
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
		
		return myList;
			
	}

}
