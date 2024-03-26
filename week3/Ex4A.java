package week3;
public class Ex4A {
	public static void main(String[] args) {
		int number = 0;
		int x = 0;
		while (x<=100) {
			number+=Math.pow(x,2);
			x++;
		}
		System.out.print("The sum of squared numbers from 1 to 100: " + number);
	}
}
