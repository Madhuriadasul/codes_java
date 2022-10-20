package Collection;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Fruits{
	private Integer count;
	private String name;
	private String colour;
	public Fruits(Integer count, String name, String colour) {
		super();
		this.count = count;
		this.name = name;
		this.colour = colour;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Fruits [count=" + count + ", name=" + name + ", colour=" + colour + "]";
	}
	
	
}

public class ListWithCustomClass {
	public static void main(String[] args) {
		
		
		
	
		Fruits fr1=new Fruits(80, "Apple", "Red");
		Fruits fr2= new Fruits(500, "Mango", "Green");
		Fruits fr3= new Fruits(1000, "Banana", "Red");
		Fruits fr4= new Fruits(80, "Apple", "Red");
		Fruits fr5= new Fruits(70, "Orange", "Orange");
		Fruits fr6= new Fruits(100, "Kiwi", "Red");
		
		List<Fruits> list= new ArrayList<Fruits>();
		
		list.add(fr1); 
		list.add(fr2);
		list.add(fr3);
		list.add(fr4);
		list.add(fr5);
		list.add(fr6);
		
		list.remove(6);
		System.out.println(list);
		
		list.add(new Fruits( 67,"Greaps","green"));
		System.out.println(list);
		
		
	
			
		}
		
		
		
		
		
	}


