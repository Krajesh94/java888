package firfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NotEqual {

	public static void main(String[] args) {

		List <String> list = new ArrayList<>();

		list.add("rajesh");
		list.add("kalyan");
		list.add("ram");
		list.add("kasi");


		Optional<String> result = list.stream()
				.filter(x->!x.equalsIgnoreCase("ram"))
				.findFirst();

		if(result.isPresent()){
			System.out.println(result);
		}else{
			System.out.println("no values");
		}
	}

}
