/*
	Q20: Implement a Java program that returns the absolute value of a given number using
	the ternary operator (without using Math.abs()).

*/

public class Q5{
	public static void main(String args[])
	{
		int num= -23;
		int absValue = (num < 0) ? -num : num;
        System.out.println("Absolute value: " + absValue);	
	}
}