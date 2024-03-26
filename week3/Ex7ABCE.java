package week3;
import java.util.Scanner;
public class Ex7ABCE {
	public static void main(String[] args) {
		int firstNum = 1, secondNum = 0, num1Reset = 0, c=0, e=0;
		
		while (firstNum>=secondNum) { //EX. 7A
			System.out.println("(A) Enter two different numbers where the first number\nshould be "
								+ "less than your second number:");
			Scanner input = new Scanner(System.in);
			firstNum = input.nextInt();
			secondNum = input.nextInt();
			num1Reset = firstNum;
		}
		
		System.out.print("\n(B) All odd numbers from " + firstNum + " and " + secondNum + ": "); //EX.7B
		while(firstNum<=secondNum) {
			if(firstNum%2==1) {
				System.out.print(firstNum + " ");				
			}
			firstNum++;
		}
		firstNum = num1Reset;
		
		System.out.print("\n(C) Sum of all even numbers from " + firstNum + " and " + secondNum + ": "); //EX.C
		firstNum += 1;
		while(firstNum<=secondNum) {
			if (firstNum%2==0) {
				c += firstNum;
			}
			firstNum++;
		}
		System.out.print(c);
		firstNum = num1Reset;
		
		System.out.print("\n(E) Sum of all squares of all odd numbers between " + firstNum + " and " 
						+ secondNum + ": "); //EX. 7E
		while(firstNum<=secondNum) {
			if(firstNum%2!=0) {
				e+=Math.pow(firstNum,2);
			}
			firstNum++;
		}
		System.out.print(e);
	}//END OF PUBLIC STATIC VOID MAIN
}

/*Exercises 7: Write a program that uses while loops to perform the following steps:
a. Prompt the user to input 'two integers: firstNum and secondNum. (firstNum must be less than secondNum.)
b. Output all the odd numbers between firstNum and secondNum inclusive.
c. Output the sum of all the even numbers between firstNum and second.Num inclusive.
d. Output all the numbers and their squares between 1 and 10.
e. Output the sum of the squares of all the odd numbers between firstNum and  secondNum inclusive.
f. Output all the uppercase letters.
*/