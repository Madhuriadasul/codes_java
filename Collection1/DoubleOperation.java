package Collection1;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class DoubleOperation {
	public static void main(String[] args) {
		
		List<Double> di = new LinkedList<Double>();
		di.add(4.5);
		di.add(2.2);
		di.add(7.5);
		di.add(2.9);
		di.add(8.0);
		di.add(0.4);
		di.add(1.1);
		System.out.println(di.equals(1.1));
		System.out.println(di.add(1.6));
		System.out.println(di.remove(5));
		System.out.println(di.contains(9.9));
		
		List<Double> di1 = new ArrayList<Double>();
		di1.add(9.5);
		di1.add(3.6);
		di1.add(8.4);
		
		di.add(2, 9.8);
		System.out.println(di);
		di.add(0, 1.6);
		System.out.println(di);
		di.set(2, 4.3);
		System.out.println(di);
		System.out.println(di.get(1));
		
		


		
		
	}

}
