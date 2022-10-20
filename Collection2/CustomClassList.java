package Collection2;

import java.util.ArrayList;
import java.util.List;

import java .util.Collections;
class Eployee{
	private int id;
	private String Name;
	private String Address;
	public Eployee(int id, String name, String address) {
		super();
		this.id = id;
		Name = name;
		Address = address;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public String getAddress()
	{
		return Address;
	}
	public void setAddress(String address)
	{
		Address = address;
	}
	@Override
	public String toString() {
		return "Eployee [id=" + id + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	void disp()
	{
		System.out.println("id...." + id + " Name..." + Name + " Address..." + Address );
	}
}

public class CustomClassList {
	public static void main(String[] args) {
	String sr= new String("mani");
		
		List<String> list= new ArrayList<String>();
		list.add(sr);
		list.add("Ram");
		
		
		
		List<Eployee> emp=new ArrayList<Eployee>();
		Eployee e1=new Eployee(1,"madhuri","pune");
		Eployee e2=new Eployee(12,"Kajal","Kolhapur");
		Eployee e3=new Eployee(10,"Pooja","mumbai");
		Eployee e4=new Eployee(13,"Piya","kagal");
		Eployee e5=new Eployee(8,"Nami","Savrde");
		Eployee e6=new Eployee(3,"Aaru","Murgud");
		e1.disp();
		System.out.println("e1 value..."+e1);
		System.out.println("e2 value..."+e2);
		System.out.println("e3 value..."+e3);
		System.out.println("e4 value..."+e4);
		System.out.println("e5 value..."+e5);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		String sr1 =new String("Raj");
		String sr2 =new String("Raj");
		
		System.out.println(sr1.hashCode());
		System.out.println(sr2.hashCode());
		
		if(sr1.equals(sr2)) {
			System.out.println("boyh are equal");
			
		}
		else {
			System.out.println("noth equal");
			
		}
		
		
		
		Eployee emp1=new Eployee(12,"mani","pune");
		Eployee emp2=new Eployee(12,"mani","pune");
		
			
		
	}
}




