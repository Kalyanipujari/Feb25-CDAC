public class PrePostIncDec{

	public static void main(String args[])
	{
		int a=5, b=10, result =0;
		System.out.println(" Original Numbers a = " +a+" b = "+b);
		result = a++ - b-- + ++b + --a - a-- + b++;
		//	  5  -  10 +  10 +  5  -  5  +  10 => -5 + 15 + 5  => 10 + 5 => 15 
		System.out.println("Result of expression : "+result);
		System.out.println("After evaluating expression a = " +a+" b = "+b);


	}
}