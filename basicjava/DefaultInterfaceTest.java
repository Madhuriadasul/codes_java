package basicjava;
interface ABC{
	public static final int p_ = 0;
	int z=30;
	
	default int add(int a,int z) {
		return a+z;
		
	}
	
}
class DEF implements ABC{
	public int add(int a,int b) {
		return a+b;
	}
}

public class DefaultInterfaceTest {
public static void main(String[] args) {
	DEF d= new DEF();
	int z= d.add(20, 30);
	int a=d.add(12, 40);
	System.out.println("addition..."+z);
	System.out.println("addition..." +a);
}
}
