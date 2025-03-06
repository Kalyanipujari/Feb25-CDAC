/*
	Q10: Write a program to determine if a character is a vowel or a consonant using the
	ternary operator.
*/

public class Q5{
	public static void main(String args[])
	{
		char ch = 'T';
		String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
					  || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant";
		System.out.println("The character '" + ch + "' is a " + result + ".");
	}
}
