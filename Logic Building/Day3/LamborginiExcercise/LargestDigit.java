public class LargestDigit{
	
	public static void main(String args[])
	{
		int no=1929, largestNo=0;
		System.out.print("Largest no in "+no+" is : ");
		while(no>0)
		{
			int digit = no%10;
			if(digit > largestNo)
			{
				largestNo = digit;
			}
			no /= 10;
		}
		System.out.print(largestNo);
	}
}