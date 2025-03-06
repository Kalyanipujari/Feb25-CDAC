/*
	Q4: Write a program to find whether a given number is divisible by 3 without using the
	modulus (%) or division (/) operators.
	Hint: Use subtraction and bitwise shifts.

*/
public class Q4 {
    public static void main(String[] args) 
	{
        int num = 14, sum = 0;

        while (num > 0) 
		{
            int digit = num - ((num >> 3) * 10);  
            sum += digit;
            num = (num - digit) >> 3; 
        }

       
        while (sum >= 3) 
		{
            sum -= 3;
        }

        if (sum == 0) 
		{
            System.out.println("The number is divisible by 3.");
        } 
		else 
		{
            System.out.println("The number is not divisible by 3.");
        }
    }
}

