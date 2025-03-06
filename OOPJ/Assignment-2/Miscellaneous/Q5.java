/*
	Q25: Implement a program that reverses an integer number without using string
	conversion (StringBuilder or toCharArray).
	Hint: Use while(n!=0) { rev = rev * 10 + n % 10 ; n/=10 }

*/
public class Q5 {
    public static void main(String[] args) 
	{
		int num = 12;
        int rev = 0;  
        while (num != 0) {
            rev = rev * 10 + num % 10;  
            num /= 10;  
        }
        System.out.println("Reversed number: " + rev);
    }
}
