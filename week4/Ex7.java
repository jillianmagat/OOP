package week4;
public class Ex7 {
	int size;
	
	public Ex7(int x) { //a constructor that accepts the size of the box as a argument”,
		size = x;
	}
	
	public static void main(String[] args) { //and”, a method to 'draw' (i.e. output) the box to the screen.
		Ex7 box1 = new Ex7(5); //CREATE NEW INSTANCE
		box1.drawBoxTopBottom();
		box1.drawBoxSide();
		box1.drawBoxTopBottom();
		System.out.print(box1.toString());
	}
	
	public void drawBoxTopBottom(){ 
		System.out.print(" ");
		for (int i=0;i<size;i++) {
			System.out.print("-");
		}
	}
	
	public void drawBoxSide() {//a method that sets the size of the box
		System.out.println();
		for (int y=0; y<size; y++) {
			System.out.print("l");
			for (int z=0; z<size;z++) {
				System.out.print(" ");
			}
			System.out.print("l");
			System.out.println();
		}
	}
	
	public String toString() { //a method called toString() that returns the string value of size of the box”
		return "\nBox size is " + size + "x" + size;
	}
}

/*Define a class called boxes. 
 * The purpose of this boxes class is to be able to output a square box of various sizes (up to a maximum of size 10). 
 * Use the '-' character to draw the top and bottom of the box; and use the lower case 'l' character to draw the sides. 
 * Your boxes class must have the following:
 *   - a method that sets the size of the box”,
 *   - a constructor that accepts the size of the box as a argument”,
 *   - a method called toString() that returns the string value of size of the box”,
 *   - and”, a method to 'draw' (i.e. output) the box to the screen.
 
Example:
 -
l l
 -
box of size 1

 --
l  l
l  l
 --
box of size 2

 -----
l     l
l     l
l     l
l     l
l     l
-----
box of size 5

*/