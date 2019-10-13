package pojo;

public class Book {
	
	String name;
	String category;
	int stock;
	


public Book(String name,String category,int stock) {
	this.name = name;
	this.category = category;
	this.stock = stock;

}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getCategory() {
	return category;
}



public void setCategory(String category) {
	this.category = category;
}



public int getStock() {
	return stock;
}



public void setStock(int stock) {
	this.stock = stock;
}


}
