package java888;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map2List {

	public static void main(String[] args) {


		List<Employee> l = new ArrayList<>();

		l.add(new Employee(1,"Rajesh",2000));
		l.add(new Employee(2,"kalyan",3000));
		l.add(new Employee(3,"kasi",8000));
		l.add(new Employee(4,"ram",700));   
		l.add(new Employee(5,"ram",700));

		/*Map<Integer,String> map = l.stream().collect(
			Collectors.toMap(Employee::getId,Employee::getName));

	     System.out.println("rasult1:" + map);*/


		/*Map<Integer,String> map = l.stream().collect(

				Collectors.toMap(x->x.getId(),x->x.getName()));
		      System.out.println(map);*/

		/*Map<Integer,String> map = l.stream().collect(
				Collectors.toMap(x->x.getId(), x->x.getName(),

						(oldValue,newValue)->oldValue
						
						)
				);*/
		
	/*	 //example 1
        Map result1 = l.stream()
                .sorted(Comparator.comparingLong(Employee::getWebsites).reversed())
                .collect(
                        Collectors.toMap(
                                Employee::getName, Employee::getWebsites, // key = name, value = websites
                                (oldValue, newValue) -> oldValue,       // if same key, take the old key
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        System.out.println("Result 1 : " + result1);*/
		
		Map<Integer, Employee> res2 = l.stream().collect(
				Collectors.toMap(Employee::getId, x -> x));
		
		System.out.println(res2);

	}

}
