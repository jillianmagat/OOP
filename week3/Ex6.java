package week3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {
	public static final DecimalFormat decimal = new DecimalFormat( "#.00" );
	
	public static void main(String[] args) {
		double frameSizeCost=0, frameColorCost=0, crownCost=0, totalCost;
		int frameLength, frameWidth, frameType, frameColor, frameCrown, crownQty;
		String frameColorCustom;
		
		//FRAME SIZE
		System.out.print("FRAME SIZE\n"
						+ "How many INCHES of LENGTH do you prefer? ");
		Scanner input = new Scanner(System.in);
		frameLength = input.nextInt();
		System.out.print("How many INCHES of WIDTH do you prefer? ");
		frameWidth = input.nextInt();
		System.out.println(" ");
		
		//FRAME TYPE
		System.out.print("FRAME TYPE\n"
						+ "1 - REGULAR\n"
						+ "2 - FANCY\n"
						+ "Enter the number of your corresponding preference (1/2): ");
		frameType = input.nextInt();
		
		switch (frameType) {
		case 1:
			frameSizeCost = (frameLength + frameWidth) * 0.15;
			System.out.print("Frame Size for REGULAR Cost: $" + decimal.format(frameSizeCost));
			break;			
		case 2:
			frameSizeCost = (frameLength + frameWidth) * 0.25;
			System.out.print("Frame Size for FANCY Cost: $" + decimal.format(frameSizeCost));
			break;
		}
		System.out.println("\n");
		
		//FRAME COLOR
		System.out.print("FRAME COLOR\n"
						+ "1 - White\n"
						+ "2 - Custom\n"
						+ "Enter number of preferred color (1/2): ");
		frameColor = input.nextInt();
		
		switch (frameColor) {
		case 1:
			frameColorCost = 0;
			System.out.print("Frame Cost for White: $" + decimal.format(frameColorCost));
			break;
		case 2:
			System.out.print("Enter preferered custom color: ");
			frameColorCustom = input.next();
			frameColorCost = (frameLength + frameWidth) * .1;
			System.out.print("Frame Custom Color for " + frameColorCustom + " Cost: $" + decimal.format(frameColorCost));
			break;
		}
		System.out.println("\n");
		
		//FRAME CROWN
		System.out.print("FRAME ADD-ONS\n"
						+ "Would you like to add CROWNS on corners of frame?\n"
						+ "1 - Yes\n"
						+ "2 - No\n"
						+ "Enter answer (1/2): ");
		frameCrown = input.nextInt();
		
		switch (frameCrown) {
		case 1:
			System.out.print("Enter number of crowns to add: ");
			crownQty = input.nextInt();
			crownCost = crownQty * .35;
			System.out.print("Crown Add-on Cost: $" + decimal.format(crownCost));
			break;
		case 2:
			crownCost = 0;
			System.out.print("Crown Add-on Cost: $" + decimal.format(crownCost));
		}
		
		//TOTAL COST
		totalCost = frameSizeCost + frameColorCost + crownCost;
		System.out.println("\n-------------------------------------------------------------------\n"
							+ "TOTAL COST OF FRAME: $" + decimal.format(totalCost));
	}
}

/*Exercises 6: You have several pictures of different sizes that you would like to frame. 
 * A local picture framing store offers two types of frames-regular and fancy. 
 * The frames are available in white and can be ordered in any color the customer desires. 
 * Suppose that each frame is 1 inch wide. The cost of coloring the frame is $0.10 per inch. 
 * The cost of a regular frame is $0.15 per inch and the cost of a fancy frame is $0.25 per inch. 
 * The customer can also choose to put crowns on the corners, which costs $0.35 per crown. 
 * Write a program that prompts the user to input the following information and then output the cost of framing the picture:
	a. The length and width, in inches, of the picture.
	b. The type of the frame.
	c. Customer's choice of color to color the frame.
	d. If the user wants to add the crowns, then the number of crowns. 
*/
