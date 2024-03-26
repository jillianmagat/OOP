package week4;
public class Ex4 {
	
	static int findIndex(char[] code, char c) {
		for(int x = 0; x<code.length; x++) {
			if (code[x]== c) {
				return x;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		char[] code = { 'a', 'b', 'c', 'd', 'e', 
						'f', 'g', 'h', 'i', 'j', 
						'k', 'l', 'm', 'n', 'o', 
						'p', 'q', 'r', 's', 't', 
						'u', 'v', 'w', 'x', 'y', 
						'z', ' '};
		char[] orig = { 'c', 'r', 'g', 'z', 'a', 
						'v', 'i', 'b', 's', 'd', 
						'o', 'e', 'q', 'f', 'h', 
						'u', 'j', 'x', 'k', 'l', 
						'w', 'm', 'y', 'n', 'p', 
						't', ' '};

		String text = "g tgsl Qefe";
		
		for (int i =0; i<text.length(); i++) {
			char c = text.charAt(i); //1. GET THE LETTER
			
			//2. GET THE INDEX OF THE CHAR IN CODE[]
			int index = findIndex(code,c);
			//3. GET THE EQUIVALENT TO ORIG[]
			if(index!=0) { //IF CHAR IS LOWERCASE
				System.out.print(orig[index]);
			}
			else { //IF CHAR IS UPPERCASE
				char lowerCase = Character.toLowerCase(c);
				index = findIndex(code,lowerCase);
				System.out.print(Character.toUpperCase(orig[index]));
			}
		}
	}
}


//Write a Java program that decodes a coded message. The coded message is "g tgsl Qefe." 
//The key to the code is given by the following table:*/
	//a  b	c	d	e	f	g	h	i	j	k	l	m	n	o	p	q	r	s	t	u	v	w	x	y	z
	//c  r	g	z	a	v	i	b	s	d	o	e	q	f	h	u	j	x	k	l	w	m	y	n	p	t
//For example 'a' decodes to 'c', 'b' decodes to 'r' and so on. You should be able to easily modify your program to decode a different message.