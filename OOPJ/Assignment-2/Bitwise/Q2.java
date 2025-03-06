/*
	Q12: Write a Java program to multiply a number by 8 without using * or / operators.
	Hint: Use bitwise left shift (<<).
*/

public class Q2{
	public static void main(String args[])
	{
		int n= 8;
		int result = n << 3; // Equivalent to num * 8
        System.out.println(n + " multiplied by 8 is: " + result);
	}
}