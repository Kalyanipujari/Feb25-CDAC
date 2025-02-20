import java.util.Scanner;
class Ass2Sec2_Que3{
	public static void main(String args[])
	{

		/*

			Write a program that acts as a simple calculator. It should accept two numbers and an operator
			(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested 
			ifelse to check if division by zero is attempted and display an error message 

		*/
		Scanner sc = new Scanner(System.in);
		int no1, no2, result;
		char operator;
		System.out.println("Enter first number : ");
		no1= sc.nextInt();
		System.out.println("Enter second number : ");
		no2= sc.nextInt();
		System.out.println("Enter operator : ");
		operator= sc.next().charAt(0);

		switch(operator)
		{
			case '+':
				result = no1 + no2;	
				System.out.println("Addition is :" + result);
				break;
			case '-':
				result = no1 - no2;	
				System.out.println("Substraction is :" + result);
				break;

			case '*':
				result = no1 * no2;	
				System.out.println("Multiplication is :" + result);
				break;

			case '/':
				if(no2 == 0)
				{
					System.out.println("Division by 0 is not possible.");	
				}
				else
				{
					result = no1 / no2;	
					System.out.println("Division is :" + result);
				}
				break;
			default:
				System.out.println("Please enter correct operation!");
				break;
		}
		//Scanner.close();		
	}
}