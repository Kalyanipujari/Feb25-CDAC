public class AddDigits{

	public static void main(String args[])
	{
		int num = 9876, sum=0;
		System.out.print("Addition of "+num+" is : ");
		while(num != 0)
		{
			int digit = num % 10;
			sum+=digit;
			num /= 10;
		}
		System.out.print(sum);	 
	}
}