/*
	Q17: Implement a Java program that finds the minimum of four numbers using nested
	ternary operators.

*/

public class Q2{
	public static void main(String args[])
	{
		int a=1, b=4, c=7, d=0;
		int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d))
                          : ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));
        System.out.println("The minimum number is: " + min);
	}
}