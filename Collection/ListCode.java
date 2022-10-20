package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCode {
	public static void main(String[] args) {
		List list= new ArrayList();
		
		list.add(20);
		list.add(10);
		list.add(80);
		list.add(50);
		list.add(90);
		list.add(30);
		
		int sum=0;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
			Integer in=(Integer)list.get(i) ;
			sum= sum+in;
			
		}
		System.out.println("addition" + sum);
		
		List<Integer> intlist= new ArrayList<Integer>();
		intlist.add(58);
		intlist.add(48);
		intlist.add(88);
		intlist.add(38);
		intlist.add(28);
		
		boolean res=intlist.contains(100);
		System.out.println("result of contains method  "+ res);
		
		boolean res2= intlist.contains(38);
		
		System.out.println("result of contains method "+ res2);
		
		int addition=0;
		for(Integer index:intlist) {
			
			System.out.println("Advance forloop.. " + index);
			
			addition= addition+index;
			
			}
		
		System.out.println(addition);
		
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
