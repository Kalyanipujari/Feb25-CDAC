public class ReverseNo {
    public static void main(String[] args) 
{
	int originalNo=1234, reverseNum=0;	
	System.out.println("Initial no before reversing : "+originalNo);

	while(originalNo != 0)
	{
		int digit = originalNo % 10;
		reverseNum = reverseNum * 10 + digit;
		originalNo /= 10;
		//System.out.println(" original No : "+ originalNo);
		
	}
	System.out.print("Initial no after reversing : "+reverseNum);

	
    }
}
