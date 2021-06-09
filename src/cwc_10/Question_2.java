package cwc_10;
import java.util.*;

public class Question_2 
{   
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter how many number of rows of the array");
      int row = sc.nextInt();
      System.out.println("Enter how many number of columns of the array");
      int col = sc.nextInt();
      int pro = row*col;
      int arr[][] = new int[row][col];
      System.out.println("Enter the elements of the array");
      for(int i = 0 ; i<row ; i++)
    	  for(int j = 0 ; j<col ; j++)
               arr[i][j] = sc.nextInt();
      
      int sort[] = new int [pro];//new 1d array for sorting
      int x = 0;//control variable for 1d array sort
      //start
      for(int i = 0 ; i<row ; i++)
    	  for(int j = 0 ; j<col ; j++,x++)
               sort [x] = arr[i][j]  ;
      
      System.out.println("Enter 1 for Ascending order:- \nEnter 0 for Descending order:-");
      int ch = sc.nextInt();
      switch(ch)
      {
      case 1 :  for(int i = 0 ; i <pro ; i++)
    	            for(int j = 0 ; j<pro-i-1 ; j++)
    	            	if(sort[j]>sort[j+1])
    	            	{
    	            		int temp = sort[j];
    	            		sort[j] = sort[j+1];
    	            		sort[j+1] = temp;
    	            	}
      
                x = 0;
                for(int i = 0 ; i<row ; i++)
    	            for(int j = 0 ; j<col ; j++,x++)
                        arr[i][j] = sort[x];
              
                display(arr);
                break;
        
      case 0 :    for(int i = 0 ; i <pro ; i++)
                     for(int j = 0 ; j<pro-i-1 ; j++)
          	           if(sort[j]<sort[j+1])
          	          {
          		        int temp = sort[j];
          		        sort[j] = sort[j+1];
          		        sort[j+1] = temp;
          	          } 
      
                    x = 0; 
                  for(int i = 0 ; i<row ; i++)
                    for(int j = 0 ; j<col ; j++,x++)
                       arr[i][j] = sort[x];
    
                   display(arr);
    	           break;
    	  
        default:System.out.println("Enter correct value please.");
      }
      sc.close();
	}
	
	public static void display(int x[][])//method to display sorted 2d matrix
	{
	    System.out.println("The sorted 2D matrix as per your choice is"); 
		for(int i = 0 ; i<x.length ; i++)
	    	 {
	    	  for(int j = 0 ; j<x[i].length ; j++)
	               System.out.print(x[i][j]+" ");
              System.out.println();
	    	 }
	}

}
