package com.bridgelabz.CouponNumber;

import java.util.Scanner;

public class CouponNumber {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number which you want to Generate coupons");
			int numberOfCoupons = scanner.nextInt();
			scanner.close();
			
			generateCoupons(numberOfCoupons);
			
			
	}

	private static void generateCoupons(int numberOfCoupons) {
		// TODO Auto-generated method stub
		int[] CouponCodes ;
		CouponCodes = new int[numberOfCoupons];
		int countOfCoupons = 0;
		
		while (countOfCoupons < numberOfCoupons) {
			int code = (int) Math.floor(Math.random() *10000);

			boolean couponInCouponCodes = false;
			
			for (int i=0; i<CouponCodes.length; i++) {
				if(code == CouponCodes[i]) {
					couponInCouponCodes = true;
				}
			}
			if(!(couponInCouponCodes)) {
				CouponCodes[countOfCoupons++] = code;		
			}		
		}
		System.out.println("The generated coupons are "+Arrays.toString(CouponCodes));
		
	}

}
