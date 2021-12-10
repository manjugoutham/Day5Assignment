package day5;


public class PowOfTwo {
    public static void main(String[] args) {

        int n = 30;

        int i = 0;          
        int powerOfTwo = 1;       

        if (i<=n) 
        {
            System.out.println(i + " " + powerOfTwo);  
            powerOfTwo = 2 * powerOfTwo;
            System.out.println(" " + powerOfTwo); 
            i = i + 1;
        }
    }
}