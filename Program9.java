// Accept N numbers from user and display it and return the addition 

import java.util.*;

class Program9
{
	public static void main(String str[])
	{
	   Scanner sobj = new Scanner(System.in);
	   int iSize = 0;
	   int iCnt = 0;
	   int iRet = 0;

	   System.out.println("Enter number of elements");
	   iSize = sobj.nextInt();

	   Prajakta pobj = new Prajakta(iSize);
	   pobj.Accept();
	   pobj.Display();
	   iRet = pobj.Add();

       System.out.println("Addition is :"+iRet);

	}
}
class ArrayX
{
	public int Arr[];

	public ArrayX(int iSize)
	{
	   Arr = new int[iSize];
	}

	public void Accept()
	{
	   Scanner sobj = new Scanner(System.in);
	   int iCnt = 0;

       System.out.println("Enter elements");
	   for(iCnt = 0; iCnt < Arr.length; iCnt++)
	   {
           Arr[iCnt] = sobj.nextInt();
	   }
	}

	public void Display()
	{
	   int iCnt = 0;

	   System.out.println("Elements are :");
	   for(iCnt = 0; iCnt < Arr.length; iCnt++)
	   {
	       System.out.println(Arr[iCnt]);
	   }
	}
}

class Prajakta extends ArrayX
{
	public Prajakta(int iValue)
	{
	    super(iValue);
	}

	public int Add()
	{
	    int iSum = 0;
	    int iCnt = 0;

	    for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	       iSum = iSum + Arr[iCnt];
	    }
	    return iCnt;
	}
}