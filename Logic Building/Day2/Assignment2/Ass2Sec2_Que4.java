import java.util.Scanner;
class Ass2Sec2_Que4{
	public static void main(String args[])
	{

		/*

			Write a program to calculate the discount based on the total purchase amount. Use the following
			criteria:
				 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
				 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
				 If the total purchase is less than Rs.500, apply a 5% discount.
				Additionally, if the user has a membership card, increase the discount by 5%.
		*/
		double totalPurchase, discountPercentage, discountAmount,finalPrice;
		char membership;
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the total purchase amount: ");		
 		totalPurchase = scanner.nextDouble();		
       		
		System.out.print("Do you have a membership card? (y/n): ");
         	membership = scanner.next().charAt(0);
       
        	if (totalPurchase >= 1000) 
		{
            		discountPercentage = 20;
        	} 
		else if (totalPurchase >= 500) 
		{
            		discountPercentage = 10;
        	} 
		else 
		{
            		discountPercentage = 5;
        	}

		if (membership == 'y') 
		{
            		discountPercentage += 5;
        	}

        	discountAmount = (totalPurchase * discountPercentage) / 100;
        	finalPrice = totalPurchase - discountAmount;
        	System.out.println("\nOriginal Purchase Amount: Rs. " + totalPurchase);
        	System.out.println("Discount Applied: " + discountPercentage + "%");
        	System.out.println("Discount Amount: Rs. " + discountAmount);
        	System.out.println("Final Price after discount: Rs. " + finalPrice);
	}
}