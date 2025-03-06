/*
	Q2: Write a program to check whether a given number is even or odd using only bitwise
		operators.
		Hint: Use n & 1 to check.
*/

public class Q2 { 


	public static void main(String args[])
	{
		int n = 5;
		if ((n & 1)== 1) 
		{
			System.out.println(n + " is odd.");
		} 
		else 
		{
			System.out.println(n + " is even.");
		}
	}
}