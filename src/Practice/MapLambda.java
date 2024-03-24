package Practice;

import java.util.HashMap;
import java.util.Map;

public class MapLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map = new HashMap<>();
		
		map.put(1,"rajesh");
		map.put(3, "raj");
		map.put(5, "kal");
		map.put(8, "ravi");
		map.put(2, "amma");
		map.put(7, "mango");
		map.put(6, "love");
		
		System.out.println(map);
		
		/*for(Map.Entry<Integer , String> entry : map.entrySet()){
			
			System.out.println("id :" +entry.getKey()+ " name :"+entry.getValue());
			
		}*/
		
		map.forEach((k,v)->System.out.println("id : "+ k + "name : " + v));
		
	}

}
