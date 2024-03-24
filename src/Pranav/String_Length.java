package Pranav;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class String_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List<String> len = Arrays.asList("bbbks","bhbknm","cb b mn","n bhbskb","pp","nknc");
		
		//len.stream().filter((String name)->name.length()>4).forEach(System.out::println);
		len.stream().limit(3).forEach(System.out::println);
		len.stream().skip(5).forEach(System.out::println);
		len.stream().map(String::length).forEach(System.out::println);*/
 
		//OptionalInt min = Arrays.stream(new int[] {2,4,7,9,4,3}).min();
 
		//OptionalInt max = Arrays.stream(new int[] {2,4,7,9,4,3}).max();

		Optional<String> firstElement = Stream.of("First", "Second", "Third", "Fourth").findFirst();

	}

}
