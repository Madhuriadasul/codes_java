package Exception;

import java.io.IOException;

public class TestThrows {    // checked exception....  syntax:  return_type method_name() throws exception
	void m1() throws IOException {
		throw new IOException("device error");	
		
	}

	void m2() throws IOException{
		m1();
	}
	void m3() {
		try {
			
			m2();
			
		}catch(Exception e) {
			System.out.println("exception handling");
		}
	}
	public static void main(String[] args) {
		TestThrows t1= new TestThrows();
		t1.m3();
		System.out.println("normal flow");
	}
}
