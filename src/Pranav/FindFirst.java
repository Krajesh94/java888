package Pranav;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

	public static void main(String[] args) {

		List<Integer> list =  Arrays.asList(1,2,3,2,1);

		Optional<Integer> first= list.stream().findFirst();

		if(first .isPresent()){
			int result= first.get();
			System.out.println(result);

		}else{
			
			System.out.println("no value");
		}

		Optional<Integer> first2 = list
				.stream().filter(x->x>2).findFirst();

		if(first2.isPresent()){

			System.out.println(first2.get());

		}else{
			System.out.println("no value"); 

		}
	}

}
