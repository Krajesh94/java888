package Pranav;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NotEqualTo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("rajeh","kalyan","ramu","java");
		
		Optional<String> first = list.stream()
				.filter(x->!x.equalsIgnoreCase("java"))
				.findFirst();
		
		if(first .isPresent()){
			
			System.out.println(first.get());
		}else{
			System.out.println("no value");
		}

	}

}
