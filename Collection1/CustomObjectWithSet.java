package Collection1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Bank{
	private int id;
	private String name;
	private String branch;
	public Bank(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	@Override
	public int hashCode() {
	
		final int prime=31;
		int result=1;
		result = prime * result + ((branch==null) ? 0 : branch.hashCode());
		result= prime * result + id;
		result = prime * result + ((name== null) ? 0 : name.hashCode());
		return result;
	
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj== null)
			return false;
		if(getClass() !=obj.getClass())
			return false;
		Bank other=(Bank) obj;
		if(branch==null) {
			if(other.branch!=null)
				return false;
		}
		else if(!branch.equals(other.branch))
			return false;
		if(name == null) {
			if(other.name != null)
				return false;
		}else if(!name.equals(other.name))
			return false;
		return true;
	}	
	}

	
	
	


public class CustomObjectWithSet {
	public static void main(String[] args) {
		Set<Bank> bank=new HashSet<Bank>();
		
		bank.add(new Bank(131,"Kotak","pune"));
		bank.add(new Bank(456,"HDFC","pune"));
		bank.add(new Bank(763,"SBI","pune"));
		bank.add(new Bank(123,"AXIS","pune"));
		bank.add(new Bank(981,"HDFCk","pune"));
		bank.add(new Bank(543,"SBI","pune"));
		bank.add(new Bank(123,"Kotak","pune"));
		bank.add(new Bank(154,"HDFC","pune"));
		bank.add(new Bank(145,"AXIX","pune"));
		
		Set<Bank> treeSet=new TreeSet<Bank>();
		
		
		Set<Bank> linked=new LinkedHashSet<>();
		linked.addAll(bank);
		System.out.println("linkedhashset..."+linked);
		
		Bank bb=new Bank(132,"HDFC","pune");
		Bank cc=new Bank(132,"KOTAK","pune");
		Bank dd=new Bank(132,"AXIS","pune");
		System.out.println(bb.equals(dd));
		System.out.println(bb.hashCode());
		System.out.println(cc.hashCode());
		
		
	}

}
