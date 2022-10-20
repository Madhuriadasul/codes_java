package Collection1;
class Emp{
private	String name;
private	int rollno;
private	String city;

	
	
	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}



public int getRollno() {
	return rollno;
}


public void setRollno(int rollno) {
	this.rollno = rollno;
}



public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}



	public void disp() {
		System.out.println(this.name);
		System.out.println(this.rollno);
		System.out.println(this.city);
	}
	
}

public class GetSetOperation {
	public static void main(String[] args) {
	Emp e1= new Emp();
	e1.setName("madhuri");
	e1.setCity("pune");
	e1.setRollno(3);
	e1.disp();
	}

}
