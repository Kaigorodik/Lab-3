package project07_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class project07_10 {
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
	        }
	        int n = nums.length;	
			int temp;
	 
			for (int i = 0; i < n/2; i++) {
			    temp = nums[n-i-1];
			    nums[n-i-1] = nums[i];
			    nums[i] = temp;
			}
			
			for (int i=0; i<nums.length; i++){
				System.out.println("Array element ["+i+"] after sorting = " +nums[i]);
	        }
	        }   
		}


