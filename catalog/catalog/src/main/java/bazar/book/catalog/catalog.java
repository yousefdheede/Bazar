package bazar.book.catalog;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





public class catalog {
	List<book> books=Arrays.asList(
			new book("1","How to get a good grade in DOS in 40 minutes a day","distributed systems","40$","50"),
						
						new book("2","RPCs for Noobs","distributed systems","30$","30"),

						new book("3","Xen and the Art of Surviving Undergraduate School","undergraduate school","20$","40"),

						new book("4","Cooking for the Impatient Undergrad","undergraduate school","25$","60")
						);
	
	
@GetMapping("/books")
@ResponseBody
public String getid(@RequestParam String id) {
	return id;
	 
}

@GetMapping("/books")
@ResponseBody
public String getname(@RequestParam String type) {
	return type;
	 
}

}
