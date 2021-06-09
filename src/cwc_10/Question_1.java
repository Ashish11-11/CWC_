package cwc_10;
// An array of n distinct element is provided find the minimum number of swaps required to sort it.
//I used Arrays.sort() predifined method as in question i am not debarred from using it.
import java.util.*;

public class Question_1 {

	public static int indexof(int[] a, int x)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == x) 
            {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array size");
      int n = sc.nextInt();
      int arr1[] = new int[n];
      System.out.println("Enter array elements");
      for(int i = 0 ; i <n ; i++)
    	  arr1[i] = sc.nextInt();
      int arr2[] = new int[n];
      for(int i = 0 ; i <n ; i++)
    	  arr2[i] = arr1[i];
      Arrays.sort(arr2);
      int count = 0;
      int m = 0,temp = 0;
      
      for(int i = 0 ; i < n ; i++)
      {
    	  if(arr1[i] != arr2[i])
    	  {
    		 count++; 
    		 m = indexof(arr1,arr2[i]);
    		 temp = arr1[i];
    		 arr1[i] = arr1[m];
    		 arr1[m] = temp;
    	  }
      }
      try{ }
      finally 
      {
    	  sc.close();
      }
      System.out.println("The minimum number of swaps required are "+count);
	}

}
