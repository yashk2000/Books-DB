import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import pojo.Book;

public class BookTableModel extends AbstractTableModel{
	
	private String[] columnNames = {"Name","Category","Stock"};
	
	private List<Book> books;
	
	public BookTableModel() {
		books = new ArrayList<Book>();
}
	public BookTableModel(List<Book> books) {
		this.books = books;
	}
	

	@Override
	public int getRowCount() {
		return books.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Book book = getBook(rowIndex);
		switch(columnIndex) {
		case 0: return book.getName();
		case 1: return book.getCategory();
		case 2: return book.getStock();
		default: return null;
		}
	}
	private Book getBook(int rowIndex) {
		return books.get(rowIndex);
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
		  Book book = getBook(row);
		  switch(column) {
		  case 0: book.setName((String)value);break;
		  case 1: book.setCategory((String)value);break;
		  case 2: book.setStock((int) value);break;
		  }
		  
		  fireTableCellUpdated(row,column);
	  }
	  public void addBook(Book book) {
		  insertBook(getRowCount(),book);
	  }
	  public void insertBook(int row,Book book) {
		  books.add(row,book);
		  fireTableRowsInserted(row,row);
	  }
	  public void removePerson(int row) {
		  books.remove(row);
		  fireTableRowsDeleted(row,row);
	  }
}
