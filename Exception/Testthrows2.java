package Exception;

import java.io.IOException;

class Imp{
	void m1() throws IOException{
		System.out.println("device operation performed");
	}
}

public class Testthrows2 {
	public static void main(String[] args) throws IOException {
		Imp i= new Imp();
		i.m1();
		
		System.out.println("normal flow");
	}
	

}
