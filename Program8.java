//Accept N numbers from user and return the addition 

import java.util.*;

class Program8
{
	public static void main(String str[])
	{
	    Scanner sobj = new Scanner(System.in);
	    int iSize = 0;
	    int iRet = 0;
	    int iCnt = 0;

	    System.out.println("Enter number of elements");
	    iSize = sobj.nextInt();

	    int Arr[] = new int[iSize];

	    System.out.println("Enter elements");
	    for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	       Arr [iCnt] = sobj.nextInt();
	    }

	    Prajakta pobj = new Prajakta();
	    iRet = pobj.Addition(Arr);

	    System.out.println("Addition is :"+iRet);
	}
}

class Prajakta
{
	public int Addition(int Brr[])
	{
	   int iCnt = 0;
	   int iSum = 0;

	   for(iCnt = 0; iCnt < Brr.length; iCnt++)
	   {
	       iSum = iSum + Brr[iCnt];
	   }

	   return iSum;
	}
}