package cwc_10;
//Write a program to find the maximum of three numbers without using third variable.
import java.util.*;
public class Question_6 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 3 numbers ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
      // (or print x) int x = (a>b)?((c>a?c:a)):(c>b?c:b);
       sc.close();
       if(a>b)
       {
    	   if(c>a)
    		   System.out.println(c);
    	   else
    		   System.out.println(a);
       }
       else
       {
    	   if(c>b)
    		   System.out.println(c);
    	   else
    		   System.out.println(b);
       }
	}

}
