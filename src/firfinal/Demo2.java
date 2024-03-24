package firfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {

		List <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		
		 Optional<Integer>first =  list.stream().findFirst();
		 
		 if(first.isPresent()){
			  Integer res = first.get();
			 System.out.println(res);
		 }else{
			 System.out.println("no value");
		 }
		 
		 Optional<Integer> first2 =list
				 .stream()
				 .filter(x->x>1).findFirst();
		 
		 if(first2 .isPresent()){
			 System.out.println(first2.get());
		 }else{
			 System.out.println("no value");
		 }
		 
	}

}
