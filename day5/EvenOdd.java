package day5;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}