/*
	Q14: Write a program to count the number of 1s (set bits) in a binary representation of a
	number using bitwise operations.
	Hint: Use n & (n - 1).

*/

public class Q4{
	public static void main(String args[])
	{
		int n= 12;
		int count = 0;
        while (n > 0) {
            n = n & (n - 1); // Removes the rightmost 1-bit
            count++;
        }
		System.out.println(n + " has number of 1s in binary: " + count);
	}
}