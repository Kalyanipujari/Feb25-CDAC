public class FactorialNo {
 public static void main(String[] args) 
{
	int no=10, fact=1;
	for(int i=1; i<=10; i++)
	{
		fact*=i;
	}
	System.out.println("Factorial of "+no+" is "+fact);
}
}