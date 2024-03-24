package Pranav;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSortedTreeMap1 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String>  hm = new HashMap<>();
		
		hm.put(1,"rajesh");
		hm.put(5, "kalyan");
		hm.put(3, "sai");
		hm.put(9,"raju");
		hm.put(7, "ramu");
		hm.put(2, "siva");
		
		System.out.println(hm);

		
		Map <Integer,String> map = new TreeMap<>(hm);
		
		System.out.println(map);
	}

}
