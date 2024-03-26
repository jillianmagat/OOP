package week2;

public class Ex5 {

	public static void main(String[] args) {
		double earthRadius = 7600/2; //radius = diameter/2
		double sunRadius = 865000/2; //radius = diameter/2
		
		double earthVolume = (4.0/3.0)*Math.PI*Math.pow(earthRadius, 3);
		double sunVolume = (4.0/3.0)*Math.PI*Math.pow(sunRadius, 3);
		double sunRatio = sunVolume/earthVolume;

		System.out.println("The volume of the Earth is " + earthVolume + " cubic miles");
		System.out.println("The volume of the Sun is " + sunVolume + " cubic miles");
		System.out.println("The ratio of the Sun to the volume of the Earth is " + sunRatio);
	}

}

/* Exercise 1.5	The diameter of the Sun is approximately 865,000 miles. The diameter of the earth is approximately 7,600 miles.
Use the methods in Math class to write a Java program calculate and display:
a.) The volume of the Earth in cubic miles.
b.) The volume of the Sun in cubic miles.
c.) The ratio of the Sun to the volume of the Earth.
  Volume of sphere = (4/3) * pi * r³
where r = radius = diameter/2
and pi = 3.14
Hint : To calculate cube, use Java method Math.pow(i, 3), which is equivalent of i3;
*/