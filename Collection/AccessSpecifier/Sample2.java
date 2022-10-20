package AccessSpecifier;
class A1{
	A1() {}
	void msg() {
		System.out.println("Hello java");
	}
}
public class Sample2 {
	public static void main(String[] args) {
		A1 obj= new A1();
		obj.msg();
	}

}
// private