package week3;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();
        
        if(a != b && a != c && b != c) { //3 DIFFERENT NUMBERS
        	if(a<b){
        		b = a;
        	}
        	System.out.println(Math.min(b, c));
        }      
        else if ((a == b & c != a)|(a== c & b != a)|(b == c & a != b)) { //2 SAME NUMBERS
        	if(a == b & c != a) {
        		if(a<c) {
        			System.out.print(a + ", " + b);
        		}
        		else {
        			System.out.print(c);
        		}
        	}
        	else if(a == c & b != a) {
        		if(a<b) {
        			System.out.print(a + ", " +  c);
        		}
        		else {
        			System.out.print(b);
        		}
        	}
        	else {
        		if(b<a) {
        			System.out.print(b + ", " + c);
        		}
        		else {
        			System.out.print(a);
        		}
        	}
        }
        else { //ALL SAME NUMBERS
        	System.out.print(a +  ", " + b + ", " + c);
        }
	}
}

/*Exercises: 2: Write a program that prompts the user to input three numbers. The program should output the smallest numbers. */