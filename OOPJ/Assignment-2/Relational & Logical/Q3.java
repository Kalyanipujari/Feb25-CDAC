/*
	Q8: Write a program that takes three boolean inputs and prints true if at least two of
them are true. USE logical operator (&& , ||)

*/

public class Q3 {
	public static void main(String args[])
	{
			boolean a = true, b=false, c=false;
			boolean result = (a && b) || (b && c) || (a && c);
			System.out.println("At least two values are true : " + result);
	}
}