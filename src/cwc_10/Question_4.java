package cwc_10;
//Write a program to input a number and check if it is an Automorphic number or not.
import java.util.*;
public class Question_4 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number to be checked as Automorphic");
       int n = sc.nextInt();
       sc.close();
       int count = no_of_digits(n);
      // System.out.println(cn1);
       int sq = n*n;
       System.out.println("Square : "+sq);
       extraction(sq,n,count);
       
	}
	public static int no_of_digits(int num)
	{
		int i = 0;
        while(num > 0) 
        {
        	i++;
        	num = num/10;
        }
		return i;
	}

	public static void extraction(int sq,int n,int count)//idea is to extract simultaneously and check if same if yes then increment x
	{
		int copy = 0,copy1 = 0,x=0;
		for(int i = 1; i <= count ; i++)
		{
			copy = n%10;
			copy1 = sq%10;
			if(copy == copy1)
				x++;
			n = n/10;
			sq = sq/10;
		}
		if(x == count)
            System.out.println("The number is a Automorphic number");
		else
			System.out.println("The number is NOT a Automorphic number");
	}
}
