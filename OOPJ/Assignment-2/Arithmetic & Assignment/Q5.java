/*
	Write a Java program to swap two numbers using the += and -= operators only

*/
public class Q5 {
    public static void main(String[] args) 
	{
        int n1 = 12, n2 = 5 ;
		System.out.println("------------------------");
		System.out.println("Before swapping :");
		System.out.println("n1 = "+n1+" n2 = "+n2);
		
		n1+=n2;
		n2-=n1;
		n2=-n2;
		n1-=n2;
		
		System.out.println("------------------------");
		System.out.println("after swapping :");
		System.out.println("n1 = "+n1+" n2 = "+n2);
		
    }
}

