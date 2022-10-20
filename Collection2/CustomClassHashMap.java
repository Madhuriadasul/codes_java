package Collection2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class Animal{
	private String name;
	private String colour;
	private int range;
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
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public Animal(String name, String colour, int range) {
		super();
		this.name = name;
		this.colour = colour;
		this.range = range;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", colour=" + colour + ", range=" + range + "]";
	}	
}


public class CustomClassHashMap {
	public static void main(String[] args) {
		
		Map<String,Animal> AnimalMap=new HashMap<String,Animal>();
		
		Animal a1= new Animal("Cat","White",20);
		AnimalMap.put("A",a1);
		AnimalMap.put("B", new Animal("tiger","golden",30));
		AnimalMap.put("c", new Animal("lion","browan",40));
		AnimalMap.put("d", new Animal("monkey","black",389));
		
		
		Set<Map.Entry<String ,Animal>> Animal=AnimalMap.entrySet();
		for(Entry<String, Animal> it:Animal) {
			if(it.getValue().getRange() >30) {
				System.out.println(it.getValue());
			}
		}
		
	}

}
