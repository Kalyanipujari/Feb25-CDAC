/*
	Q15: Implement a program to swap odd and even bits of a number using bitwise
	operators.
	Hint: Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1

*/

public class Q5{
	public static void main(String args[])
	{
		int x= 32;
		int evenBits = x & 0xAAAAAAAA; 
        int oddBits = x & 0x55555555;  

        int swapped = (evenBits >> 1) | (oddBits << 1);
        System.out.println("Number after swapping odd and even bits: " + swapped);
	}
}