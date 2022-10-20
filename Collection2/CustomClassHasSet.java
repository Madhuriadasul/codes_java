package Collection2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class Hosptial{
	private int id;
	private String name;
	private String address;
	public Hosptial(int id, String name, String address) {
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
		return "Hosptial [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
    void m1()
    {
    	System.out.println("id.."+ id + "name.."+ name + "address.."+address);
    }
}

public class CustomClassHasSet {
	public static void main(String[] args) {
		
		Hosptial hp1=new Hosptial(1, "Ram", "kolhapur");
		Hosptial hp2=new Hosptial(3, "laal", "pune");
		Hosptial hp3=new Hosptial(4, "nam", "nishik");
		Hosptial hp4=new Hosptial(2, "sham", "sangli");
		
		Set<Hosptial> Hp= new HashSet<Hosptial>();
		Hp.add(hp1);
		Hp.add(hp2);
		Hp.add(hp3);
		Hp.add(hp3);
		
		Hp.add(new Hosptial(6,"rani","Kagal"));
		
		System.out.println(Hp);
		
		
		
		Set<Integer> im =new HashSet<Integer>();
		Integer A= new Integer(34);
		Integer B= new Integer(123);
		im.add(26);
		im.add(34);
		System.out.println(im);
		System.out.println(A.hashCode());
		System.out.println(B.hashCode());
		if(A.equals(B)) {
			System.out.println("both equal");
				
		}
		else {
			System.out.println("not equal");
			
		}
		

		
		
		
		
		
	}


}
