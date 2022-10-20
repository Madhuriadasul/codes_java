package Collection1;

import java.util.Objects;

class Student{
	private String name;
	private int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);       // inbuild all call cha parent class object class aaahe
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}	
	
	
}

public class HashcodeOperation {
	public static void main(String[] args) {
		String s1=new String("xyz");
		String s2= new String("xyz");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1.equals(s2)) {
			System.out.println("equal");
		}
		
		Student s11=new Student("madhuri",2);
		Student s21=new Student("madhuri",2);
		System.out.println(s11.hashCode());
		System.out.println(s21.hashCode());
		if(s11.equals(s21)) {                     //not equal print
			System.out.println("equal");
		}
		
		

		
	}

}
