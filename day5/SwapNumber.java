package day5;

import java.util.Scanner;  
class SwapNumbers
{  
    public static void main(String[] args) 
    {  
       int a,b,t;  
       
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       a = sc.nextInt();  
       b = sc.nextInt();  
       System.out.println("before swapping numbers: "+a +"  "+ b);  
    
       t = a;  
       a = b;  
       b = t;  
       
       System.out.println("After swapping: "+a +"   " + b);  
       System.out.println( );  
    }    
}  