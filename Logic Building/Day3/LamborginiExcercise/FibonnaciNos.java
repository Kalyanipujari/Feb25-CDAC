public class FibonnaciNos {
    public static void main(String[] args) 
{
	int num1=1, num2=1, fib=0;
	fib = num1+num2;

	System.out.print("Fibonnaci Series : " + num1 + " "+num2);

	while(fib < 21)
	{
		fib = num1 + num2;
		num1 = num2;
		num2 = fib;	
		System.out.print(" " + fib);	
	}
		
    }
}
