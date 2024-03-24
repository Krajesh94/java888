package Pranav;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(1);
		list.add(8);
		Iterator<Integer> tt = list.iterator();
		
		while(tt.hasNext()){
			
			System.out.println(tt.next());
			
		}
		

	}

}
