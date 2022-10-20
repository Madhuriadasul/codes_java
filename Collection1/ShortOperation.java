package Collection1;

import java.util.LinkedList;
import java.util.List;

public class ShortOperation {
	public static void main(String[] args) {
		List<Short> sh= new LinkedList<Short> ();
		sh.add((short) 657483);
		sh.add((short) 294323);
		sh.add((short) 897234);
		sh.add((short) 783234);
		sh.add((short) 287134);
		sh.add((short) 202334);
		
		System.out.println(sh.size());
		sh.add((short) 1654);
		System.out.println(sh);
		sh.add(2, (short)11234);
		System.out.println(sh);
		sh.add((short) 32768);
		System.out.println(sh);
		System.out.println(sh.contains(1234567890));
		sh.remove(3);
		System.out.println(sh);
		
		
		
		
	}

}
