package Exception;

import java.io.IOException;

class parent{
	void m1() {
		System.out.println("parent method");
	}
}

public class TestException extends parent {
	void m1() {       //throws IOException             //compile time error.....override Exception
		System.out.println("TestException method");
	}
	public static void main(String[] args) {
		parent p =new TestException();
		p.m1();
	}

}
