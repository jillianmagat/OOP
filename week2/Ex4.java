package week2;
public class Ex4 {
	public static void main(String[] args) {
		double principal = 5000;
		double rate = 0.04; //4%
		double period = 10; //10 years
		double rateRaisedToPeriod = Math.pow((1+rate), period);	
		double compoundInterest = principal*rateRaisedToPeriod;
		
		System.out.print("The amount if the principal is $" + principal + " with interest rate " + 
		rate + " in " + period + " years is \n$");
		System.out.printf("%.2f", compoundInterest);
	}
}

/*Exercise 1.4	Compound Interest. Using the compound Interest Formula
A = P * (1 + r)^n 
where A = amount, r = interest rate per time period, and n = number of time periods.
Write a Java program to calculate and display the result where 
P= $ 5000.00 investment ; r = 4% interest rate per year ; n = 10 years.
Hint : To calculate power multipliers, use Java method Math.pow(i, n), which is equivalent of in;
*/
