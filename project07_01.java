package project07_01;
import java.util.Scanner;
public class project07_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number from 1 to 7:");
		int i = in.nextInt();
		switch (i) {
		case 1:
			System.out.printf("Monday");
			break;
		case 2:
			System.out.printf("Tuesday");
			break;
		case 3:
			System.out.printf("Wednesday");
			break;
		case 4:
			System.out.printf("Thursday");
			break;
		case 5:
			System.out.printf("Friday");
			break;
		case 6:
			System.out.printf("Saturday");
			break;
		case 7:
			System.out.printf("Sunday");
			break;
			default:
				System.out.printf("Error! Incorrect input!");	
		}
	}
		
	}
	

