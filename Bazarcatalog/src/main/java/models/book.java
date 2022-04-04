package models;

public class book {

	private String Id;
	private  String bookname;
	private  String type;

public book() {
	
}
public book(String id, String bookname, String type) {
	Id = id;
	this.bookname = bookname;
	this.type = type;
}


public String getId() {
	return Id;
}


public void setId(String id) {
	Id = id;
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



	
	
}
