package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TreeSet {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(34);
		l.add(7);
		l.add(78);
		l.add(45);
		l.add(23);
		l.add(new Integer(33));
		
		
		System.out.println(l);
		//System .out.println("befor sorting :" l);
		
		Collections.sort(l);
		
		Collections.reverse(l);
		System.out.println(l);
		
		System.out.println(Collections.binarySearch(l,45));
		
		
		
}
}