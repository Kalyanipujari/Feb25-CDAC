/*
	 Write a program to find the largest of three numbers using only the ternary operator (? :).

*/
public class Q1{
	public static void main(String args[])
	{
		int a = 10, b = 12, c = 21;
		int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("The largest number is : "+largest);
	}
}