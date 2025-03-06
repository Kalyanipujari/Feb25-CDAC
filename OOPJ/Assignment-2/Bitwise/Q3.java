/*
	Q13: Implement a Java program to find the absolute value of an integer using bitwise
	operators.
	Hint: mask = num >> 31; abs = (num + mask) ^ mask;

*/

public class Q3{
	public static void main(String args[])
	{
		int num= -12;
		int mask = num >> 31;
        int absValue = (num + mask) ^ mask; 
        System.out.println("Absolute value: " + absValue);
	}
}