package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCode1 {
	public static void main(String[] args) {
		Set<Float> set= new HashSet<>();
		set.add(23.5f);
		set.add(56.5f);
		set.add(13.5f);
		set.add(276.5f);
		set.add(56.5f);
		set.add(289.5f);
		
		System.out.println(set);
		set.remove(56.5f);
		System.out.println(set);
		
		Set<Float> treeset= new TreeSet<>();
		treeset.addAll(set);
		System.out.println(treeset);
	
		
	}

}
