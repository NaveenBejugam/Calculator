package com.simplilearn;

import java.util.Scanner;

public class ArithematicCalculator {
	public static void main(String[] args)
	{
		int num1, num2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println("Choose the required operation:");
		int operation = input.next().charAt(0);
		
		switch (operation)
		{
		case '1' :
			result = num1+num2;
			System.out.println("Addition result: "+result);
			break;
		case '2' :
			result = num1-num2;
			System.out.println("Subtraction result: "+result);
			break;
		case '3' :
			result = num1*num2;
			System.out.println("Multiplication result: "+result);
			break;
		case '4' :
			result = num1/num2;
			System.out.println("Division result: "+result);
			break;
		default:
			System.out.println("Invalid operation");
			
		}
	}	
	
}


	


