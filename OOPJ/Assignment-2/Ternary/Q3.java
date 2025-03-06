/*
	Q18: Given a student’s percentage, print “Pass” if the percentage is 40 or above;
	otherwise, print “Fail”, using only the ternary operator

*/

public class Q3{
	public static void main(String args[])
	{
		double percentage = 75; 
        String result = (percentage >= 40) ? "Pass" : "Fail"; 
        System.out.println("Result: " + result);	
	}
}