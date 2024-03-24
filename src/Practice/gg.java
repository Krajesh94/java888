package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class gg {

	public static void main(String[] args) {

		Scanner scr=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of rows");
		n=scr.nextInt();

		char c='A';
		for(int i=1;i<=n;++i)
		{
			c='A';
			for(int j=1;j<=i;++j)
			{
				System.out.print(c);
				++c;
			}
			System.out.println();
		}
	}
}





