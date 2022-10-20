package AccessSpecifier;
class A{
	private int data=40;
	
	void msg() {
		System.out.println("hello java");
	}
}

public class sample {
	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj.hashCode());
		obj.msg();
		
	}

}
// compile time errorr