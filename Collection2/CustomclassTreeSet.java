package Collection2;


import java.util.TreeSet;

class student{
	private int rollno;
	private String name;
	private String sub;
	public student(int rollno, String name, String sub) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.sub = sub;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", sub=" + sub+ "]";
	}
	void m2() {
		System.out.println("rollno.." + rollno + "name.."+ name + "sub..."+ sub);
	}
	
}

public class CustomclassTreeSet {
	public static void main(String[] args) {
		
		student st1=new student(1,"mani","hindi");
		student st2=new student(3,"kaji","marathi");
		student st3=new student(4,"mrani","english");
		student st4=new student(1,"rani","hindi");
		student st5=new student(1,"rani","histry");
		
		TreeSet<student> strset= new TreeSet<student>();
		
		strset.add(st1);
		strset.add(st2);
		strset.add(st3);
		strset.add(st4);
		strset.add(st5);
		
		System.out.println("Treeset:");
		
		
		for(student temp:strset) {
			System.out.println(temp);
		}
		
		TreeSet<String> treset=new TreeSet<String>();
		treset.add("good");
		treset.add("nice");
		treset.add("cool");
		
		treset.add("good");
		System.out.println("TreeSet :");
		for(String temp :treset) {
			System.out.println(temp);
		}
		
				
				
		
		
		
		
		
		
	}

}
