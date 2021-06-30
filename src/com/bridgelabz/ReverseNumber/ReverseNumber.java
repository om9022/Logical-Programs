package com.bridgelabz.ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number which you want to reverse");
		int number = scanner.nextInt();
		scanner.close();
		
		int reverse = 0;
		while (number != 0) {
			reverse = reverse*10 + reverse%10;
			number = number/10;
		}
		System.out.println("The reverse number is "+reverse);
	}

}
