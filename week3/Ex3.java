package week3;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 35: ");
        int number = input.nextInt();
        if(number >= 0 && number <=35) {
        	if (number >=0 && number <=35) {
            	if(number<=9) {
                	System.out.print(number);
                }
                else {
                	char character;
                	character = (char)(number+55);
                	System.out.println(character);
                }
            }
        }
        else {
        	System.out.println("Reenter a number between 0 and 35: ");
            int number1 = input.nextInt();
            number = number1;
        }   
	}
}

/*Write a program that prompts the user to input an integer between 0 and 35. 
 * If the number is less than or equal to 9, the program should output the number; 
 * otherwise, it should output A for 10, B for 11, C for 12, ... , and Z for 35. 
 * (Hint: Use the cast operator, (char) ( ), for numbers>= 10. For uppercase characters A=55, B=56 etc)*/