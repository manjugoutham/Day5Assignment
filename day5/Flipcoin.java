package day5;
import java.util.Scanner;

public class Flipcoin 
{
	
       public static void main(String[] args)
       {
		
		int head = 0, tail = 0;
		double h1, t1;

		System.out.print("Enter the number of times you want to flip the coin: ");
		Scanner sc =  new Scanner(System.in);
		int val = sc.nextInt();
		
		for (int i = 0; i < val; i++) 
		{
			double ran = Math.random();
			
			if (ran < 0.5)
				tail ++;
			else
				head ++;
			}
		h1 = head / (double) val * 100;
		t1= tail / (double) val * 100;
		
		System.out.println("Percentage of heads: " + h1 + "%");
		System.out.println("Percentage of tails: " + t1 + "%");

       }
}