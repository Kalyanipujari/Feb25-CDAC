/*
	Q9: Implement a Java program that checks if a number is within a specific range (20 to
	50) without using if-else.
	Hint: Use logical AND (&&) in a print statement.
*/

public class Q4{
	public static void main(String args[])
	{
		int number = 19;
		System.out.println("Is the number in range 20 to 50? :  " + (number >= 20 && number <= 50));
	}
}
