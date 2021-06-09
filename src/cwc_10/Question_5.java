package cwc_10;
//inversion count with all the pairs displayed
import java.util.*;
public class Question_5 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array");
       int size = sc.nextInt();
       int a[] = new int[size];
       
       System.out.println("Enter the elements of the array");
       for(int i=0 ; i < size ; i++)
    	   a[i] = sc.nextInt();
       
       int count = 0;
       for(int i = 0 ; i<size-1 ; i++)
    	   for(int j = i+1; j<size ; j++)
    	   {
    		   if(a[i]>a[j])
    		   {
    			   count++;
    			   System.out.println("("+a[i]+","+a[j]+")");
    		   }
    	   }
       System.out.println("The inversion count of this array is "+count);
       sc.close();
	}

}
