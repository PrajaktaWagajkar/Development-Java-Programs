//Accept number from user and check whether it is prime or not

import java.util.*;

class Program5
{
	public static void main(String str[])
	{
	   Scanner sobj = new Scanner(System.in);
	   int iValue = 0;
	   boolean bRet = false;

	   System.out.println("Enetr number");
	   iValue = sobj.nextInt();

	   Prajakta pobj = new Prajakta();
	   bRet = pobj.CheckPrime(iValue);

	   if(bRet == true)
	   {
	      System.out.println("It is prime number");
	   }
	   else
	   {
	      System.out.println("It is not prime number");
	   }
	}
}

class Prajakta
{
	public boolean CheckPrime(int iNo)
	{
	   int iCnt = 0;
	   boolean bFlag = true;

	   for(iCnt = 2; iCnt <= iNo/2; iCnt++ )
	   {
	       if(iNo % iCnt == 0)
	       {
	          bFlag = false;
	          break;
	       }
	   }
	   return bFlag;
	}
}