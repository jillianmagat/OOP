package week3;
import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		if (x%2 == 0) {
			System.out.print("Even number");
		}
		else {
			System.out.print("Odd number");
		}
	}
}
