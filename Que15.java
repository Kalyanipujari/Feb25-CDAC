class Que15
{
	public static void main(String args[])
	{
		int a=5,fact=1, i=1;
		while(i<=a)
		{
			fact*=i;
			i++;
		}
		System.out.println("The factorial of "+a+" is " + fact);
	}
}