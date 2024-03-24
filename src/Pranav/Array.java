package Pranav;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();	
		
		list.add(2);
		list.add(1);
		list.add(7);
		list.add(8);
		list.add(2);
		list.add(3);
		
		list.ensureCapacity(17);//list increaded
		list.trimToSize();//list decreaded
		
	
		//ArrayList is empty or not-->(list.isEmpty());
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains(8));// given element is present in an ArrayList or not?
		System.out.println(list.indexOf(7));//particular element in an ArrayList?
		// convert an ArrayList to Array?
		Object[] array = list.toArray();
		for(Object obj : array){
			System.out.println(obj);
			//Getting element at index 3
			System.out.println(list.get(3));
			//Replacing the element at index 3 with '0
			System.out.println(list.set(2, 0));
			
			list.remove(2);
			
			list.clear();
			
		}
		

	
	}

}
