package day5;

import java.util.Scanner;

public class LargestNumber  
{  
public static void main(String[] args)   
{  

	int a,b,c;
	 Scanner sc = new Scanner(System.in);

     System.out.print("Enter a value: ");
     a = sc.nextInt();
     System.out.print("Enter b value: ");
     b = sc.nextInt();
     System.out.print("Enter c value: ");
     c = sc.nextInt();
     
     if(a>=b && a>=c)  
    	 System.out.println(a+" is the largest Number");  

     else if (b>=a && b>=c)  
    	 System.out.println(b+" is the largest Number");  
     else  

    	 System.out.println(c+" is the largest number");  
}  
} 