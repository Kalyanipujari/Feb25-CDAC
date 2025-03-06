/*
		Q1: Write a program to swap two numbers without using a third variable and without
		using arithmetic operators like + or -.
		Hint: Use bitwise XOR ^ operator.

*/
public class Q1 { 


	public static void main(String args[])
	{
		int a=5, b=3;
		System.out.println("------------------------");
		System.out.println("Before swapping : ");
		System.out.println(" a = "+a+" b = "+b);
		System.out.println("------------------------");
		
		a = a^b; // 6
		b = a^b; //5
		a = a^b; //3
		
		System.out.println("After swapping : ");
		System.out.println(" a = "+a+" b = "+b);
		System.out.println("------------------------");
	}
}