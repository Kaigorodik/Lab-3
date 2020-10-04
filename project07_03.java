package project07_03;
import java.util.Scanner;
public class project07_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the number of numbers in the sequence:");
		int a = in.nextInt();
		int n0=1;
		int n1=1;
		int n2;
		System.out.print (n0+" "+n1+" ");
		for (int i=3; i<=a;i++) {
			n2=n0+n1;
			System.out.print (n2+" ");
			n0=n1;
			n1=n2;
		}
		System.out.println ();
	}

}
