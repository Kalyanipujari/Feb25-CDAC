import java.util.Scanner;
class Ass2Sec2_Que5{
	public static void main(String args[])
	{

		/*
			Write a program that determines whether a student passes or fails based on their grades in three
			subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or
			more subjects, print the number of subjects they failed in
		*/

		int subject1, subject2, subject3, failedSubjects;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks of 1st subject: ");
		subject1 = sc.nextInt();
		System.out.print("\nEnter marks of 2nd subject: ");
		subject2 = sc.nextInt();
		System.out.print("\nEnter marks of 3rd subject: ");
		subject3 = sc.nextInt();
		if(subject1>40 && subject2>40 && subject3>40)
		{
			System.out.println("PASS");
		}
		else 
		{
            		failedSubjects = 0;
			if (subject1 <= 40) failedSubjects++;
            		if (subject2 <= 40) failedSubjects++;
            		if (subject3 <= 40) failedSubjects++;
	
            		System.out.println("Student is failed in " + failedSubjects + " subjects.");
        	}
	}
}