class Que14
{
	public static void main(String args[])
	{
		int n=1, no1=0, no2=1,fib=0;
		System.out.println(no1);
		while(n<10)
		{	
			System.out.println(no2);
			fib=no1+no2;
			no1 = no2;
			no2 = fib;
			n++;	
		}
			
	}
}