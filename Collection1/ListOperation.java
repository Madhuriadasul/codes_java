package Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperation {
	public static void main(String[] args ) {
		List<Integer>  list=new ArrayList<Integer>();
		list.add(49);
		list.add(12);
		list.add(90);
		list.add(50);
		list.add(69);
		list.add(425);
		list.add(12);
		
		System.out.println(list.size());
		System.out.println(list.equals(12));
		System.out.println(list.isEmpty());
		System.out.println(list.get(2));
		System.out.println(list.contains(380));
		
		
		List<Integer> list1 =new ArrayList<Integer> ();
		list.add(369);
		list.add(200);
		list.add(345);
		list1.addAll(list);
		Collections.sort(list1);
		System.out.println(list1);
		
	}

}
