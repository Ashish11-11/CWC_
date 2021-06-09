package cwc_10;
//You have a variable i and when i=1 output is 3,for i=2 output is 8 and for i=3 output is 13.
//you have to find for which value of i output is 78? Condition: Without using any loop
public class Question_7 {

	public static void main(String[] args) 
	{
       int termNumber = term(3,1);
       System.out.println("The number 78 is "+termNumber+"th in the series 3,8,13..");
       if(termNumber==0)
         System.out.println("Term 78 is not found");
	}

	public static int term(int num ,int i)
	{
		if(num==78)
			return i;
		else if(num>78)
			return 0;
		else
			return term(num+5,i+1);
	}
}
