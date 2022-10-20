package Collection2;
class EMP{
	
					//Blank final variable... use in only Constructor and Dynamic block
	private final int id;         //.....decleration
	private String name;
	private String address;
	public EMP(String name, String address) {
		super();
		id= 56;                  //....initialization
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
public class BlankFinal {

}
