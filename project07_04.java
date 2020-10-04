package project07_04;
import java.util.Scanner;
public class project07_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first integer:");
		int a = in.nextInt();
		System.out.print("Input the second integer:");
		int b = in.nextInt();
		while (b<=a) {
	    System.out.print (b + "  ");
	    b+=1;
	    if (a==b) break;
	    }
		while (a<=b) {
		    System.out.print (a + "  ");
		    a+=1;
		    if (a>=b) break; 
}
		if (a<=b) System.out.print (b);
}
}