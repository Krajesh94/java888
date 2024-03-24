package Practice;

import java.util.*;


public class kkk {

	public static void main(String[] args) {
		int a[]={2,4,3,7,5,9};
		int max=0;
		int secmax =0;
		for(int i =0;i<a.length;i++){
			if(a[i]>max){
				max = secmax;
				max =a[i];
		}else if (a[i]>secmax && a[i]!= max){
			secmax = a[i];
		}
		}
		System.out.println(secmax);

		
			
		}
		
	}
		






