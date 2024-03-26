package week2;

import java.util.Scanner;

public class Ex1 { /*subtraction*/

	public static void main(String[] args) {
		Scanner differenceOfNumbers = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = differenceOfNumbers.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = differenceOfNumbers.nextInt();
        int difference = firstNumber - secondNumber;

        System.out.println("The difference between " + firstNumber + " and " + secondNumber + " is " 
        + difference);
	}

}

/*Exercise 1.1	Write a java program to display the result of difference of two numbers. 
	A user will enter two integers ( import Scanner)
	Program will calculate their difference
	Program then display the result*/