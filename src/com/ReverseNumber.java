package com;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
				
		int num;
		int remainderNum = 0;
		int reverseNum = 0;
			   
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number:");
		num = input.nextInt();

		while(num != 0)
			{
			    remainderNum = num % 10;
			    reverseNum = reverseNum * 10 + remainderNum;
			    num = num / 10;
			      
			 }

			  System.out.println("Reverse of your number is:  " + reverseNum);
				
			  input.close();
			}	

}
