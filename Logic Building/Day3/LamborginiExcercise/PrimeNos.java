
public class PrimeNos {
	public static boolean isPrime(int num)
 	{
		for(int i=2; i*i<=num;i++)
		{
			if(num%i ==0)
				return false;
		}
		return true;	
 	}

    public static void main(String[] args) 
{
	//finding 5 prime numbers without using methods
	/*
	int no=2,count=0;
	System.out.print("First 5 prime numbers are : ");
	while(count<5)
	{
		boolean isPrime=true;
		for(int i=2; i*i<=no; i++)
		{
			if(no%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.print(" "+no);
			count++;
		}
		no++;
	}
	*/

	int no=2, count=0;
	System.out.print("First 5 prime numbers are : ");
	while(count<5)
	{
		if(isPrime(no))
		{
			System.out.print(" "+no);
			count++;
		}
		no++;		
	}
 }
}
