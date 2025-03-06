/*
	Q3: Implement a program that calculates the sum of digits of an integer using modulus
		(%) and division (/) operators.

*/

public class Q3 { 


	public static void main(String args[])
	{
		int n = 321, sum=0;
		System.out.print("Sum of digits "+n);
		while(n>0)
		{
			sum += n % 10; 
            n /= 10;
		}
		System.out.print(" is " +sum);
		
	}
}