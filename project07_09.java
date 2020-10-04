package project07_09;
import java.util.Arrays;
import java.util.Random; 
import java.util.Scanner;

public class project07_09 {

	public static void main(String[] args) {
		    Scanner id=new Scanner(System.in);
	        System.out.println("Input the size of the array: ");
	        int Size = id.nextInt();
	        int[] nums = new int[Size];
	        Random random = new Random();
	        for (int i = 0 ; i < nums.length ; i++ ){
	        	nums[i]=random.nextInt(200);	
	        }
	        Arrays.sort(nums);
	        for (int i = 0 ; i < nums.length ; i++ ){
	        System.out.println("Array element ["+i+"] after sorting = " + nums[i]);
	        }
		        int min = nums[0];
		        for(int i = 0; i != nums.length; i ++){
		            if(nums[i] < min){
		                min = nums[i];
		            }
		        }
		    System.out.println("Element with minimum value [0] = " + min);       
	        }    
	}
