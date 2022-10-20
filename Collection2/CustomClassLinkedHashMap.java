package Collection2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Book{
	private int Range;
	private String Name;
	private int pages;
	public Book(int range, String name, int pages) {
		super();
		Range = range;
		Name = name;
		this.pages = pages;
	}
	public int getRange() {
		return Range;
	}
	public void setRange(int range) {
		Range = range;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [Range=" + Range + ", Name=" + Name + ", pages=" + pages + "]";
	}
	
	
}

public class CustomClassLinkedHashMap {
public static void main(String[] args) {
	
	Book b1=new Book(120,"java",5490);
	Book b2= new Book(890,"basic java",3569);
	Book b3= new Book(790,"basic java",3569);
	Book b4= new Book(400,"english",4535);
	Book b5= new Book(790,"hindi",3569);
	
	Map<Integer,Book> map =new LinkedHashMap<Integer,Book>();
	
	map.put(19, b1);
	map.put(15, b2);
	map.put(11, b3);
	map.put(18, b4);
	map.put(11, b5);
	System.out.println(map);
	
	Map<Integer,Book> treemap= new TreeMap<>();
	
	treemap.putAll(map);
	System.out.println("treemap.." +treemap);
	
	
	
}
}
