package assignment1;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args)
	{
	
		int a;
		int b;
		
		Scanner s= new Scanner(System.in);
		 System.out.println("Enter Value");
		 
		 a=s.nextInt();
		  System.out.println("Enter Value");
		  b=s.nextInt();

		 
		  int max= (a>b ?  a  :  b);
			System.out.println("Greater Number:"+max);
		
		
		
		
	}

}
