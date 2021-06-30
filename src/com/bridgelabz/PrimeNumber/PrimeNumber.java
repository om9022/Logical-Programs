package com.bridgelabz.PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number which you want to check prime Number");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number < 2) {
			System.out.println("Its not prime Number");
		}
		else if(number == 2) {
			System.out.println("Its even prime Number");		
		}
		else {
			checkPrime(number);
				
		}
}

	private static void checkPrime(int number) {
		// TODO Auto-generated method stub
		boolean is_prime = true;
		
		for(int i=2; i <number; i++) {
			if (number%i == 0) {
				is_prime = false;
				break;
			}
		}
		if(is_prime) {
			System.out.println("Its a Prime Number");
		}
		else {
			System.out.println("Its not Prime Number");
			
		}
	}

}
