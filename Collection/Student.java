package Collection;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("ABC");
		list.add("DEC");
		list.add("ABC");
		list.add("");
		list.add("STR");
		list.add("EFG");
		list.add("ABC");
		list.add("PQR");
		list.add("");
		
		
		
		System.out.println(list.isEmpty());
		System.out.println(list.contains("ABC"));
		
		System.out.println(list.size());
		
		
		
	}

}
