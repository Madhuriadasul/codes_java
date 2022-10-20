package Collection2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Books{
	private int Range;
	private String name;
	private String outher;
	public Books(int range, String name, String outher) {
		super();
		Range = range;
		this.name = name;
		this.outher = outher;
	}
	public int getRange() {
		return Range;
	}
	public void setRange(int range) {
		Range = range;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOuther() {
		return outher;
	}
	public void setOuther(String outher) {
		this.outher = outher;
	}
	@Override
	public String toString() {
		return "Books [Range=" + Range + ", name=" + name + ", outher=" + outher + "]";
	}
	
	
}

public class CustomClassTreeMap {
public static void main(String[] args) {
	Books s1= new Books(120,"java","R ramesh");
	Books s2= new Books(920,"marathi","sonali");
	Books s3= new Books(120,"java","vishun");
	Books s4= new Books(200,"english","alizabet");
	
	Map<Integer,Books> map=new LinkedHashMap<Integer,Books>();
	
  map.put(23, s4);
  map.put(45, s3);
  map.put(23, s1);
  map.put(90, s2);
  
  System.out.println(map);
  
  
  Map<Integer,Books> treemap= new TreeMap<Integer,Books>();
  
  treemap.putAll(map);
  
  System.out.println("treemap.."+ treemap);
  
  
  
	
	
	
	
	
}
}
