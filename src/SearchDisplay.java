import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import pojo.Book;

public class SearchDisplay extends JFrame{
SearchDisplay(String name){
		
		JFrame displayall = new JFrame();
		ArrayList myList = getBooks(name);
		BookTableModel tablemodel = new BookTableModel(myList);
	

		final JTable jt=new JTable(tablemodel);   
	
		jt.setCellSelectionEnabled(true);  
		JScrollPane sp=new JScrollPane(jt);    
		this.add(sp);  
		this.setSize(900, 500);  
		this.setVisible(true);  
	}

	public ArrayList<Book> getBooks(String name){
		ArrayList<Book> myList = new ArrayList<Book>();
		try {
			Connection connection = DatabaseConnector.getConnection();
			ResultSet re = connection.createStatement().executeQuery("select * from books");
			while(re.next()) {
				if(re.getString("name").equals(name)) {
				myList.add(new Book(re.getString("name"),re.getString("category"),re.getInt("stock")));
			}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return myList;
			
	}

}
