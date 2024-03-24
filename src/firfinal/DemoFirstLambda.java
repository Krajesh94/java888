package firfinal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoFirstLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new  ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3); 
		list.add(2);
		list.add(1);
		
		Optional<Integer> first =list.stream().findFirst();
		
		if(first.isPresent()){
				Integer result = first.get();
				
				System.out.println(result);
				
		}else{
			System.out.println("no value");
		}
		
		Optional<Integer> first2 = list
				.stream()
				.filter(x->x>28).findFirst();
		
		if(first.isPresent()){
			System.out.println (first2.get());
			}else{
				System.out.println("no value");
			}
		
		
	}

}
