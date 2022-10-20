package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCodeLinked {
	public static void main(String[] args) {
		
	
	Set<Integer> set= new HashSet<>();
	set.add(23);
	set.add(03);
	set.add(93);
	set.add(43);
	set.add(73);
	set.add(33);
	set.add(63);
	
	System.out.println(set);
	
	Set<Integer> linked= new LinkedHashSet<>();
	
	linked.addAll(set);
	System.out.println(linked);
	System.out.println(linked.size());

	
	
	
	
	
	}	
	

}
