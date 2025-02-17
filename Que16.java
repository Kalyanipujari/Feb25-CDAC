class Que16
{
	public static void main(String args[])
	{
		int no=17, flag=0;
		for(int i=2; i<no; i++)
		{
			if(no%i == 0)
			{
				System.out.println("The number "+no+" is Not Prime");
				flag=1;
				break;
			}
			
		}
		if(flag == 0)
		{
			System.out.println("The number "+no+" is Prime");
		}

	}
}