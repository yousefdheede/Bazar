package models;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration(exclude={JmxAutoConfiguration.class})

@RestController
@RequestMapping("/ListBooks")
public class catalogclass {
	
	List<book> books=Arrays.asList(
			new book("1","How to get a good grade in DOS in 40 minutes a day"," distributed systems"),
						
						new book("2","RPCs for Noobs"," distributed systems"),

						new book("3","Xen and the Art of Surviving Undergraduate School","undergraduate school"),

						new book("4","Cooking for the Impatient Undergrad","undergraduate school")
						);
	
@RequestMapping("/books")
public List<book>ListBooks(){
	
	
			return books;

	}
@RequestMapping("/books/{type}")
	public book getbookbyType(@PathVariable("type")String type){
	book b=books.stream().filter(book-> type.equals(book.getType())).findAny().orElse(null);

		return b;
		
	}
	@RequestMapping("/books/{Id}")
public book getbookbyID(@PathVariable("Id")String Id){
	book b=books.stream().filter(book-> Id.equals(book.getId())).findAny().orElse(null);
	
	return b  ;
		
	}
@RequestMapping("/books/{bookname}")
public book getbookName(@PathVariable("bookname")String bookname){
	book b=books.stream().filter(book-> bookname.equals(book.getBookname())).findAny().orElse(null);

	return b;
	
}

	
}
