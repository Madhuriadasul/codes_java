package Collection2;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

class Bank{
	private int id;
	private String name;
	private String address;
	public Bank(int id, String name, String address) {
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
		return "Bank [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	void disp()
	{
		System.out.println("id..."+ id  +  "name..."+name  +  "address..."+ address);
	}
}
class CustomClassLinkedList {
	
	public static void main(String[] args) {
		Bank b1= new Bank(2,"madhuri","pune");
		Bank b2= new Bank(5,"mani","pune");
		Bank b3= new Bank(3,"namu","thane");
		Bank b4= new Bank(3,"raju","pune");
		Bank b5= new Bank(3,"nilu","thane");
		
		
		List<Bank> bank= new LinkedList<Bank>();
		bank.add(b1);
		bank.add(b2);
		bank.add(b3);
		bank.add(b4);
		bank.add(b5);
		bank.add(new Bank(6,"rutu","mumbai"));
		bank.remove(3);
		System.out.println(bank); 
		b1.disp();
		System.out.println(bank);
		
		
		
		
		
		
		
	
		b1.disp();
	}

}
