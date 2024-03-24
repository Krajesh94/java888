package Pranav;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplacateelemove {

	public static void main(String[] args) {

  ArrayList<String> str = new ArrayList<>();
     str.add("raju");
     str.add("rajesh");
     str.add("ramu");
     str.add("raju");
     str.add("amma");
     
     
     System.out.println(str);
     
     HashSet<String>obj = new HashSet<>(str);
     
    // ArrayList<String> str1 = new ArrayList<>(obj);
     
     System.out.println(obj);
  

	}

}
