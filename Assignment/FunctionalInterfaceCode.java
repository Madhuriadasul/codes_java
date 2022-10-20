package Assignment;

@FunctionalInterface

interface functional{   //singal functionality
	void FundTransfer();
}

class StudentImp1 implements functional {

	@Override
	public void FundTransfer() {
		System.out.println("functional interface");
		
	}
	
}
public class FunctionalInterfaceCode {
	public static void main(String[] args) {
		 functional  fn= new StudentImp1();
		 fn.FundTransfer();
	}

}
