package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(1);
		l.add(3);
		l.add(2);
		l.add(26);
		l.add(9);
		l.add(7);
		
		Iterator t = l.iterator();
		
		while(t.hasNext()){
			System.out.println(t.next());
		}
		
		System.out.println("lambda expression");
		//lambda expressions
		l.forEach(p->System.out.println(p));
		
	}

}
