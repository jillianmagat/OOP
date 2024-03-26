package week3;
import java.util.Scanner;
public class Ex1A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number between 1 and 24: ");
        int random = input.nextInt();
        
        if (random<18) {
        	System.out.print("Good day");
        }
        else {
        	System.out.print("Good evening");
        }
	}
}

/*•	Write a program to take an input number from user between 1 and 24. Use if statement to display the output. 
  * If the input is less than 18, print a "Good day" greeting, otherwise print "Good evening".*/