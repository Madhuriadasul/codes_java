package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCode {
	public static void main(String[] args) {
		Set<Integer> set= new HashSet<>();
		set.add(12);
		set.add(34);
		set.add(90);
		set.add(112);
		set.add(02);
		set.add(0);
		set.add(45);
		set.add(99);
		set.add(36);
		set.add(19);
		
		System.out.println(set);
		
		Set<Integer> treeset= new TreeSet<>();
		treeset.addAll(set);
		System.out.println(treeset);
		
		treeset.remove(12);
		System.out.println(treeset);
		
		Set<String> name= new HashSet<>();
		name.add("Madhuri");
		name.add("Anita");
		name.add("Sara");
		name.add("Komal");
		name.add("Nita");
		name.add("Radha");
		name.add("Madhuri");
		
		System.out.println(name);
		
		Set<String> treeset2= new TreeSet<>();
		treeset2.addAll(name);
		System.out.println(treeset2);
		
		
		
	}

}
