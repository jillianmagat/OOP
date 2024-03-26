package week3;

public class Ex7DF {
	public static void main(String[] args) {
		System.out.println("(D) Numbers and their squares:");
		int x = 1; //EX.7D
		while(x<=10) {
			System.out.println(x + " => " + Math.pow(x, 2));
			x++;
		}
		
		String name = "Chipi chipi chapa chapa"; //EX.7F
		System.out.print("\n(F) Uppercase of \"" + name + "\": " + name.toUpperCase());				
	}
}
/*d. Output all the numbers and their squares between 1 and 10.
f. Output all the uppercase letters.*/