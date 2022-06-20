// Accept number from user and print the addition

import java.util.*;

class Program4
{
	public static void main(String str[])
	{
	    Scanner sobj = new Scanner(System.in);
	    int iNo1 = 0, iNo2 = 0, iAns = 0;

	    System.out.println("Enter first number");
	    iNo1 = sobj.nextInt();

	    System.out.println("Enter second number");
	    iNo2 = sobj.nextInt();

	    Prajakta pobj = new Prajakta();
	    iAns = pobj.Addition(iNo1, iNo2);

	    System.out.println("Addition is :"+iAns);

	}
}
class Prajakta
{
	public int Addition(int i, int j)
	{
	    int iResult = 0;

	    iResult = i + j;

	    return iResult;
	}
}
