package Collection2;

import java.util.LinkedHashSet;
import java.util.Set;

class Banking{
	private int id;
	private String name;
	private String address;
	public Banking(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Banking [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	void disp()
	{
		System.out.println("id..."+ id  +  "name..."+name  +  "address..."+ address);
	}
}

public class CustomLinkedHashSet {
	public static void main(String[] args) {
		Banking b1= new Banking(2,"madhuri","pune");
		Banking b2= new Banking(5,"mani","pune");
		Banking b3= new Banking(3,"namu","thane");
		Banking b4= new Banking(3,"raju","pune");
		
		Banking b5= new Banking(3,"namu","thane");
		
		
		Set<Banking> data= new LinkedHashSet<Banking>();
		
		data.add(b1);
		data.add(b2);
		data.add(b3);
		data.add(b4);
		data.add(b5);
		Banking b6=new Banking(4,"rahul","murgud");
		data.add(b6);
		
		
		System.out.println("b1 value..."+b1);
		System.out.println("b2 value..."+b2);
		System.out.println("b3 value..."+b3);
		System.out.println("b4 value..."+b4);
		System.out.println("b5 value..."+b4);
		
		System.out.println(data);
		
		
		Set<Integer> in = new LinkedHashSet<Integer>();
		
		in.add(23);
		in.add(24);
		//DUPLICATE VALUE
		in.add(23);
		System.out.println(in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
