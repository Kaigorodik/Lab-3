package project07_05;
import java.util.Scanner;
public class project07_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the number of numbers in the sum:");
		int n = in.nextInt();
		try
        { int s=0, number=3;
            for(int k=1;k<=n;number++)
            {
                while (number % 5 == 2 || number % 3 == 1)
                {
                	System.out.print(number + " ");
                    s += number;
                    k++;
                    break;
                }
                
            }
            System.out.print(" = " + s);
            if(n <= 0)
            	  throw new Exception();
        }
		catch (Exception e){
        	System.out.print("\n"+ "Error! You must enter a natural number!");    
	}
	}
	}


