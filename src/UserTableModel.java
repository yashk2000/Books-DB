import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import pojo.Book;
import pojo.User;

public class UserTableModel extends AbstractTableModel{
	private String[] columnNames = {"UserName","Password"};

	private List<User> user;
	public UserTableModel() {
		user = new ArrayList<User>();
}
	public UserTableModel(List<User> user) {
		this.user = user;
	}
	@Override
	public int getRowCount() {
		return user.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		User user = getUser(rowIndex);
		switch(columnIndex) {
		case 0: return user.getUsername();
		case 1: return user.getPassword();
		default: return null;
		}
	}
	private User getUser(int rowIndex) {
		return user.get(rowIndex);
	}
	  @Override
	    public String getColumnName(int column)
	    {
	        return columnNames[column];
	    }
	  @Override
	  public Class getColumnClass(int column)
	  {
	      switch (column)
	      {
	          case 3: return int.class;
	          default: return String.class;
	      }
	  }
	  @Override
	  public void setValueAt(Object value,int row,int column) {
		  User user = getUser(row);
		  switch(column) {
		  case 0: user.setUsername((String)value);break;
		  case 1: user.setPassword((String)value);break;
		  }
		  
		  fireTableCellUpdated(row,column);
	  }
	  public void addUser(User user) {
		  insertUser(getRowCount(),user);
	  }
	  public void insertUser(int row,User user) {
		  this.user.add(row,user);
		  fireTableRowsInserted(row,row);
	  }
	  public void removePerson(int row) {
		  this.user.remove(row);
		  fireTableRowsDeleted(row,row);
	  }
	 
}
