package day5;

import java.util.Scanner;

public class QuotientAndRemainder {
	  
    public static void main(String[] args)
    {
  
        
        System.out.println("Enter the Dividend value");
        Scanner sc = new Scanner(System.in);
        
        int dividend = sc.nextInt();
        
        System.out.println("Enter the Dividend value");
        
        int divisor = sc.nextInt();
        
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
  
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}