package Pranav;

import java.util.ArrayList;

public class Add2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(1);
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(2);
		list2.add(4);
		list2.add(9);
		list2.add(0);
		
		//System.out.println(list2);
		
		
		list.addAll(list2);
		System.out.println(list2);
	}

}
