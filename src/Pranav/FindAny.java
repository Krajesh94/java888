package Pranav;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Optional<Integer> any = list.stream().filter(x->x>1).findAny();
		
		if(any.isPresent()){
			
			Integer result = any.get();
			
			System.out.println(result);
			
		}
		
	}

}
