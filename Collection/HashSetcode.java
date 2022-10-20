package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetcode {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(12);
		list.add(92);
		list.add(42);
		list.add(32);
		list.add(92);
		list.add(12);
		
		System.out.println(list);
		
		Set<Integer> s= new HashSet<Integer>();
		
		s.addAll(list);
		System.out.println(s);
		
		Set<Integer> linked= new LinkedHashSet<>();
		linked.addAll(list);
		System.out.println(linked);
		
		Set<Integer> treeset= new TreeSet<>();
		treeset.addAll(list);
		System.out.println(treeset);
		

		
		
	}

}
