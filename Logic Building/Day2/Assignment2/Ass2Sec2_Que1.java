class Ass2Sec2_Que1{
	public static void main(String args[])
	{

		/*

			If the score is greater than or equal to 90, print "A"
			If the score is between 80 and 89, print "B"
			If the score is between 70 and 79, print "C"
			If the score is between 60 and 69, print "D"
			If the score is less than 60, print "F" 

		*/

		int score=88;
		if(score>=90)
		{
			System.out.println("A");
		}
		else if(score<=89 && score>=80)
		{	
			System.out.println("B");
		}
		else if(score<=79 && score>=70)
		{
			System.out.println("C");
		}
		else if(score<=69 && score>=60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}

	}


}