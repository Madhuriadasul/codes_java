package Collection2;
class Notbooks{
	private int range=12;     //final...>  value is not change..... use in constant value declaration 
	private int prise;
	private String name;
	public Notbooks(int prise, String name) {
		super();
		this.prise = prise;
		this.name = name;
	}
	void add() {
		range=34;   //Remove 'final' modifier of range
	
	}
	
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

public class FinalKeyword {
public static void main(String[] args) {
	Notbooks b =new Notbooks(267,"english");
	System.out.println(b);
}
}