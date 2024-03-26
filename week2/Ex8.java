package week2;
import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		Scanner compareStrings = new Scanner(System.in);
		System.out.println("This program compares two words which you are about to enter");
		System.out.print("Enter first word: ");
		String word1 = compareStrings.next();
		System.out.print("Enter second word: ");
		String word2 = compareStrings.next();
    
		//COMPARE EQUALITY OF TWO STRINGS
		if (word1.equals(word2)) {
			System.out.println("The two given strings are equal");
		}
		else {
			System.out.println("The two given strings are unequal");
		}
    
		//COMPARE EQUALITY OF THE FIRST LETTERS OF TWO STRINGS
		char firstLetterWord1 = word1.charAt(0);
		char firstLetterWord2 = word2.charAt(0);

		if (firstLetterWord1 == firstLetterWord2) {
			System.out.println("The first letters of two given strings are equal");
		}
		else {
			System.out.println("The first letters of two given strings are not equal");
		}
	}
}

/*Exercise 1.8	Write a program that compares two strings.
	A user will enter two Strings ( import Scanner)
	Program will compares both strings
	Program then display the result “the two given strings are equal” True/False based on the comparison.
	Program will also compare the first character of each String.
Hint: Use equals(Object anObject) method and charAt(int index)
*/
