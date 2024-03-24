package Pranav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToArrayListex {

	public static void main(String[] args) {

		String[] array= new String[]{"raj","kalyan","siva","ram"};
		//System.out.println(array);


		List<Object> list1 = Arrays.stream(array).collect(Collectors.toList());

		System.out.println(list1);
		
		/*Collections.reverse(list1);
		System.out.println(list1);*/
		
		/*Collections.sort(list1);
		
		System.out.println(list1);*/
		
		
		
	}

}
