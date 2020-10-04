package project07_02;
import java.util.Scanner;
public class project07_02 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first three letters of the day of the week:");
		String DayOfWeek = in.nextLine();
		if (DayOfWeek.equals("Mon")) {
		System.out.printf("1");
		} else {
			if (DayOfWeek.equals("Tue")) {
				System.out.printf("2");
		} else {
			if (DayOfWeek.equals("Wed")) {
				System.out.printf("3");
		} else {
			if (DayOfWeek.equals("Thu")) {
				System.out.printf("4");
		} else {
			if (DayOfWeek.equals("Fri")) {
				System.out.printf("5");
		} else {
			if (DayOfWeek.equals("Sat")) {
				System.out.printf("6");
		} else {
			if (DayOfWeek.equals("Sun")) {
				System.out.printf("7");
		} else System.out.printf("Error! Incorrect input!");	
		}
		}
		}
		}
		}
		}
	}
}


