package Collection1;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class FloatOperation {
	public static void main(String[] args) {
	
		List<Float> lp = new  ArrayList<Float>();
		lp.add((float) 6.3);
		lp.add((float) 3.8);
		lp.add((float) 6.1);
		lp.add((float) 9.2);
		lp.add((float) 1.2);
		lp.add((float)3.8);
		
		System.out.println(lp.size());
		lp.remove(3);
		System.out.println(lp);
	lp.add((float) 2.4);
	System.out.println(lp);
	
	List<Float> li= new LinkedList<Float>();
	
	li.add((float) 2);
	li.add((float) 6.7);

	li.add(1, (float) 2.1);
	System.out.println(li);
	
	System.out.println(li.contains(5.3));
	System.out.println(li);
	
	
	
	}

}
