/*
	Q19: Write a Java program that checks whether a character is uppercase, lowercase, or
	not a letter using only the ternary operator

*/

public class Q4{
	public static void main(String args[])
	{
		char ch='b';
		String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" :
                        "Not a Letter";
        System.out.println("The character is: " + result);		
	}
}