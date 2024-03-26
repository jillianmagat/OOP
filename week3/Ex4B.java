package week3;
public class Ex4B {
	public static void main(String[] args) {
		System.out.println("The perfect squares between 1 and 100 are:");
		for (int num = 1; num >= 1 & num<=100; num++) {
			double sqrt = Math.sqrt(num);
			if(Math.floor(sqrt)==sqrt) {
				System.out.println(num);
			}
		}	
	}
}

/*Write a Java program to display all the integers between 1 and 100 that are perfect squares. 
(Hint: A perfect square is a number whose square root is a whole number, 
for instance 1 is a perfect square, but 2 and 3 are not and 4 is a perfect square since the square root of 4 is 2 
and 2 is a whole number)*/