package Quiz;

import java.util.Scanner;

public class QB_rater {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter passed attempts: ");
		double ATT = input.nextInt();
		System.out.println("Enter completions number: ");
		double COMP = input.nextInt();
		System.out.println("Enter yards number: ");
		double YDS = input.nextInt();
		System.out.println("Enter interceptions number: ");
		double INT = input.nextInt();
		System.out.println("Enter touchdowns number: ");
		double TD = input.nextInt();
		input.close();
		
		double a = (COMP/ATT -.3) * 5;
		double b = (YDS/ATT - 3) * .25;
		double c = (TD/ATT)*20;
		double d = 2.375 - (INT/ATT * 25);
		if (a < 0) a = 0;
		if (a > 2.375) a = 2.375;
		if (b < 0) b = 0;
		if (b > 2.375) b = 2.375;
		if (c < 0) c = 0;
		if (c > 2.375) c = 2.375;
		if (d < 0) d = 0;
		if (d > 2.375) d = 2.375;
		double score = (a+b+c+d)/6 * 100;	
		System.out.print(score);
	}
}