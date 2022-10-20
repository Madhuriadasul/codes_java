package Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListStringOperation {
public static void main(String[] args) {
	
	List<String> list= new ArrayList<String> ();
	
	list.add("madhuri");
	list.add("rajkumar");
	list.add("raju");
	list.add("mani");
	list.add("kaju");
	list.add("sayali");
	list.add("pri");
	list.add("anuja");
	
	Collections.sort(list);
	System.out.println(list);
	list.remove(3);
	System.out.println(list);
	list.add("anvi");
	System.out.println(list);
	list.add(3, "nayan");
	System.out.println(list);
	
	
	
	List<Integer> li = new LinkedList<Integer>();
	li.add(12);
	li.add(67);
	li.add(65);
	li.add(14);
	li.add(56);
	
	System.out.println(li);
	li.remove(4);
	System.out.println(li);
	
	
	
	
}
}
