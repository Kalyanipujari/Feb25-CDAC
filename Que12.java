class Que12
{
	public static void main(String args[])
	{
		int no = 12345,reverseNo=0;
		int originalNo=no;
		while(no != 0)
		{
			int remainder = no%10;
			reverseNo = reverseNo *10 +remainder;
			no = no/10;
		}
		System.out.println("The reverse number "+ originalNo +" is "+reverseNo);
	}
}