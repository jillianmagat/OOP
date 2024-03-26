package week4;
public class Ex2 {
	public static void main(String[] args) {
		String[] song = {"pov","Banana","Solo","Boys Like You","New Thang","Trumpets","Home","Fire Burning","Gasolina","Stickwitu"};
		String container;
		
		for (int x=0; x<song.length; x++) {
			for (int y=0;y<song.length-1; y++) {
				if (song[y].charAt(0)>song[y+1].charAt(0)) {
					container = song[y];
					song[y] = song[y+1];
					song[y+1]= container;
				}
			}
		}
		for (String a: song) {
			System.out.println(a);
		}	
	}
} //LEARNED FROM https://www.youtube.com/watch?v=OUKBP64yZyk (Bubble Sort Code in Java | DSA by Telusko)

/*Modify the Exercise 1 question above to output the songs in alphabetical order. Hint: bubble sort.
 * EXERCISE 1 QUESTION: 
 * Write a Java program that stores the names of your 10 favorite songs in an array of strings.
 * Also store the artist's name in a second array of strings. 
 * Output a list of
			else if  (song[y].charAt(0)>song[z].charAt(0)) {

			} the songs and artists.
 * 
 * */