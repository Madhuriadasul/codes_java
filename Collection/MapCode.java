package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapCode {
	public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();	
	
	Map<Integer,String> map= new HashMap<>();
	map.put(12,"AB");
	map.put(34,"XC");
	map.put(45,"XC");
	map.put(89,"XC");
	map.put(13,"XC");
	map.put(34,"XC");
	
	System.out.println("hashmap....."+ map);
	
	Map<Integer,String> treemap= new TreeMap<>();
	treemap.putAll(map);
	System.out.println(treemap);
	
	Map<Integer,String> linked= new LinkedHashMap<>();
	
     linked.put(23, "AB");
     linked.put(67, "XT");
     linked.put(245, "YU");
     linked.put(25, "PB");
     linked.put(893, "BK");
     linked.put(45, "NB");
     
     System.out.println(linked);
     linked.putAll(map);
     System.out.println(linked);
}
}