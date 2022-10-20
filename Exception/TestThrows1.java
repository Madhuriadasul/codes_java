package Exception;

public class TestThrows1 {    //unchecked exception
public static void validate(int age) {
	if (age <18)
	{
		
		throw new ArithmeticException("person is not eligible to vote");
	}
	else {
			System.out.println("person is eligible to vote");
	}
}
public static void main(String[] args) {
	
	System.out.println("Welcome to vote");

      validate(12);
}
}