package basicjava;
class Employee{
	String name;
	String city;
	int id;
	
	public Employee(String name,String city,int id) {
		this.name=name;
		this.city=city;
		this.id=id;
		
		
		
	}
	void disp() {
	
		System.out.println("name  "+name);
		System.out.println("city  "+city);
		System.out.println("id  "+id);
		
	}
}

public class NewEmployee {
	public static void main(String[] args) {
		Employee e=new Employee("madhuri", "pune", 1);
		e.disp();
	}

}
