// Program on Array

import java.util.*;

class Program7
{
	public static void main(String str[])
	{
	    Scanner sobj = new Scanner(System.in);
	    int iSize = 0;
	    int iCnt = 0;

	    System.out.println("Enter number of elements");
	    iSize = sobj.nextInt();

	    int Arr[] = new int[iSize];

	    System.out.println("Enter numbers");
	    for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	        Arr[iCnt] = sobj.nextInt();
	    }

	    System.out.println("Entered elements are");
	    for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	       System.out.println(Arr[iCnt]);
	    }    
	}
}