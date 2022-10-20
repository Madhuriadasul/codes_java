package Collection2;

import java.util.HashMap;
import java.util.Map;

class Animals{
	private int range;
	private String name;
	private String colour;
	public Animals(int range, String name, String colour) {
		super();
		this.range = range;
		this.name = name;
		this.colour = colour;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
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
		return "Animals [range=" + range + ", name=" + name + ", colour=" + colour + "]";
	}
	
	
}

public class CustomClassMap {
	public static void main(String[] args) {
		Animals an1=new Animals(12,"fox","browan");
		Animals an2=new Animals(120,"Lion","golden");
		Animals an3=new Animals(1200,"dog","white");
		
		Map<String,Animals> map= new HashMap<String,Animals>();
		
		map.put("X",an1);
		map.put("Y",an2);
		map.put("Z", an3);
		
		System.out.println(map);
		
		System.out.println(map.size());
		System.out.println(map.get("X"));
		System.out.println(map.get("name"));
		
	
		
		
	}

}
