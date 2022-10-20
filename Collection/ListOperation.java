package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperation {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		
		list.add(12);
		list.add(34);
		list.add(16);
		list.add(90);
		list.add(45);
		list.add(23);
		list.add(54);
		list.add(145);
		list.add(67);
		list.add(32);
		list.add(81);
		
		
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.equals(13));
		System.out.println(list.contains(234));
		
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(45);
		list1.add(45);
		list1.add(12);
		list1.add(78);
		
		list1.addAll(list);
		System.out.println(list1);
		System.out.println(list.containsAll(list));
		System.out.println(list.equals(list));
		
	}

}
