package com.bridgelabz.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number which you want to print fibonacci series ");
		int number = scanner.nextInt();
		scanner.close();
		
		int prevNumber = 0;
		int currentNumber = 1;
		System.out.println(prevNumber+","+currentNumber);
		FibonacciSeries( number, prevNumber, currentNumber );
		
		
	}

	private static void FibonacciSeries(int number, int prevNumber, int currentNumber) {
		// TODO Auto-generated method stub
		int nextNumber;
		for(int i=0; i<= number-2; i++) {
			nextNumber = prevNumber + currentNumber;
			System.out.println(","+nextNumber);
			prevNumber = currentNumber;
			currentNumber = nextNumber;
		}
	}

}
