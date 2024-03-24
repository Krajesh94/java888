package Pranav;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
  
public class JavaHashMapExample 
{    
    public static void main(String[] args) 
    {
        //Creating the HashMap 
         
        HashMap<Integer, String> map = new HashMap<Integer, String>();
         
        //Adding key-value pairs to HashMap
         
        map.put(1, "AAA");
         
        map.put(2, "BBB");
         
        map.put(3, "CCC");
         
        map.put(4, "DDD");
         
        map.put(5, "EEE");
         
        //Retrieving the Key Set
         
        /*Set<Integer> keySet = map.keySet();
         
        for (Integer key : keySet) 
        {
            System.out.println(key);
        }*/
        
        /*Collection<String> values = map.values();
        
        for (String value : values) 
        {
            System.out.println(value);
        }*/
        
        //hashmap to arraylist--->
           Set<Integer> key = map.keySet();
           ArrayList<Integer> k = new ArrayList<>(key);
           
           for(Integer kk : k){
        	   System.out.println(kk);
           }
           
        Collection<String> v =   map.values();
        
        ArrayList <String> vv = new ArrayList<>(v);
        
        for(String vvv : vv){
        	
        	System.out.println(vvv);
        }
    }   
}
