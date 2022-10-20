package Exception;
class CuException extends Exception{
	public CuException(String message) {
		super(message);
	}
}
class code{
	int cal(int num1, int num2) throws CuException{
		int result=0;
		if(num1==0 || num2==0) {
			
			CuException("please enter number greater than 0");
			
			throw new CuException ("please enter number greater than 0");
		}else {
			result= num1 / num2;
		}
		return result;
	}

	private void CuException(String string) {
		// TODO Auto-generated method stub
		
	}
}
public class CustomException1 {
	public static void main(String[] args) throws CuException {
		code code = new code();
		code.cal(12, 0);
	}

}
