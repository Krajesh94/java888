package java888;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {

		Map <Integer,String> map = new HashMap<>();

		map.put(1,"Rajesh");
		map.put(2,"sava");
		map.put(null,"kalyan");
		map.put(4,"kasi");

		//System.out.println(map);


		//map.forEach((k,v)->System.out.println("key: " + k + "value " + v));

		/*for(Map.Entry<Integer,String> entry : map.entrySet()){
			System.out.println("key : " +entry.getKey() + "value :" + entry.getValue());
		}*/

		/*if(map != null){

			map.forEach((k,v)->System.out.println("keys :" + k + " values " + v));
		}*/

		map.forEach(
				(k,v)->{

					if(k != null){
						System.out.println("keys :" + k + " values " + v);
					}

				}
				);
	}

}
