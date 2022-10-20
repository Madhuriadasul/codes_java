package Collection1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Bike{
	private int id;
	private String name;
	private String model;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Bike(int id, String name, String model) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", model=" + model + "]";
	}
	
	
}
public class CustomObjectWithMap {
	public static void main(String[] args) {
		
		Map<String,Bike> BikeMap=new HashMap<String,Bike>();
		
		Bike b1=new Bike(12,"Active","Honda");
		BikeMap.put("A", b1);
		BikeMap.put("B", new Bike(34,"Spalender","Bajaj"));
		BikeMap.put("C", new Bike(54,"Gixerr","Bajaj"));
		BikeMap.put("D", new Bike(365,"Jupister","Bajaj"));
		BikeMap.put("E", new Bike(365,"RX100","Honda"));
		BikeMap.put("F", new Bike(365,"R15","Bajaj"));
		
		Set<Map.Entry<String,Bike>> Bike = BikeMap.entrySet();
		for (Entry<String, Bike> it :Bike) {
			if(it.getValue().getId()>30) {
				System.out.println(it.getValue());
			}
			
		}
		
		
	}

}
