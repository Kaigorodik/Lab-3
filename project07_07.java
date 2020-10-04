package project07_07;
import java.util.Arrays;
import java.util.Scanner;
public class project07_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the size of the array:");
		int size = in.nextInt();
        int n = size;
        char[] charArray = new char[n];
        char[] omitArray = new char[] {'b', 'd', 'f', 'h', 'j', 'l','n','p','r','t','v','x','z'};   
        char b = 'a';                                                   
        int i = 0;                                                      
        int j = 0;                                                      
        for(i = 0; i < n; i++)
        {
            Boolean statement = true;
            for(j = 0; j < omitArray.length; j++)
            {
                if(b == omitArray[j])
                {
                    i--;
                    statement = false;
                    break;
                }
            }
            if(statement)
            {
                charArray[i] = b;
            }
            b++;
        }
        for(int k = 0; k < n; k++){
            System.out.print(charArray[k] + "\t");
        }
        System.out.println();
        for (int c = charArray.length-1; c >= 0; c--) 
        	System.out.print(charArray[c]+ "\t");
       
    }

}


		
	


