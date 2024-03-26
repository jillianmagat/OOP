package week2;

public class Ex7 {
	public static void main(String[] args) {
		String txt = "I love java programming";

		System.out.println("Index 7 to 10 of \"" + txt + "\" is " + txt.substring(7,11));
		System.out.print("Its length is " + (txt.substring(7,11)).length());		
	}
}

/* Exercise 1.7	How long is the string returned by the following expression? What is the string? * 
 * "I love java programming".substring(7, 11); */
