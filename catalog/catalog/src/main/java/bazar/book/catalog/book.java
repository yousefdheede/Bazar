package bazar.book.catalog;

public class book {

	public book(String id, String bookname, String type, String price, String stock) {
	
		id = id;
		this.bookname = bookname;
		this.type = type;
		this.price = price;
		this.stock = stock;
	}

	private String id;
	private  String bookname;
	private  String type;
	private  String price;
	private  String stock;
	

public book() {
	
}

public book(String id, String bookname, String type) {
	this.id = id;
	this.bookname = bookname;
	this.type = type;
}

public book(long incrementAndGet, String format) {
	// TODO Auto-generated constructor stub
}

public String getid() {
	return id;
}

public void setid(String id) {
	id = id;
}

public String getBookname() {
	return bookname;
}

public void setBookname(String bookname) {
	this.bookname = bookname;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getStock() {
	return stock;
}

public void setStock(String stock) {
	this.stock = stock;
}







	
	
}
