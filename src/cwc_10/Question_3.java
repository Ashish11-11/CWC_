package cwc_10;
//Write a program to print the following series: 0, 1, 1, 2, 4, 7, 13, . . . . upto n.
import java.util.*;
public class Question_3 {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter how many number of elements of the series");
      int n = sc.nextInt();
      sc.close();
      int s_n = 0;
      int s_n1 = 1;
      int s_n2 = 1;
      int sum = 0;
      System.out.print("The series is : ");
      System.out.print(s_n+", "+s_n1+", "+s_n2+", ");
      for(int i = 4; i<=n ; i++ )
      {
    	  sum = s_n + s_n1 + s_n2;
    	  System.out.print(sum);
    	  s_n = s_n1;
    	  s_n1 = s_n2;
    	  s_n2 = sum;
    	  if(i <= (n-1))
    	  {
    		  System.out.print(", ");
    	  }
      }
	}

}
