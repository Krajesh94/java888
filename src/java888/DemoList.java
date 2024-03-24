package java888;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {

		List<String>l = new ArrayList<>();
		l.add("rajesh");
		l.add("kalyan");
		l.add("kasi");
		
		//System.out.println(l);
		
		/*for (String s :l){
			System.out.println(s);
		}*/
		
		// l.forEach(System.out::println);Method reference
		
		l.forEach(x->System.out.println(x));
	}
	

}
