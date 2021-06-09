package cwc_10;
//Write a program to reverse a string.
import java.util.Scanner;
public class Question_9 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String");
       String str = sc.next();
       sc.close();
       String s1 = "";
       for(int i = 0 ; i<str.length() ; i++)
       {
    	   s1 = str.charAt(i)+s1;
       }
       System.out.println("Reverse string is : "+s1);
	}

}
