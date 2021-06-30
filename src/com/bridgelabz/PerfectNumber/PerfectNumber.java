package com.bridgelabz.PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number which you want to perfect number");
		int number = scanner.nextInt();
		scanner.close();

		int sumOfNum = 0;
		for (int i=1; i< number; i++) {
			if(number%i == 0)
			{
				sumOfNum += i;
			}
			
		}
		if (sumOfNum == number) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not Perfect Number");

		}
	}

}
