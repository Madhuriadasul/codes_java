package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringIntlist {
	public static void main(String[] args) {
		List<String>names = new ArrayList<String>();
		
		names.add("ABC");
		names.add("PQR");
		names.add("ABC");
		names.add("DEF");
		names.add("XYZ");
		names.add("THC");
		names.add("AMN");
		
		Collections.sort(names);
		System.out.println(names);
		
		System.out.println(names.size());
		names.remove(3);
		System.out.println(names);
		
		Set<String> s= new LinkedHashSet<String>(names);   //duplicate element remove
		System.out.println(s);
		
		
		
	}


	

}
