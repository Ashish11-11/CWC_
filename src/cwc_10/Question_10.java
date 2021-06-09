package cwc_10;
//Write a program that accepts an integer (n) and computes the value of n+nn+nnn.
import java.util.*;
public class Question_10 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int n = sc.nextInt();
       sc.close();
       String x = Integer.toString(n);     
       System.out.println("N + NxN + NxNxN : "+x+" + "+(x+x)+" + "+(x+x+x));
	}

}
