/*
	Q16: Write a program that determines whether a given number is positive, negative, or
	zero using only the ternary operator

*/

public class Q1{
	public static void main(String args[])
	{
		int num= -32;
		String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);
	}
}