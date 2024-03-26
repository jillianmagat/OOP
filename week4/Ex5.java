package week4;
public class Ex5 {
	public static void main(String[] args) {
		String[] paragraphs = {"Lose all the weight you want",
				 "I can'\t I must work", 
				 "That would be like a keyword search.",
				 "This would be Victoria.",
				 "Join the party.", 
				 "To be or not to be.",
				 "That is a question to test keyword search.",
				 "Can you find a needle in a hay stack?",
				 "This could be the last paragraph”, but its not.",
				 "Ada Lovelace is the worlds first programmer as of 1860."};
		Boolean found = false;
		
		//1. SET THE PHRASE
		String find = "be or";
		
		//2. LOOP ALL THROUGH PARAGRAPH
		for (int i = 0; i < paragraphs.length; i++) {
			if (paragraphs[i].contains(find)) {
                found = true;
                System.out.println("paragraph[" + i + "] = " + paragraphs[i]);
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
	}
}
/*Search Engine: Write a Java program that performs a search for a given phrase (make up any phrase you like). 
 * The program will search through an array of 10 paragraphs taken from a book of your choice. 
 * Your program should store the 10 paragraphs in an array of strings. If the phrase is not found output a message stating this.

If the phrase is found output the array index(s) and the paragraph(s) that contained the phrase.
(HINT: Java method contains e.g. "I like Java Programming".contains("Java") will return true.)

paragraphs[0]="Lose all the weight you want.";
paragraphs[1]="I can't I must work";
paragraphs[2]="That would be like a keyword search.";
paragraphs[3]="This would be Victoria.";
paragraphs[4]="Join the party.";
paragraphs[5]="To be or not to be.";
paragraphs[6]="That is a question to test keyword search.";
paragraphs[7]="Can you find a needle in a hay stack?";
paragraphs[8]="This could be the last paragraph”, but its not.";
paragraphs[9]="Ada Lovelace is the worlds first programmer as of 1860.";
*/