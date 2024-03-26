package week2;

public class Ex6 {

	public static void main(String[] args) {
		double fullTank = 40;
		double liters = 8;
		double kms = 100;
		double normalRoad = fullTank/liters*kms;
		double roughRoad = fullTank/(liters*1.15)*kms;
		
		System.out.println("The distance the car can travel on 40 liters of fuel on normal road is " + 
							normalRoad + " kilometers.");
		System.out.println("The distance the car can travel on 40 liters of fuel on rough road is " + 
							roughRoad + " kilometers.");
	}

}

/* Exercise 1.6	Fuel consumption. A motor car use 8 liters of fuel per 100 kilometers of normal road and 15% 
 * more fuel on rough roads. Write a Java program to calculate and display the distance the car can travel 
 * on a full tank of 40 liters of fuel on both normal and rough roads.
 */
