package week4;
public class Ex3 {
	public static void main(String[] args) {
		String text = "To be or not to be.";
		String[] textList= text.split(" "); 	//1. DIVIDE EACH WORD AND ADD AS MEMBER OF ARRAY
		String reverseWhole = ""; //5. RETAINER FOR REVERSED SENTENCE
		
		for (int c=0; c<textList.length;c++) { 	//2. LOOP THROUGH EACH WORD
			String originalText = textList[c];
			String reverseText = "";           	
			for(int r=0;r<originalText.length();r++) {	//3. LOOP THROUGH EACH CHARACTER OF WORD FROM INDEX 0
				reverseText = originalText.charAt(r) + reverseText + " "; //4. REVERSE THE LETTER PER WORD
			}
			reverseWhole = reverseWhole + reverseText; //6. PUT BACK REVERSED-WORD IN ORIGINAL SEQUENCE
		}
		System.out.print(reverseWhole);
	}
}

/*Write a program that will reverse the sequence of letters in each word of a paragraph of text of your choice. 
 * For instance, "To be or not to be." Would become "oT eb ro ton ot eb."*/