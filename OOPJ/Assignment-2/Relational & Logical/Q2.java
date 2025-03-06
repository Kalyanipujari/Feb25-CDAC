/*
	Q7: Implement a Java program that checks whether a given year is a leap year or not using
logical (&&, ||) operators

*/

public class Q2 {
	public static void main(String args[])
	{
		int year = 2024;
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) 
		{
            System.out.println(year + " is a Leap Year.");
        } 
		else 
		{
            System.out.println(year + " is not a Leap Year.");
        }
	}
}