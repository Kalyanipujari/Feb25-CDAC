class Ass2Sec2_Que2{
	public static void main(String args[])
	{

		/*

			Write a program that uses a nested switch statement to print out the day of the week based on an
			integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it
			is a weekday or weekend. 

		*/
		int day=4;
		
		switch(day)
		{
			case 1:
                		System.out.println("Monday");
                		switch ("weekday") 
				{
                    			case "weekday":
                        		System.out.println("It is a Weekday.");
                        		break;
                		}
                	break;
            		case 2:
                		System.out.println("Tuesday");
                		switch ("weekday") 
				{
                    			case "weekday":
                        		System.out.println("It is a Weekday.");
                        		break;
                		}
                		break;
            		case 3:
                		System.out.println("Wednesday");
                		switch ("weekday") 
				{
                    			case "weekday":
                        		System.out.println("It is a Weekday.");
                        		break;
                		}
               		break;
            		case 4:
                		System.out.println("Thursday");
                		switch ("weekday") 
				{
                    			case "weekday":
                        		System.out.println("It is a Weekday.");
                        		break;
                		}
               		break;
            		case 5:
                		System.out.println("Friday");
                		switch ("weekday") 
				{
                    			case "weekday":
                        		System.out.println("It is a Weekday.");
                        		break;
                		}
                	break;
            		case 6:
                		System.out.println("Saturday");
                		switch ("weekend") 
				{
                    			case "weekend":
                        		System.out.println("It is a Weekend.");
                        		break;
                		}
                	break;
            		case 7:
                		System.out.println("Sunday");
                		switch ("weekend") 
				{
                    			case "weekend":
                        		System.out.println("It is a Weekend.");
                        		break;
                		}
                	break;
            		default:
                		System.out.println("Invalid input! Please enter a number between 1 and 7.");
        		
			
		}
	}

}