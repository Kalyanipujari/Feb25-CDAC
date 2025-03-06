/*
	Q23: Given a number, find whether it is odd or even using the & bitwise operator and print
		 the result without using if-else.

*/
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
       int num = 5;
	   System.out.println((num & 1) == 0 ? "Even" : "Odd");
    }
}
