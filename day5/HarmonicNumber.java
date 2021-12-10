package day5;
import java.io.*;

class HarmonicNumber 
{
     
public double Harmonic(int N)
{
    double harm = 1;
    for (int i = 2; i <= N; i++) 
    {
        harm = harm + (double)1 / i;
    }
 return harm;
}
 
    public static void main (String[] args) 
    {
//     int N = 8;
    	HarmonicNumber h1 = new HarmonicNumber();
        double val = h1.Harmonic(9);
        System.out.println(val);
     
    }
}
