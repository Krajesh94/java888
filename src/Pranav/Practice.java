package Pranav;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,2,1);
		
		Optional<Integer> first = list.stream().findFirst();
		
		if(first.isPresent()){
			
			System.out.println(first.get());
		}else{
			System.out.println("no value");
		}
		
		Optional<Integer> first2 = list.stream()
				
				
				.filter(x->x>2).findAny();
		
		if(first2.isPresent()){
			System.out.println(first2.get());
		}
	}

}
