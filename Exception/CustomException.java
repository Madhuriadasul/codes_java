package Exception;
class CustException extends Exception{
	public CustException (String msg) {
		super(msg);
	}
}
class MarkCalculation{
	public int calculate(int x,int y) {
		int result= x/y;
		return result;
		
	}
}
public class CustomException {
	public static void main(String[] args) {
		MarkCalculation mk= new MarkCalculation();
		mk.calculate(12,0);
	}

}
